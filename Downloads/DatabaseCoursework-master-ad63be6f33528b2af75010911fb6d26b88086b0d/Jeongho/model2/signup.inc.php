<?php
if (isset($_POST['SignUpSubmit'])) {
    if ($_POST['password'] != $_POST['passwordConfirm'])
    {
        header("Location: ".$_SERVER['HTTP_REFERER']."?error=2");
        exit();
    } else {
        $hashedPassword = password_hash($_POST['password'], PASSWORD_DEFAULT);
    }
    try
    {
        $pdo = new PDO("mysql:host=kunet;dbname=db_k1741900", "k1741900" ,"apple1", [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);
        $stmt = $pdo->prepare('SELECT * FROM Customers WHERE emailUsers=?');
        $stmt->bindParam(1, $_POST['emailAddress'], PDO::PARAM_STR);
        $stmt->execute();
        $row = $stmt->fetch(PDO::FETCH_ASSOC);
        if($row['emailUsers'] == $_POST['emailAddress'])
        {
            header("Location: ".$_SERVER['HTTP_REFERER']."?error=1");
            exit();
        } else {
            $formEmailAddress = $_POST['emailAddress'];
        }
    }
    catch(PDOException $e)
    {
        echo ("There was an error checking the database. Please contact the web developer, he probably broke something.<br><br>".$e->getMessage());
    }
    $formCompanyName = $_POST['companyName'];
    $formContactName = $_POST['contactName'];
    $formCompanyAddress = $_POST['companyAddress'];
    $formContactNumber = $_POST['contactNumber'];
    try 
    {
        //$pdo = new PDO("mysql:host=kunet;dbname=db_k1741900", "k1741900" ,"apple1", [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);
        $sql_template = "INSERT INTO Customers (`company_name`,`contact_name`,`companyAddress`,`contact_no`,`pwdUsers`,`emailUsers`)VALUES(?,?,?,?,?,?)";
    
        $sql_statement = $pdo->prepare($sql_template);
        $sql_statement->execute([$formCompanyName,$formContactName,$formCompanyAddress,$formContactNumber,$hashedPassword,$formEmailAddress]);
        echo ("Your account has been created. Welcome to Berwyn Buses, ".$formContactName."!");
    }
    catch(PDOException $e)
    {
        echo ("There was an error creating your account. Please contact the web developer, he probably broke something.<br><br>".$sql_insert."<br>".$e->getMessage());
    }
} else {
    echo ("You have not used the form to access this page. You cheat.");
}
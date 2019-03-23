
 <div id="content">
      <?php
      if(isset($_GET['about'])) 
      {
            include 'includers/about.php';
      }
      else if(isset($_GET['bookings'])) 
      {
 	      include 'includers/bookings.php';
      }
      ?>
 </div>

 <main>

      <h1>Sign Up Form</h1><br>
      <form action="includers/signup.inc.php" mehtod="post">
            <br><p>Company Name:</p><input type="text" name="companyName" placeholder="Business Limited">  
            <br><p>Contact Name:</p><input type="text" name="contactName" placeholder="joeblogs123">
            <br><p>Company Address:</p><input type="text" name="companyAddress" placeholder="123 House Road, Town, City, P0ST C0D3">
            <br><p>Contact Number:</p><input type="text" name="contactNumber" placeholder="01182549986">
            <br><p>Email Address:</p><input type="text" name="email" placeholder="joeblogs@123.com">
            <br><p>Password:</p><input type="password" name="password" placeholder="password">
            <br><p>Confirm Password:</p><input type="passwordConfirm" name="passwrdconfirm" placeholder="repeat password">
            <br><p></p><button type="submit" name="SignUpSubmit">Sign Up</button>
      </form>



</main>


<footer>
<p>This is a footer</p>
</footer>


</body>
</html>
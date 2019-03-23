<!doctype html>
<html>
    <head>
        <title>log-in page</title>
        <style>
            .field {
                padding:15px;
            }
            form {display: inline-block; background-color: #ffc107; color: #000; width: 400px;}
            
            .label {margin-bottom: 8px;}
        </style>
    </head>
    <body background="background6.jpg">
        <p>Hello my account (log-in)!</p>
            <form method="post" action="">
            
            <h2>Berwyn Bus log-in</h2>

            <div class="field">
                username: <input type="text" name="username" placeholder="username" required />
            </div>

            <div class="field">
                password: <input type="password" name="password" required />
            </div>

            <div class="field">
                <input type="submit" value="login" />
                <button id="signup"><a href="signup.php">sign up </a></button><br/>
            </div>
    </body>
</html>
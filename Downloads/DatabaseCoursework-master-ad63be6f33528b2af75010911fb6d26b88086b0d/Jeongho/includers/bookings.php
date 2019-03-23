<?php
require "header.php";
?>

<main>

<div>
<form action="includers/book.php" method="post">
<input type="text" name="email" placeholder="Username/Email">
<input type="password" name="password" placeholder="Password">
<button type="submit" name="login">Login</button>
</form>
<a href="signup.php">Sign Up</a>

<form action="includers/logout.php" method="post">

<button type="submit" name="logout">Logout</button>
</form>


</div>

</main>

<?php

$months = array (" ","Janurary","February","March","April","May","June","July","August","September","October","November","December")
?>



<select>
<?php 
for($x=1;$x<=12;$x++) {
	echo "<option name='$x'>$months[$x]
	      </option>";
}
?>
</select>

<select>
<?php
for($x=1;$x<=31;$x++) {
	echo "<option>$x </option>";
}
?>
</select>

<select>
<?php
for($x=2019;$x<=2030;$x++) 
{
	echo "<option>$x </option>";
} 
?>
</select>
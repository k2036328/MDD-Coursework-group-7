<?php include 'includers/header.php'; ?>

 <div id="content">
      <h3>Content</h3>
      <?php
      if(isset($_GET['about'])) 
      {
            include 'includers/about.php';
      }
      else if(isset($_GET['bookings'])) 
      {
 	      include'includers/bookings.php';
      }
      ?>
 </div>

 <main>
 <?php
 if(isset($_SESSION['userID'])) {
    echo '<p class="login-status">You are logged in!</p>'; 
 }
 else {
      echo '<p class="login-status">You are logged out!</p>';
 }

 ?>

</main>


 <footer>
 <p> This is a footer</p>
 </footer>


</body>
</html>
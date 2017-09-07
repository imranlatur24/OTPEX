<?php
 define('HOST','localhost');
 define('USER','root');
 define('PASS','imran786');
 define('DB','otp');
 
 //Connecting to database
 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');
?>

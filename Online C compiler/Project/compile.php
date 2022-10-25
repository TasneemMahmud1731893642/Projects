

<?php

	$languageID=$_POST["language"];
        error_reporting(0);


	if($_FILES["file"]["name"]!="")
	{
		include "compilers/make.php";
	}
	else
	{
		switch($languageID)
			{
				case "c":
				{
					include("compilers/c.php");
					break;
				}
				
				case "java":
				{	
					include("compilers/java.php");
					break;
				}
				
			}
	}
?>



<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Online Compiler</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="icon" type="image/png" href="https://upload.wikimedia.org/wikipedia/commons/5/5c/North-South-University-logo-03.png">
        <script src="js/vendor/modernizr-2.8.3.min.js"></script>
        <script src="js/vendor/jquery-1.12.0.min.js"></script>
</head>
<body style="background-color: #660000">
<div class="main" style="background-color: #660000">
  <div class="row">
  <div class="col-md-12">
  <nav class="navbar navbar-inverse navbar-fixed-top nbar">
    <div class="navbar-header">
      <a class="navbar-brand lspace" href="home.php">CodeJam</a>
    </div>
    <ul class="nav navbar-nav navbar-right  " style="margin-right: 20px">
      <li class="space"><a href="compiler.php">Compiler</a></li>
      <li class="space"><a href="archive.php">About</a></li>
      <li class="space"><a href="contest.php">Suggestion Box</a></li>
    </ul>
</nav>
</div>
</div>
<div class="row cspace">
<div class="col-md-12" style="margin-right: 100px">
<div class="form-group" style="margin-top: 60px;background-color: #660000">
<div class="col-md-12" style="padding-right: 300px;padding-left: 150px">
    <form action="compile.php" id="form" name="f2" method="POST" >
<label for="lang" style="color: white">Choose Language</label>
<select class="form-control" name="language">
<option value="c">C</option>
<option value="java">Java</option>
</select><br><br>
<label for="ta" style="color: white">Write Your Code</label>
<textarea class="form-control" name="code" rows="12" cols="30"></textarea><br><br>
<label for="in" style="color: white">Enter Your Input</label>
<textarea class="form-control" name="input" rows="12" cols="30"></textarea><br><br>
 <input type="submit" id="st" class="btn btn-success" value="Run Code"><br><br><br>
</form>
    </div>
    <div class="col-md-12" style="padding-right: 300px;padding-left: 150px">
    <label for="out" style="color: white">Output</label>
<textarea id='div' class="form-control" name="output" rows="12" cols="10"></textarea><br><br>
    </div>
<script type="text/javascript">
  $(document).ready(function(){
     $("#st").click(function(){
           $("#div").html("Loading ......");
     });
  });
</script>

<script>
//wait for page load to initialize script
$(document).ready(function(){
    //listen for form submission
    $('form').on('submit', function(e){
      //prevent form from submitting and leaving page
      e.preventDefault();

      // AJAX 
      $.ajax({
            type: "POST", 
            cache: false, 
            url: "compile.php", 
            datatype: "html", 
            data: $('form').serialize(), 
            success: function(result) { 
                $('#div').html(result);
            }
        });
    });
});
</script>
</div>
</div>
<div class="col-md-4">
</div>
</div>
</div>
<br><br><br>
<div class="area">
<div class="well foot" style="border-color: #222222;margin-top: -30px">
<div class="row area">
<div class="col-md-3">
</div>
<div class="col-md-5">
<div class="fm">
<b>PROJECT BY</b><br>
<b>GROUP-10</b>
</div>
</div>
</div>
</div>
</div>
</div>
</body>
</html>



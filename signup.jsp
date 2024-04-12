<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#ot{
background_color:red;
}

#fr{
display:flex;
justify-content:center;
align-items:center;
margin:10px;
padding:10px;
width:200px;
height:200px;
background_color:red;
border-radius:10px;
}
#ot{
display:flex;
justify-content:center;
}
body{
background-color:#90EE90;
}
button {
    background-color: #013220;
    color: white;
    cursor: pointer;
    border: none;
    border-radius:10px;
    padding: 12px 24px; 
    font-size: 16px;
}
input{
width:300px;
height:30px;
padding:10px;
border-radius:10px;
margin-top:10px;
font-size:20px;
}


</style>
</head>
<body>
<div id="ot">
<div id="fr">
	<form id="frm" action="signup" method="post">
		<input type="text" name="un" placeholder="Enter Username"><br>
		<input type="password" name="ps" placeholder="Enter Password"><br>
		<input type="email" name="em" placeholder="Enter Email"><br>
		<button type="submit" style="margin-left:110px;margin-top:10px" >Submit</button>
	</form>
</div>
</div>
<script src="https://code.jquery.com/jguery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSF1Bw8HfCJo=" crossorigin="anonymous">
	</script>

<script>
$(document)ready(function(){
	console.log("ready");
	$("#frm").on("submit",function(event){
		event.preventDefault();
		var f=$(this).serialize();
		console.log(f);
		$.ajax({
			url:"register",
			data:f,
			type:'POST',
			success: function(data,textStatus,jqXHR){
				console.log(data);
				console.log("success");
			},
			error: function(jqXHR,textStatus,errorTHROWN){
				console.log(data);
				console.log("fail");
			}
		
		})
	})
	
})

</script>
</body>
</html>
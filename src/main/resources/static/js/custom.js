$(document).ready(function(){
	$("#customerSubmit").click(function(){
		var customerName = $("#customerName").val();
		var customerAddr = $("#customerAddr").val();
		var phone = $("#phone").val();
		var sendInfo = {
				"name":customerName,
				"address":customerAddr,
				"phone":phone
			}
		console.log(sendInfo);
		console.log("customerName:"+customerName + " customerAddr:"+customerAddr+" phone:"+phone);
		$.ajax({
			url:"/customer",
			type:"post",
			dataType: "json",
			data: JSON.stringify(sendInfo),
			contentType:"application/json; charset=utf-8",
			success: function(data,status){
				alert("data: "+data+"\n status: "+status);
			}
					
		});
		
		
	});
});
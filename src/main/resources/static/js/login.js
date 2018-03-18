function validateForm(){
	var username = document.forms['loginForm']['username'].value;
	
	if(username==""){
		alert("Name must be filled out");
		return false;
	}
	return true;
}


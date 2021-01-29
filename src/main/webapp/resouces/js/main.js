function checkReqFields(){
	var returnValue = true;
	var date1 = document.getElementById("txtReqFieldsNS").value;
    var today = new Date();
    var birthDate = new Date(date1);
    var age = today.getFullYear() - birthDate.getFullYear();
    var regexDate = /^(0?[1-9]|[12][0-9]|3[01])[\/\/](0?[1-9]|1[012])[\/\/]\d{4}$/;
		var fields = document.getElementById("txtReqFields").value;
		var fieldsNS = document.getElementById("txtReqFieldsNS").value;
		var fieldsML = document.getElementById("txtReqFieldsML").value;
		var date = document.getElementById("txtReqFieldNH").value;
		document.getElementById("messReqFieldNH").innerHTML = "";
		document.getElementById("txtReqFieldML").innerHTML = "";
		document.getElementById("txtReqField").innerHTML = "";
		document.getElementById("txtReqFieldNS").innerHTML = "";
		if(fieldsML.trim() == ""){
			document.getElementById("txtReqFieldML").innerHTML="* Vui lòng nhập thông tin!.";
			returnValue=false;
		}
		if(fields.trim() == ""){
			document.getElementById("txtReqField").innerHTML="* Vui lòng nhập thông tin!.";
			returnValue=false;
		}
		if(fieldsNS.trim() == ""){
			document.getElementById("txtReqFieldNS").innerHTML="* Vui lòng nhập thông tin!.";
			returnValue = false;
		}
		 if (age < 2) {
			document.getElementById("txtReqFieldNS").innerHTML = "* Tuổi của trẻ không hợp lệ!.";
			returnValue = false;
			}
		 if (regexDate.test(date)==false) {
				document.getElementById("messReqFieldNH").innerHTML="* Format Ngày vào học là DD/MM/YYYY !.";
				returnValue = false;
			}
		return returnValue;
}






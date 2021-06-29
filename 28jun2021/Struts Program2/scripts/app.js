/**
 * 
 */
function update(id,name,mobileno,city){
	console.log(id,name,mobileno,city)
	document.forms[0].id.value=id;
	document.forms[0].name.value=name;
	document.forms[0].mobileno.value=mobileno;
	document.forms[0].city.value=city;
}

function deletedata(sno){
	location.href="simpleform.do?id="+sno+"&method=delete";
} 

function getJson(meta) {
	return meta.json();
}

function getTxtFromJsonUndPackInsHTML(myjson) {
	var tabelle = document.getElementById("tid001");
	//var i = 2;
	for (var laufvariable of myjson.personen) {
    		// new element in the table
    		tabelle.insertAdjacentHTML("beforeend",
    		"<tr>"
    			//+ `<td> ${++i}</td>`
    			+ "<td>" + laufvariable.id + "</td>"
    			+ "<td><img src='" + getImg(laufvariable.salutation) + "'></td>"
    			+ "<td>" + laufvariable.salutation + "</td>"
    			+ "<td>" + laufvariable.name + "</td>"
    			+ "<td>" + laufvariable.surname +"</td>"
    			+ "<td>" + laufvariable.email + "</td>"
    		+ "</tr>")
}
}


function getImg(salutation) {
	switch (salutation) {
		case "Mr":
			return 'images/david.png';
		case "Mrs":
		case "Miss":
			return 'images/women.png';
		default:
			return 'images/frage.png';
	}
}

function createPerson(event) {   // bei event-click
	event.preventDefault();      // verhindert dass das event von Browser verwendet wird (verhindert GET-Request)
	console.log("click");
	var id = document.getElementById("id0011").value;
	var salutation = document.getElementById("salutation").value;
	var name = document.getElementById("name").value;
	var surname = document.getElementById("surname").value;
	var email = document.getElementById("email").value;
	var jsonDataString = `{"id":"${id}","salutation":"${salutation}","name":"${name}","surname":"${surname}","email":"${email}"}`;
	console.log(jsonDataString);

	fetch("http://localhost:8080/json/person", {
		method: 'POST',
		body: jsonDataString,
		headers: {
			'Content-Type': 'application/json'
        }
	});
}





function removePerson (event){
event.preventDefault();
var id = document.getElementById("id0011").value;
    console.log(id);
    fetch(`http://localhost:8080/json/person/${id}`, {
        		method: 'DELETE'
        	});
	}



//POST
var input = document.getElementById("button");
input.addEventListener("click",createPerson);

//DELETE
var input = document.getElementById("buttonremove");
input.addEventListener("click",removePerson);

fetch("http://localhost:8080/json/persons/all")
	.then(getJson)
	.then(getTxtFromJsonUndPackInsHTML)

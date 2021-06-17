
function getJson(irgendwas) {
	return irgendwas.json();
}

function getTxtFromJsonUndPackInsHTML(myjson) {
	var tabelle = document.getElementById("tid001");
	var i = 2;
	for (var laufvariable of myjson.personen) {
    		// new element in the table
    		tabelle.insertAdjacentHTML("beforeend", "<tr>"
    			+ `<td> ${++i}</td>`
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

function submitClick(event) {
	event.preventDefault();          // GET Request
	console.log("click");
	var salutation = document.getElementById("salutation").value;
    console.log(salutation);
	var name = document.getElementById("name").value;
	console.log(name);
	var surname = document.getElementById("surname").value;
	console.log(surname);
	var jsondata = `{"salutation": "${salutation}", "name": "${name}", "surname": "${surname}"}`;
    	console.log(jsondata);
fetch("http://localhost:8080/json/person", {
		method: 'POST', // or 'PUT'
		body: jsondata,
		headers: {
			'Content-Type': 'application/json'
		}
	});

}

var input = document.getElementById("button");
input.addEventListener("click",submitClick);

fetch("http://localhost:8080/json/persons/all")
	.then(getJson) 								//  entspricht: .then( irgendwas => irgendwas.json() )
	.then(getTxtFromJsonUndPackInsHTML)

function removePerson (event){
event.preventDefault();
console.log("click");
var id = document.getElementById("id0011").value;
    console.log(id);
    fetch(`http://localhost:8080/json/person/${id}`, {
        		method: 'DELETE'
        	});
	}

var input = document.getElementById("remove");
input.addEventListener("click",removePerson);
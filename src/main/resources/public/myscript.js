var para = document.getElementById("id4711");
para.textContent = "Hello from JavaScript";

function getJson(irgendwas) {
	return irgendwas.json();
}

function getTxtFromJsonUndPackInsHTML(myjson) {
	var tabelle = document.getElementById("tid001");
	for (var laufvariable of myjson.personen) {
    		// new element in the table
    		tabelle.insertAdjacentHTML("beforeend", "<tr>"
    			+ "<td>3</td>"
    			+ "<td><img src='images/david.png' width='90' height='111'/></td>"
    			+ "<td>" + laufvariable.salutation + "</td>"
    			+ "<td>" + laufvariable.name + "</td>"
    			+ "<td>" + laufvariable.surname + "</td>"
    			+ "</tr>")
}
}

function getImg(salutation) {
	switch (salutation) {
		case "Mr":
			return 'images/david.png';
		case "Mrs":
		case "Miss":
			return 'images/woman.png';
		default:
			return 'images/woman.png';
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
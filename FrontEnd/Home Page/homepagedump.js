window.addEventListener('load', populateDropdowns);

async function getAirlineCodes() {
    const url = "http://localhost:8080/airlineCodes"; 
    const options = {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        }
    };

    try {
        const response = await fetch(url, options);
        const result = await response.json();
        return result; 
    } catch (error) {
        console.error(error);
    }
}

async function getLocations() {
    const url = "http://localhost:8080/locations"; 
    const options = {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        }
    };

    try {
        const response = await fetch(url, options);
        const result = await response.json();
        return result;
    } catch (error) {
        console.error(error);
    }
}

async function populateDropdowns() {
    let airlineCodes = await getAirlineCodes(); 
    let locations = await getLocations(); 

    var preferredAirlineDropdown = document.getElementById("preferredAirlineDropdown");

    for (let i = 0; i < airlineCodes.length; i++) {
        var opt = document.createElement("option"); 
        opt.text = airlineCodes[i];           
        preferredAirlineDropdown.add(opt);
    }

    var originDropdown = document.getElementById("originDropdown");

    for (let i = 0; i < airlineCodes.length; i++) {
        var opt = document.createElement("option"); 
        opt.text = locations[i];           
        originDropdown.add(opt);
    }

    var destinationDropdown = document.getElementById("destinationDropdown");

    for (let i = 0; i < airlineCodes.length; i++) {
        var opt = document.createElement("option"); 
        opt.text = locations[i];           
        destinationDropdown.add(opt);
    }
    
}
var searchButton = document.getElementById("searchButton");
searchButton.addEventListener('click', createNewSearchBox);
function createNewSearchBox() {
    var resultBox = document.createElement("div");
    resultBox.classList.add("resultBox");

    var fields = [
        "Preferred Airline",
        "Travel Type",
        "Available Seats",
        "Origin",
        "Destination",
        "Depart Date",
        "Return Date",
        "Queuing Office",
        "Reserve Seats"
    ];

    fields.forEach(function (field) {
        var fieldBox = createFieldBox(field);
        resultBox.appendChild(fieldBox);
    });

    var searchButton = document.getElementById("searchButton");
    searchButton.parentNode.insertBefore(resultBox, searchButton.nextSibling);
}

function createFieldBox(labelText) {

    var fieldBox = document.createElement("div");
    fieldBox.classList.add("fieldBox"); 

    var label = document.createElement("label");
    label.textContent = labelText;

    var inputField = document.createElement("input");
    inputField.type = "text"; 

    fieldBox.appendChild(label);
    fieldBox.appendChild(inputField);

    return fieldBox;
}



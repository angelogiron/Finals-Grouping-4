window.addEventListener('load', populateDropdowns);

var userInputArray = [];

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

    for (let i = 0; i < locations.length; i++) {
        var opt = document.createElement("option");
        opt.text = locations[i];
        originDropdown.add(opt);
    }

    var destinationDropdown = document.getElementById("destinationDropdown");

    for (let i = 0; i < locations.length; i++) {
        var opt = document.createElement("option");
        opt.text = locations[i];
        destinationDropdown.add(opt);
    }

}

var searchButton = document.getElementById("searchButton").addEventListener("click", getFlightOffers);

async function getFlightOffers(event) {
    event.preventDefault();

    const preferredAirline = document.getElementById("preferredAirlineDropdown").value;
    const origin = document.getElementById("originDropdown").value;
    const destination = document.getElementById("destinationDropdown").value;
    const departDate = document.getElementById("departDate").value;
    const returnDate = document.getElementById("returnDate").value;
    const passengerCount = document.getElementById("passengerCount").value;


    const url = 'http://localhost:8080/flight-offers';
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            "originLocation": origin,
            "destinationLocation": destination,
            "departureDate": departDate,
            "arrivalDate": returnDate,
            "passengerCount": passengerCount,
            "airlineCode": preferredAirline,
        }),
    };

    try {
        const response = await fetch(url, options);
        const result = await response.text();

        if (response.ok) {
            console.log(result);
        } else {
            console.error(result);
        }
    } catch (error) {
        console.error(error);
    }
}

searchButton.addEventListener('click', function (event) {
    event.preventDefault();
    var userInput = {};

    userInput["Travel Type"] = document.getElementById("travelType").value;
    userInput["Preferred Airline"] = document.getElementById("preferredAirlineDropdown").value;
    userInput["Origin"] = document.getElementById("originDropdown").value;
    userInput["Destination"] = document.getElementById("destinationDropdown").value;
    userInput["Depart Date"] = document.getElementById("departDate").value;
    userInput["Return Date"] = document.getElementById("returnDate").value;


    userInputArray.push(userInput);
    createNewSearchBox();
});

function createNewSearchBox() {
    var resultBox = document.createElement("div");
    resultBox.classList.add("resultBox");

    userInputArray.forEach(function (userInput) {
        Object.keys(userInput).forEach(function (key) {
            var fieldBox = createFieldBox(key, userInput[key]);
            resultBox.appendChild(fieldBox);
        });
    });

    var searchButton = document.getElementById("searchButton");
    searchButton.parentNode.insertBefore(resultBox, searchButton.nextSibling);
}

function createFieldBox(labelText, inputValue) {
    var fieldBox = document.createElement("div");
    fieldBox.classList.add("fieldBox");

    var label = document.createElement("label");
    label.textContent = labelText;

    var inputField = document.createElement("input");
    inputField.type = "text";
    inputField.value = inputValue;

    fieldBox.appendChild(label);
    fieldBox.appendChild(inputField);

    return fieldBox;
}



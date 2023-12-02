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



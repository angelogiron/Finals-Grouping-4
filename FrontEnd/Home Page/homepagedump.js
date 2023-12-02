document.addEventListener('DOMContentLoaded', function () {
    search();

    const searchButton = document.getElementById('searchButton');
    searchButton.addEventListener('click', function () {
        search();
    });
});

async function search() {
    fetch('http://localhost:8080/airlineCodes')
        .then(response => response.json())
        .then(data => populateDropdown('preferredAirlineDropdown', data, 'preferredAirline'));

    fetch('http://localhost:8080/locations')
        .then(response => response.json())
        .then(data => populateDropdown('originDropdown', data, 'origin'));

    fetch('http://localhost:8080/locations')
        .then(response => response.json())
        .then(data => populateDropdown('destinationDropdown', data, 'destination')); 
}

function populateDropdown(dropdownId, data, propertyName) {
    const dropdown = document.getElementById(dropdownId);

    dropdown.innerHTML = '<option value="" disabled selected>Select ' + propertyName.charAt(0).toUpperCase() + propertyName.slice(1) + '</option>';

    data.forEach(item => {
        const option = document.createElement('option');
        option.value = item[propertyName];
        option.text = item[propertyName];
        dropdown.appendChild(option);
    });
}



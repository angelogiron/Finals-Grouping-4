var searchButton = document.getElementById("Search");
searchButton.addEventListener('click', createNewSearchBox);

function createNewSearchBox() {
    var container = document.createElement("div");
    container.classList.add("container");

    var fields = [
        "Booking Reference Number",
        "Booking Date",
        "Date and Time",
        "Flight Number",
        "Aircraft",
        "Name",
        "Email",
        "Phone Number",
        "Passport Details"
    ];

    fields.forEach(function (field) {
        var fieldBox = createFieldBox(field);
        resultBox.appendChild(fieldBox);
    });

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

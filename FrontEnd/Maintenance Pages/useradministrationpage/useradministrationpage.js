async function getEmails(){
    const url = "http://localhost:8080/admin/get-emails"
    const options =
    {
        method: 'GET',
        headers:
        {
            'Content-Type': 'application/json'
        }
    };
    try {
        const response = await fetch(url, options);
        const result = await response.json();
        console.log(result);
        return result;
    }
    catch (error) {
        console.error(error);
    }
}

async function displayUsers() {
    const userContainer = document.getElementById("result-boxes");
    const emails = await getEmails();

    emails.forEach(email => {
        const userDiv = document.createElement("div");
        userDiv.classList.add("user-container");

        const userNameElement = document.createElement("h2");
        userNameElement.textContent = email.userName;

        const roleDropdown = document.createElement("select");
        roleDropdown.classList.add("role-dropdown");

        const adminOption = document.createElement("option");
        adminOption.value = "admin";
        adminOption.textContent = "Admin";

        const guestOption = document.createElement("option");
        guestOption.value = "guest";
        guestOption.textContent = "Guest";
        roleDropdown.appendChild(adminOption);
        roleDropdown.appendChild(guestOption);

        const actionButtonsDiv = document.createElement("div");
        actionButtonsDiv.classList.add("action-buttons");

        const activateButton = document.createElement("button");
        activateButton.classList.add("activate-button");
        activateButton.textContent = "Activate Account";

        const deactivateButton = document.createElement("button");
        deactivateButton.classList.add("deactivate-button");
        deactivateButton.textContent = "Deactivate Account";

        actionButtonsDiv.appendChild(activateButton);
        actionButtonsDiv.appendChild(deactivateButton);
        userDiv.appendChild(userNameElement);
        userDiv.appendChild(roleDropdown);
        userDiv.appendChild(actionButtonsDiv);

        userContainer.appendChild(userDiv);
    });
}

displayUsers();
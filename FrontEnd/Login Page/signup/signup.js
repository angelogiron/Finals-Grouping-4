document.getElementById("submit").addEventListener("click", signUpAccount);

async function signUpAccount(event) 
{
    event.preventDefault();

    const accountName = document.getElementById("name").value;
    const accountBirthday = document.getElementById("birthday").value;
    const accountPhoneNumber = document.getElementById("phone").value;
    const accountPassportDetails = document.getElementById("passport").value;
    const accountEmail = document.getElementById("email").value;
    const accountPassword = document.getElementById("password").value;
    
    const url = 'http://localhost:8080/signup'; 
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            "accountName": accountName,
            "accountBirthday": accountBirthday,
            "accountPhoneNumber": accountPhoneNumber,
            "accountPassportDetails": accountPassportDetails,
            "accountEmail": accountEmail,
            "accountPassword": accountPassword,
        }),
    };

    try {
            const response = await fetch(url, options);
            const result = await response.json();
            console.log(result);
        } catch (error) 
        {
            console.error(error);
        }
}


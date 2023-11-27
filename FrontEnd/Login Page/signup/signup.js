document.getElementById("submit").addEventListener("click", submitAccount);
function submitAccount(){
    let email = document.getElementById("email");
    let password = document.getElementById("password");
    let birthday = document.getElementById("birthday");
    let name = document.getElementById("name");
    let phoneNum = document.getElementById("phone");
    let passport = document.getElementById("passport");

    generateAccount(email, password, birthday, name, phoneNum, passport);
}

async function generateAccount(email, password, birthday, name, phoneNum, passport){
    const url = 'http://localhost:8080/signup';
    const options = {
        method: 'POST',
        headers: {
            'Content-type':'application/json'
        },
        body: JSON.stringify(
            {
                "accountName": "name",
                "accountBirthday": "birthday",
                "accountPhoneNumber": "1",
                "accountPassportDetails": "2",
                "accountEmail": "email",
                "accountPassword": "password"
            }
        )
    };

    try {
        const response = await fetch(url, options);
        const result = await response.json();
        console.log(result);
    } catch (error) {
        console.error(error);
    }
}
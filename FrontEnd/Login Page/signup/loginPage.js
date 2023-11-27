document.getElementById("login-button").addEventListener("click", login);

async function login(event) 
{
    event.preventDefault();

    const accountName = document.getElementById("input-username").value;
    const accountPassword = document.getElementById("input-passowrd").value;

    const url = 'http://localhost:8080/login';
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            "accountEmail": accountName,
            "accountPassword": accountPassword,
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

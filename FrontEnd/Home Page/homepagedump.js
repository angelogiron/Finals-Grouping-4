document.getElementById("search").addEventListener("click", login);

async function search(event) 
{
    event.preventDefault();

    const url = 'http://localhost:8080/getAirlineLocation'; 
    const options = {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
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

document.getElementById("sync-button").addEventListener("click", syncAirlines);

async function syncAirlines() {
    const airlines = [];
    var br = document.getElementById("br");
    var pr = document.getElementById("pr");
    var cx = document.getElementById("cx");
    var vn = document.getElementById("vn");
    var ke = document.getElementById("ke");
    var nh = document.getElementById("nh");
    var oz = document.getElementById("oz");
    var zp = document.getElementById("zp");
    var twop = document.getElementById("2p");
    var jx = document.getElementById("jx");

    if(br.checked == true){
        airlines.push(document.getElementById("br").value);
    }
    if(pr.checked == true){
        airlines.push(document.getElementById("pr").value);
    }
    if(cx.checked == true){
        airlines.push(document.getElementById("cx").value);
    }
    if(vn.checked == true){
        airlines.push(document.getElementById("vn").value);
    }
    if(ke.checked == true){
        airlines.push(document.getElementById("ke").value);
    }
    if(nh.checked == true){
        airlines.push(document.getElementById("nh").value);
    }
    if(oz.checked == true){
        airlines.push(document.getElementById("oz").value);
    }
    if(zp.checked == true){
        airlines.push(document.getElementById("zp").value);
    }
    if(twop.checked == true){
        airlines.push(document.getElementById("2p").value);
    }
    if(jx.checked == true){
        airlines.push(document.getElementById("jx").value);
    }

    const url = "http://localhost:8080/admin/airlines/delete"
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
            } 
        catch (error) 
            {
                console.error(error);
            }


    for(let i = 0; i < airlines.length; i++) {
        const url = "http://localhost:8080/admin/airlines/sync/" + airlines[i]; 
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            }
        };
        try {
                const response = await fetch(url, options);
                const result = await response.json();
                console.log(result);
            } 
        catch (error) 
            {
                console.error(error);
            }
        }
}

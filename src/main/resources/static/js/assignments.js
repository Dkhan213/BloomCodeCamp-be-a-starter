fetch('http://localhost:8080/api/v1/assignments')
    .then((response) => {
        console.log('resolved', response);
        return response.json();
    }).then(data => {
        console.log(data);
        const html = data.map(assignment => {
            return `
            <div class="assignment">
                <p>Assignment Number: ${assignment.number}</p>
                <p>Status: ${assignment.status}</p>
                <p>Branch: ${assignment.branch}</p>
                <p>Github URL: ${assignment.githubUrl}</p>
                <p>Review Video URL: ${assignment.reviewVideoUrl}</p>
                <p>User: ${assignment.user.username}</p>
            </div>
            `;
        })
        .join("");
        console.log(html);
        document.querySelector("#assignments").insertAdjacentHTML("afterbegin", html);
    })
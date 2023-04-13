{/* <html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Please sign in</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"
        media="">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"
        media="">
    <link rel="stylesheet" href="Login.css">
</head> */}

<body>
    <h2 class="form-signin-heading">SIGN IN TO REVIEWTILIZE</h2>
    <div class="container">
        <form class="form-signin" method="post" action="http://localhost:8080/login">
            <p>
                <label for="username" class="sr-only">Username</label>
                <input type="text" id="username" name="username" class="form-control" placeholder="Username" required=""
                    autofocus="" />
            </p>
            <p>
                <label for="password" class="sr-only">Password</label>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password"
                    required="" />
            </p>
            <input name="_csrf" type="hidden" value="671d243b-a5bb-47b1-9d80-ea994c867350" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </div>
</body>
{/* 
</html> */}
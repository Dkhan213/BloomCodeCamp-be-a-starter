import React from 'react'
import './Login.css'

function Login() {

  return (
    <div className='cover'>
        <form class="form-signin" method="post" action="http://localhost:8080/login">
          <h2>Sign in to Reviewtilize</h2>
                <label for="username" class="sr-only">Username</label>
                <input type="text" id="username" name="username" class="form-control" placeholder="Username" required=""
                    autofocus="" />
                <label for="password" class="sr-only">Password</label>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password"
                    required="" />
            <input name="_csrf" type="hidden" value="671d243b-a5bb-47b1-9d80-ea994c867350" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </div>
  )
}

export default Login
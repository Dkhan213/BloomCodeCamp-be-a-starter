import React from 'react'
import './Title.css'

function Title() {
  return (
    <section className='title-container'>
        <h1>Welcome To Reviewtalize</h1>
        <h3>The Assignment Review App</h3>
        <a href="http://localhost:8080/login" rel="noopener noreferrer">
            <button className='sign-in-button'>SIGN IN</button>
        </a>
    </section>
  )
}

export default Title
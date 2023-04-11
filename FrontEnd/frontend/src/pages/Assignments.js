import React, { useState, useEffect } from 'react'
import Axios from 'axios'

function Assignments() {

    const getData = () => {
        Axios.get("http://localhost:8080/api/v1/assignments").then(
            (response) => {
            console.log(response);
            }
        );
    }

    useEffect(() => {

        getData();

    }, [])

  return (
    <div>
        Hello buddy h
    </div>
  )
}

export default Assignments
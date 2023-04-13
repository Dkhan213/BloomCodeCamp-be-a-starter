import React from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Home from './pages/Home'
import Login from './pages/Login'
import Assignments from './pages/Assignments'

export default function App() {
  return (
    <div className="App">
        <BrowserRouter>
            <Routes>
                <Route index element={<Home />} />
                <Route path="/login" element={<Login />} />
                <Route path="/assignments" element={<Assignments />} />
            </Routes>
        </BrowserRouter>
    </div>
  )
}

import React from 'react'
import './FactsSection.css'

function FactsSection() {
  return (
    <div className='facts-section'>
      <h2>Allow reviewers to provide meaningful feedback <span className='font-to-bold'>to nurture a growth mindset</span></h2>
      <section className='facts'>
        <p>Students can upload their assignments to be reviewed by their assigned reviewer.</p>
        <p>Reviewers can claim an assignment for review and after successfully reviewing it, they
          can update the status of the assignemnt.
        </p>
        <p>Allows seemless collaboration between students and their reviwers to update and submit
          assignments in a timely fashion.
        </p>
      </section>
    </div>
  )
}

export default FactsSection
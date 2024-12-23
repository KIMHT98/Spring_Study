import React from 'react'
import "./Counter.css"
export default function Buttons(props) {
  return (
    <div>
      <button className='counterButton'
        onClick={() => props.onClick(props.number)}>+ {props.number}</button>
      <button className='counterButton'
        onClick={() => props.onClick(- props.number)}>- {props.number}</button>
    </div>
  )
}

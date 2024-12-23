import React, { useState } from 'react'
import "./Counter.css"
import Buttons from './Buttons';
export default function Counter() {
  const [count, setCount] = useState(0);

  function handleClickCounterButton(num) {
    setCount(count + num);
  }
  function handleClickReset() {
    setCount(0);
  }

  return (
    <div className='Counter'>
      <span className='count'>{count}</span>
      <Buttons onClick={handleClickCounterButton} number={1} />
      <Buttons onClick={handleClickCounterButton} number={2} />
      <Buttons onClick={handleClickCounterButton} number={5} />
      <button onClick={handleClickReset} className='resetButton'>Reset</button>
    </div>
  )
}

import React, {useState, useEffect} from "react"
import axios from 'axios'
import './App.css';

function App() {

  const [ testStr, setTestStr ] = useState('');
  function callback(str) {
    setTestStr(str);
  }

  // 첫 번째 렌더링을 마친 후 실행
  useEffect(
      () => {
        axios({
          url: '/home',
          method: 'GET'
        }).then((res) => {
          callback(res.data);
        })
      }, []
  );

  return (
      <div className="App">
        <header className="App-header">
          {testStr}
        </header>
      </div>
  );
}

export default App;

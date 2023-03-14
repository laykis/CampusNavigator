import React, {useState, useEffect} from 'react';
import Search from "./components/Search";
import './App.css';

function App () {
    const [message, setMessage] = useState("");

    useEffect(() => {
        fetch('/hello')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });
    },[])
    return (
        Search()

    )
}

export default App;
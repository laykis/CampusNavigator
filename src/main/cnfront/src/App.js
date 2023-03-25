import React from 'react';
import Search from "./components/Search";
import Main from "./components/Main";
import NotFound from "./components/NotFound";
import './App.css';
import RouteSearch from "./components/RouteSearch";
import {BrowserRouter, Route, Routes} from "react-router-dom";


function App () {

    return (
        <div className='App'>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Main/>}/>
                    <Route path="/search" element={<Search/>}/>
                    <Route path="/routesearch" element={<RouteSearch/>}/>
                    <Route path="*" element={<NotFound/>}/>
                </Routes>
            </BrowserRouter>
        </div>
    );
}

export default App;
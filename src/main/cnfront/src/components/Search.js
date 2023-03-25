import React, { useState } from 'react';
import "../css/Search.css";
import axios from 'axios';
import Cmap from "./Cmap";
import { useNavigate } from 'react-router-dom';



const Search = () => {

    const [ search, setSearch ] = useState('')
    const [ searchList, setSearchList ] = useState([''])

    const navigate = useNavigate();

    const searchChange = (e) => {
        setSearch(e.target.value)
    }

    const searchListChange = (e) => {
        setSearchList(e)
    }



    const onClickSearch = () => {

        axios.post("/searchpro",null,{ params : {"search" : search }})
            .then(
                (res) => {
                    console.log(res.data)
                    searchListChange(res.data)
                }
            )
            .catch()

    }

    return (

        <div>
            <header>
                <div>
                    <p className='logo'><img className='img' src={require('../logo/logo.png')} align="top"/></p>
                </div>
            </header>
            <hr className='line'/>

            <div className='text-white'>
                <p className='mb-5'>원광대학교 캠퍼스 네비게이터</p>
                <input className="input" type="search" placeholder="원광대학교 건물 이름을 입력하세요" onChange={searchChange}>
                </input>
                <button className="mt-4" onClick={onClickSearch}>검색</button>
                <button className="mt-5" onClick={() => navigate('/routesearch')}>건물찾기</button>
                <Cmap searchList={searchList}/>
            </div>

        </div>

    )
}


export default Search;
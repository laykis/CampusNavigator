import React, { useState } from 'react';
import "../css/Search.css";
import axios from 'axios';
import SearchList from "./SearchList";

const Search = () => {

    const [ search, setSearch ] = useState('')
    const [ searchList, setSearchList ] = useState('')

    const searchChange = (e) => {
        setSearch(e.target.value)
    }

    const searchListChange = (e) => {
        setSearchList(e.target.value)
    }

    const onClickSearch = () => {

        axios.post("https://localhost:8080/searchpro",null,{ params : {"search" : search }}).then((res) => searchListChange(res.data)).catch()

    }

    return (
        <div>
            <div className='text-white'>
                <h1 className='mb-5'>원광대학교 찾기 어려우신가요?</h1>
                <input className="input" type="search" placeholder="원광대학교 건물 이름을 입력하세요" onChange={searchChange}>
                </input>
                <button className="button mt-4" onClick={onClickSearch}>검색</button>

            </div>
            <div>
                <h1>SearchList</h1>
                <SearchList searchList={searchList}/>
            </div>
        </div>


    )
}


export default Search;
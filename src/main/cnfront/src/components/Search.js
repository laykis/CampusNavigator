import React, { useState } from 'react';
import "../css/Search.css";
import axios from 'axios';
import Cmap from "./Cmap";


const Search = () => {

    const [ search, setSearch ] = useState('')
    const [ searchList, setSearchList ] = useState([''])


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

            <div className='text-white'>
                <h1 className='mb-5'>원광대학교 찾기 어려우신가요?</h1>
                <input className="input" type="search" placeholder="원광대학교 건물 이름을 입력하세요" onChange={searchChange}>
                </input>
                <button className="button mt-4" onClick={onClickSearch}>검색</button>
                <Cmap searchList={searchList}/>


            </div>




    )
}


export default Search;
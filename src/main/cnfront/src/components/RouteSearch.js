import React, { useState } from 'react';
import "../css/Search.css";
import { useNavigate } from 'react-router-dom';
import Rmap from "./Rmap";



const RouteSearch = () => {

    const [ route, setRoute ] = useState('')
    const [ searchPlace, setSearchPlace ] = useState('')

    const navigate = useNavigate();

    const routeChange = (e) => {
        setRoute(e.target.value)
    }

    const searchPlaceChange = (e) => {
        setSearchPlace(e)
    }



    const onClickSearch = () => {

        searchPlaceChange('원광대학교' + route)

    }

    return (

        <div>
            <header>
                <div>
                    <p className='logo'><img className='img' src={require('../logo/logo.png')} align="top"/> </p>

                </div>
            </header>
            <hr className='line'/>

            <div className='text-white'>
                <p className='mb-5'>원광대학교 캠퍼스 네비게이터</p>
                <input className="input" type="search" placeholder="원광대학교 건물 이름을 입력하세요" onChange={routeChange}>
                </input>
                <button className="mt-4" onClick={onClickSearch}>검색</button>
                <button className="mt-5" onClick={() => navigate('/search')}>강의실찾기</button>
                <Rmap searchPlaceChange={searchPlaceChange} searchPlace={searchPlace}/>
            </div>

        </div>

    )
}


export default RouteSearch;
import React from 'react';
import { Link } from 'react-router-dom';

const Main = () => {


    return(

        <>
            <h3>안녕하세요. 메인페이지 입니다.</h3>
            <ul>
                <Link to="/search"><li>강의실 찾기</li></Link>
                <Link to="/routesearch"><li>건물 찾기</li></Link>
            </ul>
        </>
    )
}

export default Main;
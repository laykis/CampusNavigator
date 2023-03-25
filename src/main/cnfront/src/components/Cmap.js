import MonoSearch from "./MonoSearch";
import React, {useState} from "react";
import "../css/Cmap.css";



const Cmap = ({searchList}) => {


    const [ viewMapName, setViewMapName ] = useState("교학대학(교학관)1층_101강의실.jpg")

    const changeMap = (e) => {
        setViewMapName(e)
        console.log(e)
        console.log(viewMapName)
    }

    return(
        <div className='box'>
            <div className='list'>

                <p className='search'>검색결과</p>
                {searchList && searchList.map((sList) =>
                    <MonoSearch changeMap = {changeMap} searchList={sList} key = {sList.id}/>)}
            </div>

            <div className='photo'>

                <img className='map' src={require("../img/" +viewMapName)} alt={viewMapName}/>
            </div>

        </div>


    );



}
export default Cmap
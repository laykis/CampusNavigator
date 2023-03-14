import MonoSearch from "./MonoSearch";
import React, {useState} from "react";



const Cmap = ({searchList}) => {


    const [ viewMapName, setViewMapName ] = useState("교학대학(교학관)1층_101강의실.jpg")

    const changeMap = (e) => {
        setViewMapName(e)
        console.log(e)
        console.log(viewMapName)
    }

    return(
        <div>
            <h1>SearchList</h1>
            {searchList && searchList.map((sList) =>
                <MonoSearch changeMap = {changeMap} searchList={sList} key = {sList.id}/>)}
            <img src={require("../img/" +viewMapName)} alt={viewMapName}/>
        </div>
    );



}

export default Cmap
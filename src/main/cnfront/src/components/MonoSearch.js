import React from "react";
import "../css/MonoSearch.css";



function MonoSearch (props)  {



    const onClickMap = () => {

        props.changeMap(props.searchList.searchResult)
    }


    return (
        <div>
            <button className="list_bt" onClick={onClickMap}> {props.searchList.searchResult} </button>
        </div>
    );
}

export default MonoSearch
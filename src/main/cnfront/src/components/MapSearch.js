import React from "react";
import "../css/MonoSearch.css";



function MapSearch (props)  {



    const onClickMap = () => {

        props.changePlace(props.searchList.place_name)
    }


    return (
        <div>
            <button className="list_bt" onClick={onClickMap}> {props.searchList.place_name} </button>
        </div>
    );
}

export default MapSearch
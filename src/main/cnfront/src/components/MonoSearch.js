import React from "react";




function MonoSearch (props)  {



    const onClickMap = () => {

        props.changeMap(props.searchList.searchResult)
    }


    return (
        <div>
            <button onClick={onClickMap}> {props.searchList.searchResult} </button>
        </div>
    );
}

export default MonoSearch
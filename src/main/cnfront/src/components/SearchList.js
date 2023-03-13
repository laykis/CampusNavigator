import React from 'react';
import MonoSearch from "./MonoSearch";

const SearchList = ({ searchList }) => {


    return (
        <div>
            {searchList && searchList.map((sList) =>
                <MonoSearch searchList={sList} key = {sList.id}/>)}
        </div>
    );
};

export default SearchList;
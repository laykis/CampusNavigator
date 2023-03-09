import React from 'react';

const SearchList = ({ searchList }) => {

    return (
        <div>
            {searchList.map(list => {
                return ( <div  key={list.id} > {list.searchResult} </div>)
            })}
        </div>
    );
};

export default SearchList;
function MonoSearch({ searchList }) {
    return (
        <div>
            <a href={"/" + searchList.searchResult}> {searchList.searchResult} </a>
        </div>
    );
}

export default MonoSearch
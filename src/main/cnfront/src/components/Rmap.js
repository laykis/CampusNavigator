
import React, {useEffect, useState} from "react";
import "../css/Cmap.css";
import MapSearch from "./MapSearch";

const { kakao } = window;



function Rmap (props) {

    const [ placeList, setPlaceList ] = useState([''])


    const changePlaceList = (e) => {

        setPlaceList(e)
    }

    const changePlace = (e) => {

        const result = '원광대학교' + e
        props.searchPlaceChange(result)
    }
    useEffect(() => {

        console.log(props.searchPlace)
        let infowindow = new kakao.maps.InfoWindow({zIndex:1});

        const container = document.getElementById('routeMap');
        const options = {
            center: new kakao.maps.LatLng(33.450701, 126.570667),
            level: 3
        };



        const map = new kakao.maps.Map(container, options);

        const ps = new kakao.maps.services.Places();

        ps.keywordSearch(props.searchPlace, placesSearchCB);

        function placesSearchCB (data, status, pagination) {
            if (status === kakao.maps.services.Status.OK) {

                changePlaceList(data)
                // 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해
                // LatLngBounds 객체에 좌표를 추가
                let bounds = new kakao.maps.LatLngBounds();


                displayMarker(data[0]);
                bounds.extend(new kakao.maps.LatLng(data[0].y, data[0].x));


                // 검색된 장소 위치를 기준으로 지도 범위를 재설정
                map.setBounds(bounds);
            }
        }

        function displayMarker(place) {

            // 마커를 생성하고 지도에 표시
            let marker = new kakao.maps.Marker({
                map: map,
                position: new kakao.maps.LatLng(place.y, place.x)
            });

            // 마커에 클릭이벤트를 등록
            kakao.maps.event.addListener(marker, 'click', function() {
                // 마커를 클릭하면 장소명이 인포윈도우에 표출
                infowindow.setContent('<div style="padding:5px;font-size:12px;">' + place.place_name + '</div>');
                infowindow.open(map, marker);
            });
        }
    }, [props.searchPlace]);


    return(
        <div className='box'>
            <div className='list'>

                <p className='search'>검색결과</p>
                {placeList && placeList.map((pList) =>
                    <MapSearch changePlace = {changePlace} searchList={pList}/>)}
            </div>

            <div className='photo'>

                <div id='routeMap' style={{

                    width: '800px',
                    height: '600px'
                }}/>

            </div>

        </div>


    );



}
export default Rmap
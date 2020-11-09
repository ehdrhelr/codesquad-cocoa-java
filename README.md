<h1>CodeSquad Masters Cocoa Java Practice</h1>

<h2>Day 01</h2>

<h4>미션 1: 구구단 <a href="https://github.com/ehdrhelr/codesquad-cocoa-java/blob/master/src/day01/Gugudan.java">(소스)</a></h4>
<ul>
<li>클린 코딩</li>
<li>입력 처리</li>
<li>깔끔하게 출력</li>
</ul>

<h4><a href="https://github.com/ehdrhelr/codesquad-cocoa-java/blob/master/src/day01/Summary.md">학습정리</a></h4>

<h2>Day 02</h2>

<h4><a href="https://www.notion.so/day02-b5c7d3b0fa2846d2a5214550f0d43093">학습정리</a><h4>


<h2>Day 03</h>
<h4>미션 2-1: 인디언 이름 짓기 <a href="https://github.com/ehdrhelr/codesquad-cocoa-java/tree/master/src/day03/indianNaming">(소스)</a></h4>

다음과 같은 형태의 프로그램을 구현한다.

참고자료는 '인디언 이름 짓기' 로 검색을 해 보자.

    생년월일을 입력해 주세요><br>
    1999 12 9<br>
    당신의 이름은 용감한 황소의 노래입니다.
    
<h4>미션 2-2: 초간단 RPG 구현하기 <a href="https://github.com/ehdrhelr/codesquad-cocoa-java/tree/master/src/day03/rpg">(소스)</a></h4>
<li>11 * 11 배열 초기화</li>
<li>화면 중앙에는 캐릭터 위치</li>
<li>임의의 장소에 몬스터 위치</li>
<li>임의의 장소에 1개의 지뢰를 배치한다. 단 지뢰는 플레이어가 밟기 전까지 화면에 표시하지 않는다.</li>
<li>콘솔 입력으로 WASD 중 하나의 키를 입력받고 엔터를 누르면 캐릭터가 상좌하우로 이동함</li>
<li>캐릭터가 지뢰를 밟으면 사망</li>
<li>캐릭터가 몬스터의 위치까지 이동하면 몬스터가 사라지고 정해진 점수 획득</li>
<li>점수 획득시 새로운 몬스터와 지뢰를 배치한다. 단 지뢰의 갯수는 2배 증가시킨다.</li>
<li>매 턴마다 현재 배열의 상태를 화면에 출력. 단 밟지 않은 지뢰는 표시하지 않는다.</li>
<li>똑같이 구현하지 않아도 되니 재미있는 게임을 만들어 보자.</li>

<h2>Day 04</h2>
<h4><a href="https://www.notion.so/day04-7a0d25758f3d4b759f5e25c878992d69">학습정리</a></h4>

<h2>Day 05</h2>
<h4>알고리즘 문제 풀이</h4>
<li><a href="https://github.com/ehdrhelr/codesquad-cocoa-java/tree/master/src/day05/lv1">Lv. 1</a></li>
<li><a href="https://github.com/ehdrhelr/codesquad-cocoa-java/tree/master/src/day05/more1">더 풀어보기</li>

<h2>Day 05</h2>
<h4>미션 3: 가계부 구현하기</h3>
<h5>필수 요구사항</h5>

<li>간단한 가계부를 구현한다.</li>
<li>키보드를 통해 데이터 입력을 받고 화면에 내용을 출력한다.</li>
<li>사용자 등록: 사용자 이름 및 비밀번호를 입력받는다.</li>
<li>데이터 입력: 날짜, 적요, 수입, 지출을 입력받는다.</li>
<li>데이터 삭제: 특정 순번의 데이터를 삭제한다.</li>
<li>데이터 수정: 특정 순번의 데이터를 수정할 수 있다.</li>
<li>화면에 출력: 해당 월의 지출내역을 순번, 적요, 수입, 지출, 잔액으로 화면에 출력한다.</li>

<h4>연습문제: 홀짝게임 구현하기 (선택) <a href="https://github.com/ehdrhelr/codesquad-cocoa-java/tree/master/src/day06/game">(소스)</a></h4>

<li>가계부 구현이 어려울 경우 선택한다.</li>
<li>간단한 홀짝게임을 구현해 본다.</li>
<li>플레이어의 이름을 입력받는다. 초기 자본은 100원을 가지고 시작한다.</li>
<li>상대방 플레이어는 120원을 가지고 시작한다.</li>
<li>상대방은 Random 을 이용, 1- 20까지 임의의 수를 뽑는다. 단 화면에 해당 숫자가 출력되지는 않는다.</li>
<li>플레이어는 홀 또는 짝을 입력하고 배팅을 한다. 배팅 최대 금액은 min(내 소지금, 상대방 소지금) 으로 결정한다.</li>
<li>맞았을 경우 배팅 금액만큼 상대방에게 얻고, 반대의 경우 상대방에게 빼앗긴다.</li>
<li>플레이어의 소지금이 0원이 되면 게임 종료</li>
<li>상대방의 소지금이 0원이 되면 다음 상대가 등장. 다음 상대는 내 소지금 * pow(1.2, numStage) 의 소지금을 가지고 등장한다.</li>
<li>라이벌은 총 8명이 등장한다.</li>
<li>게임 오버시 소지금과 진행 턴을 표시해 준다.</li>
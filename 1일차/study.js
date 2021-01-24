var string = 'string';
string[0] = 'A';
// console.log(string);

// 데이터 타입

// 원시타입 변수가 가리키는 메모리 공간 -> 값
// 값이 변하지 않아요.
// 문자, 숫자, Boolean, 

// 객체 타입 변할 수 있어요. 변수가 가리키는 메모리 공간 -> 객체의 주소값
// 객체

var number1 = 10; // number1의 방 -> 10 -> 20
var number2 = number1; // number2의 방 -> 10
number1 = 20;
console.log(number2);

// 값에 의한 전달
number2 = number1;
number2 = 10;

// number1, number2 서로 메모리 주소가 달라요

var person = { // person의 주소 10번
    name: '정용',
}

var jeongyong = person; // 정용의 주소 : 1번지 -> 메모리 1번지 = 10
// console.log(jeongyong.name);

var byungrae = jeongyong; // 병래의 주소 : 2번지 -> 메모리 2번지 = 10
byungrae.name = '병래';

console.log(jeongyong.name);
console.log(byungrae.name);

// byungrae의 메모리 주소 == jeongyong의 메모리 주소
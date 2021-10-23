class Person {

    // 생성 메서드
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    // 프로토타입 메서드
    printInfo() {
        console.log(`name : ${this.name}, age : ${this.age}`);
    }

    // 정적 메서드
    static printStaticMethod() {
        console.log('정적 메서드입니다.');
    }
}
// const jeongyong = new Person();
// jeongyong.printInfo();

class Programmer extends Person {

    #gender = 'female'; // Java : private String gender = "female";

    constructor(programmingLanguage) {
        super(); // Person의 constructor
        this.programmingLanguage = programmingLanguage;
    }

    getLanguage() {
        console.log(`사용할 수 있는 언어는 ${this.programmingLanguage}`);
    }

    getGender() {
        console.log(`gender : ${this.#gender}`);
    }
}

const hyeonjin = new Programmer('JavaScript');
hyeonjin.getGender();

/* 과제
숫자를 계속 입력합니다.
'='이 오면 지금까지 입력한 모든 수의 합을 출력

8
12
20
=
40

힌트 : 반복문, 조건문, 클래스, 프로토타입, 객체
*/
// const arrowFunction = (name) => console.log(name);

// arrowFunction('정용');
// console.log(arrowFunction.__proto__);
// console.log(typeof arrowFunction.prototype);
// console.log(typeof arrowFunction);

// console.log('----------');

// const func1 = function name(name) {
//     console.log(name);
// }

// console.log(func1.constructor === Object.constructor);
// console.log(func1.__proto__ === Function.prototype);

// console.log('----------');
// const object1 = { name: '정용' };

// console.log(object1.constructor === Object.constructor);
// console.log(object1.__proto__ === Object.prototype);
var x = 1;

function func() {
    x = 10;
    inner(x);
}

function inner(x) {
    console.log(x);
}

// func();
// x == 10
inner(x);
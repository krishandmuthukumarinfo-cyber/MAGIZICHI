// 1 declare variables

var name = "Arun";
var age = 20;
var city = "Madurai";

console.log(name);
console.log(age);
console.log(city);


// 2 add 2 no

var a = 10;
var b = 5;

var sum = a + b;

console.log("Sum = " + sum);


// 3 variable scoop

var x = 10;
let y = 20;
const z = 30;

console.log("Outside Function");
console.log(x);
console.log(y);
console.log(z);


// fuction scoop
function test() {
    var p = 40;

    console.log("Inside Function");
    console.log(p);
}

test();


// block scope

if (true) {
    var a = 50;
    let b = 60;
    const c = 70;

    console.log("Inside If Block");
    console.log(a);
    console.log(b);
    console.log(c);
}

console.log("Outside If Block");
console.log(m);

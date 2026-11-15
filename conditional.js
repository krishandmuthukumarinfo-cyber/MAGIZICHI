// 1 array sum

let arr = [10, 20, 30, 40, 50];

let sum = 0;

for (let i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}

console.log("SUM OF ARRAY = " + sum);


// 2. even odd

let arr2 = [10, 15, 20, 25, 30, 35];

let even = 0;
let odd = 0;

for (let i = 0; i < arr2.length; i++) {

    if (arr2[i] % 2 == 0) {
        even++;
    }
    else {
        odd++;
    }
}

console.log("EVEN COUNT = " + even);
console.log("ODD COUNT = " + odd);


// 3. reverse 

let arr3 = [10, 20, 30, 40, 50];

let reverse = [];

for (let i = arr3.length - 1; i >= 0; i--) {
    reverse.push(arr3[i]);
}

console.log("REVERSED ARRAY = " + reverse);
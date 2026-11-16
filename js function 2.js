
let choice;

do {
    console.log("1. Add Two Numbers");
    console.log("2. Check Even or Odd");
    console.log("3. Multiply Two Numbers");
    console.log("4. Exit");

    choice = Number(prompt("Enter your choice:"));

    if (choice == 1) {

        let a = Number(prompt("Enter first number:"));
        let b = Number(prompt("Enter second number:"));

        let add = (a, b) => a + b;

        let result = add(a, b);

        function display(sum) {
            console.log("Sum = " + sum);
        }

        display(result);

    }

    else if (choice == 2) {

        let num = Number(prompt("Enter a number:"));

        let check = function(n) {
            if (n % 2 == 0) {
                console.log("Even Number");
            }
            else {
                console.log("Odd Number");
            }
        };

        check(num);

    }

    else if (choice == 3) {

        let a = Number(prompt("Enter first number:"));
        let b = Number(prompt("Enter second number:"));

        let multiply = (a, b) => a * b;

        let result = multiply(a, b);

        let check = function(result) {
            if (result > 100) {
                console.log("Greater than 100");
            }
            else {
                console.log("Not greater than 100");
            }
        };

        console.log("Multiplication = " + result);

        check(result);

    }

    else if (choice == 4) {
        console.log("Thank You! Exit");
    }

    else {
        console.log("Invalid Choice");
    }

} while (choice != 4);







let choice;

// 1 every 2 seconds
function hello() {
    setInterval(function() {
        console.log("hello world");
    }, 2000);
}

// 2 display number
function print() {
    let num = 1;

    let timer = setInterval(function() {
        console.log(num);
        num++;

        if (num > 10) {
            clearInterval(timer);
        }
    }, 1000);
}

// 3current time
function current() {
    setInterval(function() {
        let time = new Date();
        console.log(time.toLocaleTimeString());
    }, 1000);
}

// 4 even numbers
function even() {
    let num = 2;

    setInterval(function() {
        console.log(num);
        num = num + 2;
    }, 2000);
}

// 5 countdown 
function count() {
    let num = 10;

    let timer = setInterval(function() {
        console.log(num);
        num--;

        if (num < 0) {
            clearInterval(timer);
        }
    }, 1000);
}

// menu
do {
    console.log("\n1. hello world");
    console.log("2. numbers 1 to 10");
    console.log("3. current time");
    console.log("4. even numbers");
    console.log("5. countdown");
    console.log("6. exit");

    choice = Number(prompt("enter your choice:"));

    if (choice == 1) {
        helloWorld();
    }
    else if (choice == 2) {
        printNumbers();
    }
    else if (choice == 3) {
        currentTime();
    }
    else if (choice == 4) {
        evenNumbers();
    }
    else if (choice == 5) {
        countdown();
    }
    else if (choice == 6) {
        console.log("program exited");
    }
    else {
        console.log("invalid choice");
    }

} while (choice != 6);


function grade(mark) {

    if (mark >= 90) {
        return "A+";
    }
    
    else if (mark >= 75) {
        return "A";
    }

    else if (mark >= 60) {
        return "B";
    }

    else if (mark >= 50) {
        return "C";
    }

    else {
        return "Fail";
    }
}

console.log(grade(89));
console.log(grade(76));
console.log(grade(65));
console.log(grade(34));
console.log(grade(40));

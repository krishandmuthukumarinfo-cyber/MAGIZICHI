
let sentence = "JavaScript is Very Interesting";

let text = sentence.trim();

let charcount = sentence.length;

let wordcount = text.split(/\s+/).length;

let smalltext = sentence.toLowerCase();

let result = {
    charcount: charcount,
    wordcount: wordcount,
    smalltext: smalltext
};

console.log(result);


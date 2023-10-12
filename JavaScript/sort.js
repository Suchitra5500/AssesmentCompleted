const { arrayToBeSort } = require('./sort');

const prompt = require('prompt-sync')()

const input = prompt("Enter a list of values separated by a comma: ");
const inputArray = input.split(',');
const trimmedArray = inputArray.map(value => value.trim());
let result = arrayToBeSort(trimmedArray);
console.log(result);
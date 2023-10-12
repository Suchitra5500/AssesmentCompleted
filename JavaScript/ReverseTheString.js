function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
    return reversedWords.join(' ');
  }
  
const prompt = require('prompt-sync')()
let Name = prompt("Enter Ur name ")
const reversedSentence = reverseWordsInSentence(Name)
console.log(reversedSentence)
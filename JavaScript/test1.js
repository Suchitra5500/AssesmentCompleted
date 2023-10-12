function arrayToBeSort(arr) {
    const arrayToSort=arr.sort((a, b) => b - a);

    console.log(arrayToSort);
  }

  module.exports = {
    arrayToBeSort: arrayToBeSort,
  };
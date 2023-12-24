"use strict";
let addNumbers = (x, y) => x + y;
let subtractNumbers = (x, y) => x - y;
console.log(addNumbers(1, 2));
console.log(subtractNumbers(1, 2));
let doCalculation = (operation) => {
    if (operation === 'add') {
        return addNumbers;
    }
    else {
        return subtractNumbers;
    }
};

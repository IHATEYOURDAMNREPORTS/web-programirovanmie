"use strict";
let addThreeNumbers = (x, y, z) => {
    if ((z === undefined)) {
        return x + y;
    }
    else {
        return x + y + z;
    }
};
let subtractThreeNumbers = (x, y, z = 100) => x - y - z;
subtractThreeNumbers(10, 20); // returns -110 because 'z' has been assigned the value 100
subtractThreeNumbers(10, 20, 15); // returns -25

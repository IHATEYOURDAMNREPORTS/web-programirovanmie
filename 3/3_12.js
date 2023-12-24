"use strict";
let returnNumber = {
    value: 25,
    message: 'Hello!'
};
let returnString = {
    value: 'Hello!',
    message: 25
};
class processIdentity {
    constructor(val, msg) {
        this.value = val;
        this.message = msg;
    }
    process() {
        console.log(this.message);
        return this.value;
    }
}
let processor = new processIdentity(100, 'Hello');
processor.process(); // Displays 'Hello'

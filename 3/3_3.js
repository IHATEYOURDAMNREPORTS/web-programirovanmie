"use strict";
let myIceCreamA = {
    flavor: 'vanilla',
    scoops: 2,
    sauce: 'caramel',
    nuts: true
};
function tooManyScoopsA(dessert) {
    if (dessert.scoops >= 4) {
        return dessert.scoops + ' is too many scoops!';
    }
    else {
        return 'Your order will be ready soon!';
    }
}
console.log(tooManyScoopsA({ flavor: 'vanilla', scoops: 5, sauce: 'caramel' }));

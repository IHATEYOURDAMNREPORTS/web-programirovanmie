interface IceCream {
  flavor: string;
  scoops: number;
}

let myIceCream: IceCream = {
  flavor: 'vanilla',
  scoops: 2
}

console.log(myIceCream.flavor);

function tooManyScoops(dessert: IceCream) {
  if (dessert.scoops >= 4) {
     return dessert.scoops + ' is too many scoops!';
  } else {
     return 'Your order will be ready soon!';
  }
}

console.log(tooManyScoops({flavor: 'vanilla', scoops: 5}));

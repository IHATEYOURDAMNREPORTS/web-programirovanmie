type calculator = (x: number, y: number) => number;

let addNumbers: calculator = (x: number, y: number): number => x + y;
let subtractNumbers: calculator = (x: number, y: number): number => x - y;

console.log(addNumbers(1, 2));
console.log(subtractNumbers(1, 2));

let doCalculation = (operation: 'add' | 'subtract'): calculator => {
  if (operation === 'add') {
      return addNumbers;
  } else {
      return subtractNumbers;
  }
}

// type calculator = (x: number, y: number) => number;
interface Calculator {
  (x: number, y: number): number;
}

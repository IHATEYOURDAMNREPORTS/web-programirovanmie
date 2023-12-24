let addThreeNumbers = (x: number, y: number, z?: number): number => {
  if((z === undefined)) {
      return x + y;
  } else {
      return x + y + z;
  }
};

let subtractThreeNumbers = (x: number, y: number, z = 100): number => x - y - z;

subtractThreeNumbers(10, 20);       // returns -110 because 'z' has been assigned the value 100
subtractThreeNumbers(10, 20, 15);   // returns -25
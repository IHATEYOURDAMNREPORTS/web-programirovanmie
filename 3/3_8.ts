class Car1 {
  // Properties
  _make: string;
  _color: string;
  _doors: number;
  // Constructor
  constructor(make: string, color: string, doors = 4) {
    this._make = make;
    this._color = color;
    if ((doors % 2) === 0) {
        this._doors = doors;
    } else {
        throw new Error('Doors must be an even number');
    }
  }
  // Accessors
  get make() {
  return this._make;
  }
  set make(make) {
  this._make = make;
  }
  get color() {
  return 'The color of the car is ' + this._color;
  }
  set color(color) {
  this._color = color;
  }
  get doors() {
  return this._doors;
  }
  set doors(doors) {
  if ((doors % 2) === 0) {
      this._doors = doors;
  } else {
      throw new Error('Doors must be an even number');
  }
  }
  // Methods
  accelerate(speed: number): string {
  return `${this.worker()} is accelerating to ${speed} MPH.`
  }
  brake(): string {
  return `${this.worker()} is braking with the standard braking system.`
  }
  turn(direction: 'left' | 'right'): string {
  return `${this.worker()} is turning ${direction}`;
  }
  // This function performs work for the other method functions
  worker(): string {
  return this._make;
  }
  }
let myCar1 = new Car1('Cool Car Company', 'blue', 2);  // Instantiates the Car object with all parameters
console.log(myCar1.color);
console.log(myCar1._color);
let myCar2 = new Car1('Galaxy Motors', 'red', 3);
let myCar3 = new Car1('Galaxy Motors', 'gray');
console.log(myCar3.doors);  // returns 4, the default value
console.log(myCar1.accelerate(35));
console.log(myCar1.brake());
console.log(myCar1.turn('right'));
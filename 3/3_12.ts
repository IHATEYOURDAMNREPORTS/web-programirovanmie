interface Identity<T, U> {
  value: T;
  message: U;
}

let returnNumber: Identity<number, string> = {
  value: 25,
  message: 'Hello!'
}
let returnString: Identity<string, number> = {
  value: 'Hello!',
  message: 25
}

interface ProcessIdentity<T, U> {
  value: T;
  message: U;
  process(): T;
}
class processIdentity<X, Y> implements ProcessIdentity<X, Y> {
  value: X;
  message: Y;
  constructor(val: X, msg: Y) {
      this.value = val;
      this.message = msg;
  }
  process() : X {
      console.log(this.message);
      return this.value
  }
}

let processor = new processIdentity<number, string>(100, 'Hello');
processor.process();           // Displays 'Hello'


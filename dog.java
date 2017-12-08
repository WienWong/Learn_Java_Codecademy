class Animal {
  public void checkStatus() {
    System.out.println("Your pet is healthy and happy!");
	}
}

class Dog extends Animal {
  int age;
	public Dog(int dogsAge) {
    age=dogsAge;
  }
  public void bark() {
  	System.out.println("Woof!");
  }
  public void run(int feet){
  	System.out.println("Your dog ran " + feet + " feet!");
  }
  public int getAge(){
  	return age;
  }

	public static void main(String[] args) {
		Dog spike=new Dog(2);
		spike.bark();
		spike.run(1235);
		int spikeAge=spike.getAge();
		System.out.println(spikeAge);
		spike.checkStatus(); // method inherit from Animal
	}
}

/*
Output:
Woof!
Your dog ran 1235 feet!
2
Your pet is healthy and happy!

*/

 class Animal {

	 void eat(){
	System.out.println("Eating");
	}
	void run(){
		System.out.println(" parent runing");
		}

}

public class SingleInheritance  extends Animal
{
	void run(){

			//super.run();

		System.out.println("runing");
		}


	public static void main(String args[]){
	
	SingleInheritance d=new SingleInheritance();
	d.eat();
	d.run();




    // Animal a=new Animal();
    // a.eat();
	// a.run();

	}


}




package Abstract;

public class Tiger extends Animal {

	@Override
	void Eat() {
		System.out.println("an");
		
	}

	@Override
	void Sleep() {
		System.out.println("ngu");
		
	}

	@Override
	void Walk() {
		System.out.println("di bo");
		
	}

	@Override
	void Run() {
		System.out.println("chay");
		
	}

	@Override
	void Roar() {
		System.out.println("gao");
		
	}
	public static void main(String[] args) {
		Animal a1=new Tiger();
		a1.Eat();
	}
}


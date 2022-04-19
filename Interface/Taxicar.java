package Interface;

class TaxiCar implements Car {
	
	@Override
	public void Move() {
		System.out.println("Di chuyen");
		
	}

	@Override
	public void Stop() {
		System.out.println("Dung lai");
		
	}

	@Override
	public void TurnRight() {
		System.out.println("Re phai");
	}

	@Override
	public void TurnLeft() {
		System.out.println("Re trai");
	}

	@Override
	public void Reverse() {
		System.out.println("quay lai");
		
	}
	public static void main(String[] args) {
		TaxiCar tc=new TaxiCar();
		tc.Move();
	}
}
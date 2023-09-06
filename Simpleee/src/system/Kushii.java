package system;


	public Const1() {
		System.out.println("Constructor");
	}
	public Const1(int a) {
		System.out.println("Argument int");
	}
	private  void Const1(int i) {
		System.out.println(i);

	}
	public static void main(String[] args) {
		Const1 c=new Const();
		Const1 c1= new Const1(10);
		c.Const1(10);
	}



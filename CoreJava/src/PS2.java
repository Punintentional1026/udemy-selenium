
public class PS2 {

	int a;
	
	//default constructor
	
	public PS2(int a) {
		this.a = a; //this
	}

	public int increment()
	{
		a = a+1;
		return a;
	}

	public int decrement()
	{
		a = a-1;
		return a;
	}
}

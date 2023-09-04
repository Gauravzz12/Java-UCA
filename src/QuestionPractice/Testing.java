package QuestionPractice;
interface Test {
  void print();
	interface Yes {
		void show();
	}
}

class Testing implements Test{
	public void show()
	{
		System.out.println("show method of interface");
	}
  
	public static void main(String[] args)
	{
		Testing obj=new Testing();
		obj.show();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}

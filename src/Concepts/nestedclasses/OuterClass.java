package Concepts.nestedclasses;

 class OuterClass {
	 	class Innerclass{
	 		public void show() {
	 			System.out.println("Nested class Method");
	 		}
	 	}


	public static void main(String[] args) {
		OuterClass.Innerclass _ObjInC=new OuterClass().new Innerclass();
		_ObjInC.show();
	}

}

package Concepts.Generics;
public class Box3<T> {
	private T[] boxData;
	
	public Box3(T[] boxData) {
		this.boxData=boxData;
	}
	public <T> void showBoxData(T[] boxData) {
			
		
	for(T data : boxData) {
		System.out.println(data+" ");
	}
	System.out.println();
	}
	public <T> void inspect() {
		System.out.println("T : "+ boxData.getClass().getSimpleName());
	}
	private Object[] getBoxData() {
		return boxData;
	}

	public static void main(String[] args) {
		String[] item_name= {"Pizza","Burger","Coke","Fries","Wrap"};
		Box3<String>sObject=new Box3<>(item_name);
		sObject.showBoxData(sObject.getBoxData());
		sObject.inspect();
		
		Double[] item_price= {500.00,100.00,240.00,120.00,100.00};
		Box3<Double>dObject=new Box3<>(item_price);
		dObject.showBoxData(dObject.getBoxData());
		dObject.inspect();
		
		
	}
	

}

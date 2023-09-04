package oop.encapsulation;

public class EncapsulationAccess {

	
	public static void main(String[] args) {
		EncalpsulationExample _objAdmin=new EncalpsulationExample();
		_objAdmin.set_CollegeCode("01");
		_objAdmin.set_StudentName("Gaurav");
		_objAdmin.set_StudentCode("1291");
//		System.out.println(_objAdmin._CollegeCode);
		
		_objAdmin.get_CollegeCode();
		_objAdmin.get_StudentName();
		_objAdmin.get_StudentCode();
		
	EncalpsulationExample _objAdmin2=new EncalpsulationExample();
	_objAdmin2.set_CollegeCode("02");
	_objAdmin2.set_StudentName("SAD");
	_objAdmin2.set_StudentCode("1292");
//	System.out.println(_objAdmin._CollegeCode);
	
	_objAdmin2.get_CollegeCode();
	_objAdmin2.get_StudentName();
	_objAdmin2.get_StudentCode();
	
	EncalpsulationExample _objAdmin3;
	_objAdmin3=_objAdmin2;
	_objAdmin3.set_CollegeCode("1290");
	_objAdmin3.get_CollegeCode();
	_objAdmin3.get_StudentCode();
	_objAdmin3.get_StudentName();
	}
}

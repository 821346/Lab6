public class Course {
	String dept;
	int course;
	double credits;
	
	final int DEPT_LENGTH = 3;
	final int LOW_NUM = 100;
	final int HIGH_NUM = 499;
	final double LOW_CREDITS = 0.5;
	final double HIGH_CREDITS = 6;
	//check if all final vars are used
	public Course() {
		dept= "";
		course= 0;
		credits = 0;
	} 
	public Course(String Xdept, int Xnum, double Xcredits) throws CourseException {
	boolean isBad = false;
	String msg = "";
	
	if(Xdept.length()!=DEPT_LENGTH) {
		msg= msg +"Invalid department length ";
		isBad=true;
	}
	
	if(Xnum>=LOW_NUM && Xnum<=HIGH_NUM) {
		if(isBad==true) {
		msg=msg+"and invalid course number ";
		}
		else {
			msg="Invalid course number ";
			isBad=true;
		}	
	}
	
	if(Xcredits<LOW_CREDITS || Xcredits>HIGH_CREDITS) {
		if(isBad==true) {
		msg=msg+"and invalid number of credits ";
		
		}
		else {
			msg=" Invalid number of credits ";	
			
		 }
	}
	
	if(!msg.equals("")) {
		throw new CourseException(msg);
	}
	
	else {
		this.dept= Xdept;
		this.course= Xnum;
		this.credits=Xcredits;
	}
	
	}
	
	public String toString() {
		return "Course Number: " + this.course + ", Course Department: "+ this.dept + ", "
				+ "Course Credits: "+this.credits;
	
}
}


public class TestCourseException {
	public static void main(String[] args) {
		Course[] courses = new Course[6];
		String[] depts = {"BBB", "ACC", "ENG", "BBB", "CIS", "ACC"};
		int[] courseNums = {99, 500, 500, 700, 599, 305};
		double[] credits ={6, 4, 7.5, 0, 100, 2.5};
		
		/*
		for(int i = 0; i < courses.length; i++) {
			courses[i] = new Course();
		}
		*/
		
		for(int x = 0; x < courses.length; x++) 
		{
			try {
			courses[x]=new Course(depts[x], courseNums[x], credits[x]);
			System.out.println(courses[x].toString());
			}
			catch(CourseException ce) {
				System.out.println(ce);
			}
		}
		
	}
}


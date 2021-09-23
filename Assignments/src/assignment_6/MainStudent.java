package assignment_6;

public class MainStudent {
	public static void main(String[] args) {
		Student mohit = new Student();
		mohit.setStudentId(1);
		mohit.setStudentName("Mohit Shah");
		mohit.setContactNumber("88XXXXX600");
		mohit.setCollegeName("TCET Mumbai");
		mohit.setBranch("Information Technology");
		mohit.setAddress("Mumbai");
		
		System.out.println(mohit.getStudentId());
		System.out.println(mohit.getStudentName());
		System.out.println(mohit.getContactNumber());
		System.out.println(mohit.getAddress());
		System.out.println(mohit.getCollegeName());
		System.out.println(mohit.getBranch());
	}
}

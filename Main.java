

class SuperDepartment{
	public String departmentname() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No work as of now";
	}
	public String getWorkDeadline() {
		return "NIL";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
class AdminDepartment extends SuperDepartment{
	public String departmentname() {
		return "Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your document Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
class HrDepartment extends SuperDepartment{
	public String departmentname() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
}
class TechDepartment extends SuperDepartment{
	public String departmentname() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "core JAVA";
	}
}



public class Main{
    public static void main(String[] args) {
	        AdminDepartment admin = new AdminDepartment();
	        HrDepartment hr = new HrDepartment();
	        TechDepartment tech = new TechDepartment();

	        System.out.println("Welcome to " + admin.departmentname());
	        System.out.println(admin.getTodaysWork());
	        System.out.println(admin.getWorkDeadline());
	        System.out.println(admin.isTodayAHoliday());
	        System.out.println();
	        
	        System.out.println("Welcome to " + hr.departmentname());
	        System.out.println(hr.doActivity());
	        System.out.println(hr.getTodaysWork());
	        System.out.println(hr.getWorkDeadline());
	        System.out.println(hr.isTodayAHoliday());
	        System.out.println();
	        
	        System.out.println("Welcome to " + tech.departmentname());
	        System.out.println(tech.getTodaysWork());
	        System.out.println(tech.getWorkDeadline());
	        System.out.println(tech.getTechStackInformation());
	        System.out.println(tech.isTodayAHoliday());
	    }
}

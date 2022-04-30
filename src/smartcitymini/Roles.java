package smartcitymini;

public class Roles {
	Roles(String Name, String Username, String Password,String HomeTown, String Role ){
		if(Role == "Job Seeker"){
			JobSeeker jb = new JobSeeker(Name, Username, Password, HomeTown);
		}
		if(Role == "Student"){
				Student st = new Student(Name, Username, Password, HomeTown);
		}
		if(Role == "Tourist"){
			Tourist to = new Tourist(Name, Username, Password, HomeTown);
		}
	}
}

public class Main {
    public static void main(String[] args) {
        User user=new User(1,"Ebru Keskin",21,"blabla@email.com");

        Instructor instructor=new Instructor() ;
        Student student=new Student();
        student.setUsername("Ebru26");
        student.setSchool("ESTÜ");



        instructor.setUsername("Hakan32");
        instructor.setId(3);
        instructor.setLecturesgiven("Java");

        UserManager userManager=new UserManager();
        userManager.Login(instructor);
        userManager.Logout(student);

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager=new StudentManager();
        studentManager.Homework(instructor);
    }

}

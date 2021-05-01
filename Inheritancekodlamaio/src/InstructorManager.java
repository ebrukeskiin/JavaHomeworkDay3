public class InstructorManager extends UserManager{

    public void Rollcall(Student student) {
        System.out.println(student.getId()+"  Polling has been checked. ");
    }
    public void control(Instructor instructor){
        System.out.println(instructor.getLecturesgiven()+ " tasks checked. ");
    }
}

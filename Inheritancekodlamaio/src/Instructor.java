public class Instructor extends User {
   private String departmant;
   private String graduationschool;
   private String lecturesgiven;


   public String getDepartmant() {
      return departmant;
   }

   public void setDepartmant(String departmant) {
      this.departmant = departmant;
   }

   public String getGraduationschool() {
      return graduationschool;
   }

   public void setGraduationschool(String graduationschool) {
      this.graduationschool = graduationschool;
   }

   public String getLecturesgiven() {
      return lecturesgiven;
   }

   public void setLecturesgiven(String lecturesgiven) {
      this.lecturesgiven = lecturesgiven;
   }
}

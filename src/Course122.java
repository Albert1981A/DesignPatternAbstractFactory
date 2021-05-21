
public class Course122 extends FormatFactory{

    @Override
    public Teacher getTeacher() {
        return new TeacherRotem();
    }

    @Override
    public Admin getAdmin() {
        return new AdminTal();
    }
}

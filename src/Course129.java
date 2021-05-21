
public class Course129 extends FormatFactory{

    @Override
    public Teacher getTeacher() {
        return new TeacherKobi();
    }

    @Override
    public Admin getAdmin() {
        return new AdminShay();
    }
}

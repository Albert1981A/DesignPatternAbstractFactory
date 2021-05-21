
public class Test {

    public static void main(String[] args) {
        /**
         * This class deals with the production of instance
         * It is an abstract class that gathers into it two factory methods or more
         * The class creates Instances within which are initialized by their own factory methods
         */

        System.out.println("------------------ Course129 -----------------");
        FormatFactory course129 = new Course129();
        course129.getTeacher().teacher();
        course129.getAdmin().admin();
        System.out.println("------------------ Course122 -----------------");
        FormatFactory course122 = new Course122();
        course122.getTeacher().teacher();
        course122.getAdmin().admin();
    }
}

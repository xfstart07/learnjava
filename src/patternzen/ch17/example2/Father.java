package patternzen.ch17.example2;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SugarFouthGradeSchoolReport();

        sr.report();

        sr.sign("李三");
    }
}

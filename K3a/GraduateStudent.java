package K3a;

public class GraduateStudent extends Student {
    public void computeCourseGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }
        if (total/NUM_OF_TESTS >= 80) {
            courseGrade = "Pass";
        } else {
            courseGrade = "No Pass";
        }
    }

    public static void main(String[] args) {
        int[] scores = {90, 80, 85};
        GraduateStudent gs = new GraduateStudent();
        gs.setName("Ivandohan Samuel Siregar");

        for(int i = 0; i < NUM_OF_TESTS; i++) {
            gs.setTestScore(i+1, scores[i]);
        }
//        gs.setTestScore(3, 90);
//        gs.setTestScore(2, 80);
//        gs.setTestScore(1, 85);

        gs.computeCourseGrade();

        System.out.println("Name         : " + gs.getName());
        System.out.println("Grade        : " + gs.getCourseGrade());

        for(int i = 0; i < NUM_OF_TESTS; i++) {
            System.out.printf("Score test-%d : %d\n", i+1, gs.getTestScore(i+1));
        }
    }
}

package K3a;

public class UndergraduateStudent extends Student {
    public void computeCourseGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }
        if (total/NUM_OF_TESTS >= 70) {
            courseGrade = "Pass";
        } else {
            courseGrade = "No Pass";
        }
    }

    public static void main(String[] args) {
        UndergraduateStudent ugs = new UndergraduateStudent();
        ugs.setName("Van D. Ohann");

        ugs.setTestScore(3, 90);
        ugs.setTestScore(2, 80);
        ugs.setTestScore(1, 85);

        ugs.computeCourseGrade();

        System.out.println("Name  : " + ugs.getName());
        System.out.println("Grade : " + ugs.getCourseGrade());
        System.out.println("Score : " + ugs.getTestScore(3));
    }
}

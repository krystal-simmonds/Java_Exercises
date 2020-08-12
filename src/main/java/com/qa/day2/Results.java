public class Results
{
    public static void main(String[] args)
    {
        Exam result = new Exam();
        result.physics = 110;
        result.chemistry = 130;
        result.biology = 50;

        System.out.println("Exam Marks");
        System.out.println("-------------------------------------------------");
        result.printMarksSummary();
        System.out.println("-------------------------------------------------");
    }
}

class Exam
{
    // Marks in various subjects
    int physics;
    int chemistry;
    int biology;
    private Object Res;

    int getPhysicsTotal() {
        return physics;
    }
    double getPhysicsPercentage() {
        return (physics / 150.0) * 100.00;
    }

    int getChemistryTotal() {
        return chemistry;
    }
    double getChemistryPercentage() {
        return (chemistry / 150.0) * 100.00;
    }

    int getBiologyTotal() {
        return biology;
    }
    double getBiologyPercentage() {
        return (biology / 150.0) * 100.00;
    }

    int getAllSubjectsTotal()
    {
        return physics + chemistry + biology;
    }

    double getOverallPercentage() {
    return 100.0 * (physics + chemistry + biology) / 450.0;
    }

    void printMarksSummary()
    {
        System.out.println("Physics: " + getPhysicsTotal() + " (" + getPhysicsPercentage() + ")");
        System.out.println("Chemistry: " + getChemistryTotal() + " (" + getChemistryPercentage() + ")");
        System.out.println("Biology: " + getBiologyTotal() + " (" + getBiologyPercentage() + ")");
        System.out.println("Percentage Overall: " + getOverallPercentage());
        System.out.println("Total: " + getAllSubjectsTotal() + "/450.0");

        if (getOverallPercentage() < 60.00) {
            System.out.println("You have failed your final exams");
        } else if (getPhysicsPercentage() < 60.00) {
            System.out.println();
            System.out.println("congratulations! You have passed your final exams!");
        };
        Res = " ";
        if (getPhysicsPercentage() < 60.00) {
            Res = "Fail";
            System.out.println(Res);
            System.out.println("You failed your physics exam");
        };
        if (getChemistryPercentage() < 60.00) {
            Res = "Fail";
            System.out.println(Res);
            System.out.println("You failed your Chemistry exam");
        };
        if (getBiologyPercentage() < 60.00) {
            Res = "Fail";
            System.out.println(Res);
            System.out.println("You failed your Biology exam");
        };
    }

    void printMarksDetails()
    {
        System.out.println("Physics : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Biology : " + biology);
    }
}
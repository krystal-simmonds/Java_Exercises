public class Results
{
    public static void main(String[] args)
    {
        Exam result = new Exam();
        result.physics = 110;
        result.chemistry = 130;
        result.biology = 95;

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

    int getPhysicsTotal() {
        return physics;
    }

    int getChemistryTotal() {
        return chemistry;
    }

    int getBiologyTotal() {
        return biology;
    }

    int getAllSubjectsTotal()
    {
        return physics + chemistry + biology;
    }

    double getPercentage() {
    return 100.0 * (physics + chemistry + biology) / 450.0;
}

    void printMarksSummary()
    {
        System.out.println("Physics: " + getPhysicsTotal());
        System.out.println("Chemistry: " + getChemistryTotal());
        System.out.println("Biology: " + getBiologyTotal());
        System.out.println("Percentage Overall: " + getPercentage());
        System.out.println("Total: " + getAllSubjectsTotal() + "/450.0");
    }

    void printMarksDetails()
    {
        System.out.println("Physics : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Biology : " + biology);
    }
}
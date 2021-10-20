public class main {
    public static void main(String[] args) {
        ProgrammerFactory headHunter = new ProgrammerFactory();
        Programmer firstApplicant = headHunter.getProgrammer("Java");
        Programmer secondApplicant = headHunter.getProgrammer("Java");
        Programmer thirdApplicant = headHunter.getProgrammer("Python");
        firstApplicant.createProgram();
        secondApplicant.createProgram();
        thirdApplicant.createProgram();
    }
}

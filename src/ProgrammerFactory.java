public class ProgrammerFactory {
    public Programmer getProgrammer(String language)
    {
        if(language==null)
            return null;
        else if (language.equalsIgnoreCase("JAVA"))
            return new JavaProgrammer();
        else if (language.equalsIgnoreCase("C") || language.equalsIgnoreCase(".NET"))
            return new CProgrammer();
        else if (language.equalsIgnoreCase("PYTHON") || language.equalsIgnoreCase("змия"))
            return new PythonProgrammer();
        return null;
    }
}

public class Teacher {
    private String fullName;
    private String theme ;
    
    public Teacher(String fullName, String theme){
        this.fullName = fullName;
        this.theme = theme;
    }

    public void teach () {
        System.out.println("Teacher " + this.fullName+ " is teaching the \"" + this.theme+"\"");
    }
    
}

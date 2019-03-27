public class Student {
    
    private String name;
    private String surname;
    private String id;
    private double gpa;
    
    public Student(String name,String surname,String id,double gpa){
        
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.gpa=gpa;
        
        
        
    }

    public void setName(String name){
        
        this.name=name;
        
    }
    public String getName(){
        
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

 
        
    
}
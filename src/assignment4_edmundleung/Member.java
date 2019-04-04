package assignment4_edmundleung;

public class Member {
    private String name;
    private String job;
    private String notes;
    
    public Member(String name, String job, String notes) {
        this.name = name;
        this.job = job;
        this.notes = notes;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String getNotes() {
        return notes;
    }
    
    @Override
    public String toString() {
        return "Member{name=" + getName() + ", job=" + getJob() + ", notes=" + getNotes() +"}";
    }
    
    public String toCSV() {
        return "Member{name=" + getName() + ", job=" + getJob() + ", notes=" + getNotes() +"}";
    }
}

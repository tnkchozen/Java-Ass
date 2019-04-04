/**
 * Name: Edmund Leung
 * Student ID: 991531421
 * Class: PROG24178 1191_69188, Winter 2019
 * Assignment #4: The Crew
 * Date: April 5, 2019
 * Program: Member.java
 * Description: A Member class that has name, job, and notes attributes
 * along with their getters and setters.
 */
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

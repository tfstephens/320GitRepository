/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor
 */
public class Person {
    
    //a java object Person (id, firstName, lastName, date of birth, ssn, driving license, user name, password)
    private int id;
    private String fName;
    private String lName;
    private String dob;
    private int ssn;
    private int dLicense;
    private String userName;
    private String password;

    public Person()
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.ssn = ssn;
        this.dLicense = dLicense;
        this.userName = userName;
        this.password = password;
    }
     public Person(int id1, String fName1, String lName1, String dob1, int ssn1, int dLicense1, String userName1, String password1)
     {
         this.id = id1;
        this.fName = fName1;
        this.lName = lName1;
        this.dob = dob1;
        this.ssn = ssn1;
        this.dLicense = dLicense1;
        this.userName = userName1;
        this.password = password1;
     }
     
     public String getInfo()
     {
         return fName + " " + id + " " + dLicense;
     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getdLicense() {
        return dLicense;
    }

    public void setdLicense(int dLicense) {
        this.dLicense = dLicense;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

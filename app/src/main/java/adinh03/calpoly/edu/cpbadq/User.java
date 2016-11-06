package adinh03.calpoly.edu.cpbadq;

/**
 * Created by Patrick on 11/5/2016.
 */

public class User {
    private String mEmail;
    private String mFirstName;
    private String mLastName;
    private int mSkillLevel;
    private int mAdmin_Level;

    public User(String email, String firstName, String lastName, int skillLevel, int adminLevel) {
        mEmail = email;
        mFirstName = firstName;
        mLastName = lastName;
        mSkillLevel = skillLevel;
        mAdmin_Level = adminLevel;

    }

    public String getEmail() {
        return mEmail;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() { return mLastName;}

    public String getFullName() {return mFirstName + mLastName;}

    public int getSkillLevel() {
        return mSkillLevel;
    }

    public void setSkillLevel(int skillLevel) {
       mSkillLevel = skillLevel;
    }

    public int getAdminLevel() {
        return mAdmin_Level;
    }

}

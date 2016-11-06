package adinh03.calpoly.edu.cpbadq;

import java.io.Serializable;

/**
 * Created by Patrick on 11/5/2016.
 */

public class User implements Serializable
{
   private String mEmail;
   private String mFirstName;
   private String mLastName;
   private int mSkillLevel;
   private String mUserId;
   //private int mAdmin_Level;

   public User(String userId, String email, String firstName, String lastName, int skillLevel)
   {
      mUserId = userId;
      mEmail = email;
      mFirstName = firstName;
      mLastName = lastName;
      mSkillLevel = skillLevel;

   }

   public String getEmail()
   {
      return mEmail;
   }

   public String getFirstName()
   {
      return mFirstName;
   }

   public String getLastName()
   {
      return mLastName;
   }

   public String getFullName()
   {
      return mFirstName + mLastName;
   }

   public int getSkillLevel()
   {
      return mSkillLevel;
   }

   public void setSkillLevel(int skillLevel)
   {
      mSkillLevel = skillLevel;
   }


}

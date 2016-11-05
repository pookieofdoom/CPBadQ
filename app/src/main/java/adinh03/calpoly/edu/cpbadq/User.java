package adinh03.calpoly.edu.cpbadq;

/**
 * Created by Patrick on 11/5/2016.
 */

public class User {
    private String email;
    private String nickname;
    private int skill_level;
    private int admin_level;
    private String partner;

    public User(String email, String nickname, int skill_level, int admin_level, String partner) {
        this.email = email;
        this.nickname = nickname;
        this.skill_level = skill_level;
        this.admin_level = admin_level;
        this.partner = partner;

    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(int skill_level) {
        this.skill_level = skill_level;
    }

    public int getAdmin_level() {
        return admin_level;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
}

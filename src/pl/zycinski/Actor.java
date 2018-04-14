package pl.zycinski;
/**
 * @author Dominik Zycinski
 * @version 1.01, 24/03/2018
 * @see java.util
 * @since 5.0
 */



/**The class that represents Actor*/
public class Actor implements Comparable<Actor> {
    /**  @param gender Gender of the actor which is an enumerated type*/
    private Gender gender;
    /**  @param name Full name of the actor*/
    private String fullName;

    /**Default constructor*/
    public Actor(){};

    /**Through this constructor we give the actor full name and gender
     * @param fullName Full name of actor
     * @param gender Gender of actor*/
    public Actor(String fullName, Gender gender)
    {
        this.gender = gender;
        this.fullName = fullName;
    }

    /**Method returns gender of Actor
     * @return gender Gender of Actor*/
    public Gender getGender() {
        return gender;
    }

    /**Method set gender of Actor
     *  @param gender Gender of Actor*/
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    /**Method returns full name of Actor
     *  @return Full name  of Actor*/
    public String getFullName() {
        return fullName;
    }

    /**Method set full name of Actor
     * @param fullName full name of Actor*/
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**Method returns second name of Actor
     * @return Second name of Actor*/
    private String getSecondName()
    {
        String secondName[];
        secondName = fullName.split(" ");
        return secondName[1];
    }

    /**Method returns description of Actor*/
    @Override
    public String toString() {

        return  "- " + fullName +"("+ gender +")\n";
    }

    /**Method returns the actors ordered first by gender and then by second name*/
    @Override
    public int compareTo(Actor o) {

        int sGender = gender.compareTo(o.gender);
        if(sGender  != 0){
            return sGender;
        }
       return getSecondName().compareTo(o.getSecondName());
    }


}

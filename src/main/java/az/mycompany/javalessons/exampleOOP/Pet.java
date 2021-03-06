package az.mycompany.javalessons.exampleOOP;


import java.util.HashSet;
import java.util.Set;

public class Pet implements ActivitePet {
    private String species;
    private String nickname;
    private byte age;
    private byte trickLevel;
    private Set<String> habits = new HashSet<>();

    public Pet() {

    }

    public Pet(String species, String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = (byte) age;
        this.trickLevel = (byte) trickLevel;
        for (String i : habits)
            this.habits.add(i);

    }

    public String petShow() {

        return species + "\n " + nickname + "\n " + age + "\n " + trickLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (byte) age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int Level) {
        if (Level >= 1 || Level <= 100) this.trickLevel = (byte) Level;
        else System.out.println("input a Level number from 1 to 100");
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        for (String i : habits)
            this.habits.add(i);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String habitsPet(int index) {

        return nickname + " " + habits;
    }


    @Override
    public void respondPet() {
        System.out.println("'Hello, I am " + nickname + ". I miss you!'");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");

    }

}

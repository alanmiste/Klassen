package model;

public class ComputerScienceStudent extends Student {

    String favoriteProgramingLanguage;

    public ComputerScienceStudent(int id, String firstName, String lastName, int age, String favoriteProgramingLanguage) {
        super(id, firstName, lastName, age);
        this.favoriteProgramingLanguage = favoriteProgramingLanguage;
    }

    public String getFavoriteProgramingLanguage() {
        return favoriteProgramingLanguage;
    }

    public void setFavoriteProgramingLanguage(String favoriteProgramingLanguage) {
        this.favoriteProgramingLanguage = favoriteProgramingLanguage;
    }


}

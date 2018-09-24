package company.instadrunk;

public class Player {

    private String name;
    private String sexe;

    public Player(String name, String sexe) {
        this.name = name;
        this.sexe = sexe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSexe() {
        return this.sexe;
    }


}

package pl.rapid.simplefactory;

public class Dog  extends Animal {

    private String race;

    private String barkVolume;


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(String barkVolume) {
        this.barkVolume = barkVolume;
    }
}

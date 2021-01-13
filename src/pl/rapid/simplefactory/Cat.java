package pl.rapid.simplefactory;

public class Cat extends Animal {

    private String race;

    private String meowVolume;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getMeowVolume() {
        return meowVolume;
    }

    public void setMeowVolume(String meowVolume) {
        this.meowVolume = meowVolume;
    }
}

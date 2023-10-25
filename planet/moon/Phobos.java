package planet.moon;

import planet.Mars;

public class Phobos {

    private Mars mars;
    private String destination;

    public Phobos(Mars mars) {
        this.mars = mars;
        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(Mars mars, String destination) {
        this.mars = mars;
        this.destination = destination;
        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(String destination) {
        this.destination = destination;
        System.out.println("No planet given.");
    }

    public Phobos(){
        System.out.println("No planet given.");
    }

    public Mars getMars() {
        return mars;
    }

    public String getLandingSite() {
        return this.destination;
    }

}

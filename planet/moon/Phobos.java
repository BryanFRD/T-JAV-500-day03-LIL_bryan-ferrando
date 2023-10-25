package planet.moon;

import planet.Mars;

public class Phobos {

    private Mars mars;

    public Phobos(Mars mars) {
        this.mars = mars;
        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(){
        System.out.println("No planet given.");
    }

    public Mars getMars() {
        return mars;
    }
}

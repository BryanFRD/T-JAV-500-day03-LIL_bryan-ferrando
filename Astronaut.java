public class Astronaut {

    private static int count = 0;
    private int id = count++;
    private String name;
    private int snacks = 0;
    private String destination = null;

    public Astronaut(String name) {
        this.name = name;
        System.out.println(name + " ready for launch!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSnacks() {
        return snacks;
    }

    public static int getCount() {
        return count;
    }

    public String getDestination() {
        return destination;
    }

}

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private List<Astronaut> astronauts = new ArrayList<>();

    public Team(String teamName){
        this.teamName = teamName;
    }

    public void add(Astronaut astronaut){
        this.astronauts.add(astronaut);
    }

    public void remove(Astronaut astronaut){
        this.astronauts.remove(astronaut);
    }

    public int countMembers(){
        return this.astronauts.size();
    }

    public void showMembers(){
        if(this.astronauts.isEmpty()){
            return;
        }

        StringBuilder sb = new StringBuilder(this.teamName + ": ");
        astronauts
                .forEach(astronaut -> sb
                        .append(astronaut.getName())
                        .append(astronaut.getDestination() == null ? " on standby" : " on mission")
                        .append(", "));
        System.out.println(sb.substring(0, sb.length() - 2) + ".");
    }

}

package EnumExample;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday // enum constants
    }

    public static void main(String[] args) {
        Week week ;
        week = Week.Tuesday;

        for(Week day : week.values()){ //value() iterates through the enum
            System.out.println(day);
        }

        System.out.println(week.ordinal());//ordinal returns the index value of the enum variable
    }
}

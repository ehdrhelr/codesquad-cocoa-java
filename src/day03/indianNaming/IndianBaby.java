package day03.indianNaming;

public class IndianBaby {

    private String name = "";

    IndianBaby (String[] birth) {
        IndianNaming naming = new IndianNaming(birth);
        this.name = naming.getName();
    }

    public String getName() {
        return this.name;
    }
}

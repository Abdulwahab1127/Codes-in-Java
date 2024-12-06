class Class {


    private int id;
    private String Name;

    //Getter Using Here to Get Private Value
    public int getId() {
        return id;
    }
    //Setter Using Here to Set Private Value
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {

        Class Sample = new Class();
        //Setting The Values For Private Variables
        Sample.setId(12);
        Sample.setName("Abdul Wahab");


        System.out.println(Sample.getId());
        System.out.println("");
        System.out.println(Sample.getName());



    }
}

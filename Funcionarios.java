package entites;

public class Funcionarios {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionarios(){
    }


    public Funcionarios(Integer id , String name , Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100;
    }

    public String toString(){
        return id + "," + name + "," + String.format("%.2f", salary);
    }

}

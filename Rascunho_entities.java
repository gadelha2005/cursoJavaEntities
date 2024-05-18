package entites;


public class Rascunho_entities {
    
  private String name;
  private double nota1;
  private double nota2;

  public Rascunho_entities(String name , double nota1 , double nota2){
    this.name = name;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public String getName() {
    return name;
  }

  public double getNota1() {
    return nota1;
}

public double getNota2() {
    return nota2;
}

public double media(){
    return nota1 + nota2 / 2;
}





}

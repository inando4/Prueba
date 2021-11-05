public class Persona {
    private String name;
    private int edad;
    private String sexo;
    
    Persona() {
        this("Persona", 0, "F");
    }
    Persona(String name, int edad, String sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String getName() {
        return name;
    }
    public int getEdad() {
        return edad;
    }
    public boolean equals(Persona p) {
        return name.equals(p.getName()) && edad == p.getEdad();
    }
    public String toString() {
        return name + " " + edad + " " + sexo;
    }
}
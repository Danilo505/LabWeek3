package Question3;

public class Titular implements Professor{
    private String materia;

    public Titular(String materia) {
        this.materia = materia;
    }

    @Override
    public void teach() {
        System.out.println("Ensinando "+materia);
    }

}
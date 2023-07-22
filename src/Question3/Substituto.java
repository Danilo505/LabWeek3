package Question3;

public class Substituto implements Professor{
    private String[] materias = new String[1];
    @Override
    public void teach() {
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ensinando "+materias[i]);
        }
    }
    public void assign(String materia){
        if (materias[materias.length - 1] == null){
            materias[materias.length -1] = materia;
        }else{
            int index = materias.length + 1;
            String[] newMaterias = new String[index];
            System.arraycopy(materias,0,newMaterias,0,materias.length);
            materias = newMaterias;
            materias[index - 1] = materia;
        }
    }
}
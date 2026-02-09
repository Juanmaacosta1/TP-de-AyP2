public class HospitalTest {

    public static void main(String[] args) {
        Personal medico1 = new Medico(767, "Dr.Messi", 9);
        Personal enfermero1 = new Enfermero(123, "Enfermero Cr7", 3);

        Paciente paciente1 = new Paciente("Bruno", "45803320");
        Paciente paciente2 = new Paciente("Juan", "45234567");
        Paciente paciente3 = new Paciente("Carlos", "45234567");
        Paciente paciente4 = new Paciente("Pepe", "45234567");
        Paciente paciente5 = new Paciente("Pancho", "45234567");


        Turno turno1 = new Turno("Martes", "17pm", medico1, paciente1);
        Turno turno2 = new Turno("Lunes", "18pm", enfermero1, paciente2);
        Turno turno3 = new Turno("Lunes", "18pm", enfermero1, paciente3);
        Turno turno4 = new Turno("Lunes", "18pm", medico1, paciente4);
        Turno turno5 = new Turno("Lunes", "18pm", medico1, paciente5);

        Personal[] personal = new Personal[5];
        personal[0]=medico1;
        personal[1]=enfermero1;

        for(int i=0; i<personal.length; i++){
            if(personal[i]!=null){
                System.out.println("Nombre: "+personal[i].getNombre()+", Sueldo:"+personal[i].calcularSueldo());
            }
        }

        Turno[] turnos = new Turno[10];
        turnos[0]=turno1;
        turnos[1]=turno2;
        turnos[2]=turno3;
        turnos[3]=turno4;
        turnos[4]=turno5;

        System.out.println("Lista de pacientes para "+medico1.getNombre()+": ");
        for(int i=0; i<turnos.length; i++){
            if(turnos[i]!=null){
                if(turnos[i].getMedico()==medico1)
                System.out.println(turnos[i].getPaciente().getNombre());
            }
        }
        





    }
    
}

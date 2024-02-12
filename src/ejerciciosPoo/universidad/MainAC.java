package universidad;

import java.util.ArrayList;
import java.util.List;

/*public class MainAC {
    public static void main(String[] args) {

        AC cienciasDeLaSalud = new AC(98, "Ciencias de la Salud");
            Departamento anatomia = new Departamento(981, "Departamento de anatomía", cienciasDeLaSalud);
            cienciasDeLaSalud.addDepartamento(anatomia);

                List<Profesor> profesores = new ArrayList<>();
                Profesor maria = new Profesor("Maria", 981,anatomia);
                Profesor mar = new Profesor("Mar", 981,anatomia);
                anatomia.addProfesores(maria);
                anatomia.addProfesores(mar);
                    Facultad medicina = new Facultad(99, "Facultad de Medicina");
                        Catedra c1 = new Catedra(91, "Catedra del Departamento de anatomia", anatomia, medicina);
                        anatomia.addCatedras(c1);
                        medicina.addCatedras(c1);

        AC cienciasDeLaTecnologia = new AC(99, "Ciencias de la Tecnologia");
            Departamento informatica = new Departamento(991, "Departamento de Infofrmatica", cienciasDeLaTecnologia);
            cienciasDeLaTecnologia.addDepartamento(informatica);
                Profesor juan = new Profesor("Juan", 991, informatica);
                informatica.addProfesores(juan);
                    Facultad tecnologia = new Facultad(98, "Fcaultad de Tecnología");
                        Catedra c2 = new Catedra(92, "Catedra del Departamento de informática", informatica, tecnologia);
                        informatica.addCatedras(c2);
                        tecnologia.addCatedras(c2);



       //imprimir areas de conocimiento -- profesores
        System.out.println(cienciasDeLaSalud);
        System.out.println(cienciasDeLaTecnologia);

        //imprimir departamentos
        System.out.println(cienciasDeLaSalud.getDepartamentos());
        System.out.println(cienciasDeLaTecnologia.getDepartamentos());

        //imprimir profesores del ac
        for ( Departamento departamento : cienciasDeLaSalud.getDepartamentos()) {
            for ( Profesor profesor : departamento.getProfesores()) {
                System.out.println(profesor);
            }

        }

        //facultad -- ac
        for ( Departamento departamento : cienciasDeLaSalud.getDepartamentos()
             ) {
            for ( Catedra catedra : anatomia.getCatedras()
                 ) {
                System.out.println(catedra.getFacultad());
                
            }
            
        }

    }
}*/

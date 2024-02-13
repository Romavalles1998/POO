package ejerciciosPoo.banco;

import java.util.HashSet;

/*public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco("BBVA",100, new HashSet<>());
        CC cc1 = new CC(645, "Cuenta de María: ");
        Sucursal sMayor = new Sucursal(11,"C/ Mayor", bbva, cc1);
        Cliente maria = new Cliente(1,"Maria",sMayor);
            Prestamo p1 = new Prestamo(99,1000,sMayor,maria);
                 sMayor.addPrestamo(p1);
                 CC = new CC(1,1000,new HashSet<>());
                 cuentacorrienteMaria.addCliente(maria);
                 maria.addCuentaCorriente(cuentacorriente);
        Cliente pepe = new Cliente(1,"Pepe",sMayor);
            Prestamo p2 = new Prestamo(100,5000,sMayor,pepe);
                 sMayor.addPrestamo(p2);
                    pepe.addPrestamo(p1);

        CC cc2 = new CC(645, "Cuenta de María: ");
        Sucursal sEnmedio = new Sucursal(12,"C/ Enmedio", bbva,cc2);
        Cliente juan = new Cliente(1,"Juan",sEnmedio);
            Prestamo p3 = new Prestamo(99,2000,sEnmedio,juan);
                sEnmedio.addPrestamo(p3);
                    juan.addPrestamo(p3);

        bbva.addSucursal(sMayor);
        bbva.addSucursal(sEnmedio);

        System.out.println(bbva);
        for (Sucursal s: bbva.getSucursales()) {
            System.out.println("\t"+s);
            for (Prestamo p:s.getPrestamos()) {
                System.out.println("\t\t"+p);
                System.out.println("\t\t"+p.getCliente());
            }
        }
        //Quiero saber el nombre del banco de la sucursal sMayor
        System.out.println(sMayor.getBanco().getNombre());
        System.out.println(p3.getSucursal().getBanco().getNombre());
        p2.getSucursal().getBanco().getSucursales().forEach(System.out::println);

        }
        for
    }*/


import edu.formacion.model.Cliente;

import java.util.Date;

public class UsoCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "juan@gmail.com", "950102030", true, new Date(), 1000.0);
        System.out.println(cliente.toString());

    }//cierra main

}//cierra clase
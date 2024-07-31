import edu.formacion.model.Producto;

import java.util.Date;

public class UsoProducto {

    public static void main(String[] args) {
        //instanciar una clase. Crear en memoria un objeto basado en una clase Model
        Producto producto = new Producto("Producto1", 10, 100.0, new Date());//insert - create
        producto.setUnidades(8); //update
        System.out.println(producto.getUnidades());//read - select
     //   producto=null; //delete
        //si delete, convertir a null un objeto, luego NO puedes usar los métodos de su clase
        producto.info();
        System.out.println(producto.getFechaEntrega());
        System.out.println(producto.getFechaEntregaFormatter());
        System.out.println(producto.getFechaEntregaFormatter2());
        producto.setPrecio(9.93);
        producto.calcularFactura();
    }//cierra main



}//cierra clase

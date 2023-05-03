import java.util.Date;

public interface IScheduleable {

    // METODO ABSTRACTO  -  OBLIGATORIO IMPLEMENTARLO 
    void schedule(Date date, String time);

    // DEFAULT METHODS PROPORCIONA QUE NO SEA OBLIGATORIO IMPLEMENTAR EL METODO
    default void metodoConcreto(){
        System.out.println("Un metodo concreto en interfaz puede contar xcon implementacion");
        System.out.println("No es obligatorio implemenarlo en las clases que derivan de la interfaz");
    }

    // STATIC METHODS DE IGUAL FORMA PERO ESTE TIPO NO SE PUEDE SOBREECRIBIR 
    static void metodoEstatico(){
        System.out.println("Ejemplo de metodo estatico en una interfaz");
        System.out.println("No puede ser sobreecrito");
    }

    
}

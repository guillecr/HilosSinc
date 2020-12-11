package main;

public class hiloSinc implements Runnable{
    Thread hilo;
    static escribirPantalla sumarray = new escribirPantalla();
    int a[];
    static int resp;

    //Construye un nuevo hilo.
    hiloSinc(String nombre, int nums[]){
        hilo= new Thread(this, nombre);
        a=nums;
    }

    //Un método que crea e inicia un hilo
    public static hiloSinc creaEInicia (String nombre, int nums[]){
        hiloSinc miHilo=new hiloSinc(nombre, nums);

        miHilo.hilo.start(); //Inicia el hilo
        return miHilo;
    }
    
    //Punto de entrada del hilo
    @Override
    public void run(){
        System.out.println(hilo.getName()+ " iniciando.");

        /* 
        La gracia que el metodo es estatico, es decir, todos los hilos acceden a un metodo de la clase
        Por ello, la variable sum de la esa clase es común a todos. Si no se aplica de manera hordenada, todos 
        accederán a esa variable y se pisarán entre ellos. 
        */
        
        resp=hiloSinc.sumarray.sumaArray(a); 
        System.out.println("Suma para " + hilo.getName() + " es " + resp);
        System.out.println(hilo.getName() + " terminado.");
    }
}  
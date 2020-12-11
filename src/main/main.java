package main;

class Sincronizacion {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        hiloSinc mh1 = hiloSinc.creaEInicia("#1",a);
        hiloSinc mh2 = hiloSinc.creaEInicia("#2",a);
        hiloSinc mh3 = hiloSinc.creaEInicia("#3",a);
        
    }
}

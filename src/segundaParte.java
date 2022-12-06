public class segundaParte {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.AgregarPuerta();
        System.out.println(micoche.puertas);
    }
}

class Coche{
    public int puertas = 0;
    
    public void AgregarPuerta() {
        this.puertas++;
    }
}

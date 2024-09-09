package Instrucoes1e2;

public class Esfera {
private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }


    public float calcularVolume() {
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(raio, 3));
    }

    public float calcularArea() {
        return (float) (4 * Math.PI * Math.pow(raio, 2));
    }

}

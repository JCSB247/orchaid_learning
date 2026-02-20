public class HuertoVariables {

    public static void main(String[] args){

        String zona = "patch_1";
        double humedad = 67.6;
        double temp = 22.5;
        boolean rain = false;
        int sensorId = 55;
        String timestamp = "12/01/2026";

        System.out.println("Valores metereológicos recibidos:");
        System.out.println("Zona: "+zona);
        System.out.println("Humedad: "+humedad);
        System.out.println("Temperatura: "+temp);
        System.out.println("Lluvia: "+rain);
        System.out.println("Sensor: "+sensorId);
        System.out.println("Fecha: "+timestamp);
    }
}

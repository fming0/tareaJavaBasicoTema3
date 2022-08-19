package package1;

public class Main {
    public static void main(String[] args) {
        String[] nombres ={"Fabio","Nicolas","Macarena" };
        String cadena="";
        for (int i=0;i<nombres.length;i++){
            cadena+=" "+nombres[i];

        }
        System.out.println(cadena);
    }
}

import com.aluracursos.conversordemonedas.calcularapi.BuscarMoneda;
import com.aluracursos.conversordemonedas.calcularapi.CalcularMoneda;
import com.aluracursos.conversordemonedas.modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lecturaDato = new Scanner(System.in);
        while(true){
            mostrarMensajes();

            try {
                int opcion = Integer.valueOf(lecturaDato.next());
                if(opcion == 13){
                    break;
                }

                String abreviaturaMoneda;
                BuscarMoneda buscarMoneda = new BuscarMoneda();
                CalcularMoneda calcularMoneda = new CalcularMoneda();
                Moneda monedaBuscada;
                switch (opcion){
                    case 1:
                        abreviaturaMoneda = "PEN";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularDolares(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 2:
                        abreviaturaMoneda = "PEN";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularMonedas(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 3:
                        abreviaturaMoneda = "ARS";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularDolares(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 4:
                        abreviaturaMoneda = "ARS";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularMonedas(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 5:
                        abreviaturaMoneda = "BRL";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularDolares(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 6:
                        abreviaturaMoneda = "BRL";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularMonedas(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 7:
                        abreviaturaMoneda = "COP";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularDolares(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 8:
                        abreviaturaMoneda = "COP";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularMonedas(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 9:
                        abreviaturaMoneda = "MXN";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularDolares(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 10:
                        abreviaturaMoneda = "MXN";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularMonedas(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 11:
                        abreviaturaMoneda = "CRC";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularDolares(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    case 12:
                        abreviaturaMoneda = "CRC";
                        monedaBuscada = buscarMoneda.buscar(abreviaturaMoneda);
                        calcularMoneda.calcularMonedas(monedaBuscada.getValor(), abreviaturaMoneda);
                        break;
                    default:
                        System.out.println("Ingresa una opción válida, por favor, disculpa :) ");
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("*************************************************************************");
        }

    }

    public static void mostrarMensajes(){
        System.out.println("******** ELIGA UNA OPCIÓN A CONVERTIR *******");
        System.out.println(""" 
                               1). Dolar ===> moneda peruana
                               2). moneda peruana ====> dolar
                               3). Dolar ===> peso argentino
                               4). Peso argentino ====> dolar1
                               5). Dolar ===> real brasileño
                               6). real brasileño ====> dolar
                               7). Dolar ===> peso colombiano
                               8). peso colombiano ====> dolar
                               9). Dolar ===> peso mexicano
                               10).peso mexicano ====> dolar
                               11).Dolar ===> Colón costarricense
                               12).Colón costarricense ====> dolar
                               13).salir 
                               """);
        System.out.println("******************************************************");
    }

}


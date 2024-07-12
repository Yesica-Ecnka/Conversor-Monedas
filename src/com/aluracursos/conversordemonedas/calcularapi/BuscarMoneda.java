package com.aluracursos.conversordemonedas.calcularapi;
import com.aluracursos.conversordemonedas.modelos.Moneda;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BuscarMoneda {

    public Moneda buscar(String abreviacion) throws IOException {
        Moneda moneda = null;

        try {
            //ponemos la url
            String direccion = "https://v6.exchangerate-api.com/v6/2710b59595a02b090825884d/latest/USD";

            //Solicitamos
            URL url = new URL(direccion);
            HttpsURLConnection request = (HttpsURLConnection) url.openConnection();
            request.connect();

            //Conversion a Json
            JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
            JsonObject jsonObject = root.getAsJsonObject();

            //obtendremos el Json interna con la clave "conversion_rates"
            JsonObject jsonDeAdentro = jsonObject.getAsJsonObject("conversion_rates");

            for (String clave : jsonDeAdentro.keySet()){
                if(clave.equals(abreviacion)){
                    JsonElement valor = jsonDeAdentro.get(clave);
                    double valorDouble = valor.getAsDouble();
                    moneda = new Moneda(clave, valorDouble);
                    break; //Salimos de bucle sí se encuentra la moneda.
                }
            }
        } catch (Exception e){
            System.out.println("Surgió un error :( : " + e.getMessage());
        }
        return moneda;
    }
}

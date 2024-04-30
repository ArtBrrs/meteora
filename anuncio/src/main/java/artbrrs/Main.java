package artbrrs;

import artbrrs.model.Anuncio;
import artbrrs.model.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product("Bandagem 5 mts", "Bandagens para proteção dos punhos durante a prática de artes marciais",
                "Sports");

        Anuncio anuncio = new Anuncio(product, 59.90, 5);

        System.out.println(product);


    }
}
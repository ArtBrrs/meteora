package artbrrs.model;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioTest {

    @org.junit.jupiter.api.Test
    void getQnt() {

        Product product = new Product("Bandagem 5 mts", "Bandagens para proteção dos punhos durante a prática de artes marciais",
                "Sports");

        Anuncio anuncio = new Anuncio(product, 59.90, 5);

        Assertions.assertEquals(5, anuncio.getQnt());
    }
}
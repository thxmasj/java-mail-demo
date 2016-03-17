package it.thomasjohansen.demo.email;

import org.junit.Test;

import static java.util.Collections.singletonList;

public class EmailSenderTest {

    @Test
    public void test() {
        EmailSender.builder()
                .from("Thomas Johansen <thxmasj@gmail.com>")
                .host("10.243.200.182")
                .port(25)
                .protocol("smtp")
                .build()
                .send("A subject æøåÆØÅ", "A body ææåÆØÅ", singletonList("thomas@thomasjohansen.it"));
    }

}

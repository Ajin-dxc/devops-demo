package com.example.backendservice.api;

//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
//import org.springframework.test.web.reactive.server.WebTestClient.RequestHeadersUriSpec;

//@SpringBootTest(webEnvironment=RANDOM_PORT)
@SpringBootTest
public class GreetController {

@Autowired
private WebTestClient client;    

@Test
  public void greetApiTest(){
          client.get().uri("api/greet").accept(MediaType.TEXT_PLAIN)
          .exchange().expectStatus().isOk()
          .expectHeader().contentType(MediaType.TEXT_PLAIN);
    }
}

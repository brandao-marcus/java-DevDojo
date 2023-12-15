package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(5).name("MADHOUSE").build();
        //    ProducerService.save(producer);
        //   ProducerService.delete(9);
        // ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findAll();
        log.info("Producers found: '{}'", producers);
    }
}

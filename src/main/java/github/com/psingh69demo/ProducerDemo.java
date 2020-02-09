package github.com.psingh69demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class ProducerDemo {

    public static void main(String[] args) {
        //System.out.println("Hello Kafka");

        // create PRODUCER properties
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //crete the PRODUCER
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);

        //create data
        ProducerRecord<String, String> record =
                new ProducerRecord<String, String>("second_topic", "Hello Kafka!!");

        //send data
        producer.send(record);

        // flush data
        producer.flush();

        //close producer
        producer.close();
    }
}

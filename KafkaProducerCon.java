//package com.databps.bigdaf.admin.config;
//
//import org.apache.kafka.clients.producer.Producer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Properties;
//
//@Configuration
//public class KafkaProducerCon {
//    @Value("${kafka.producer.servers}")
//    private String servers;
//    @Value("${kafka.producer.acks}")
//    private String acks;
//    @Value("${kafka.producer.retries}")
//    private int retries;
//    @Value("${kafka.producer.batch.size}")
//    private int batchSize;
//    @Value("${kafka.producer.linger}")
//    private int linger;
//    @Value("${kafka.producer.buffer.memory}")
//    private int bufferMemory;
//
//    public Producer<String, String> getProducer(){
//        Properties props = new Properties();
//        props.put("bootstrap.servers", servers);
//        props.put("acks", acks); //ack方式，all，会等所有的commit最慢的方式
//        props.put("retries", retries); //失败是否重试，设置会有可能产生重复数据
//        props.put("batch.size", batchSize); //对于每个partition的batch buffer大小
//        props.put("linger.ms", linger);  //等多久，如果buffer没满，比如设为1，即消息发送会多1ms的延迟，如果buffer没满
//        props.put("buffer.memory", bufferMemory); //整个producer可以用于buffer的内存大小
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        Producer<String, String> producer = new org.apache.kafka.clients.producer.KafkaProducer<>(props);
//        return producer;
//    }
//
//}

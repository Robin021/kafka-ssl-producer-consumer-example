package com.gaurav.kafka.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import com.gaurav.kafka.constants.IKafkaConstants;

public class ProducerCreator {

	public static Producer<Long, String> createProducer() {
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
		props.put(ProducerConfig.CLIENT_ID_CONFIG, IKafkaConstants.CLIENT_ID);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(IKafkaConstants.SECURITY_PROTOCOL, IKafkaConstants.PROTOCOL_NAME);
		props.put(IKafkaConstants.SSL_TRUSTSTORE_LOCATION, IKafkaConstants.TRUSTSTORE_LOCATION);
		props.put(IKafkaConstants.SSL_TRUSTSTORE_PASSWORD, IKafkaConstants.TRUSTSTORE_PASSWORD);
		props.put(IKafkaConstants.SSL_KEYSTORE_LOCATION, IKafkaConstants.KEYSTORE_LOCATION);
		props.put(IKafkaConstants.SSL_KEYSTORE_PASSWORD, IKafkaConstants.KEYSTORE_PASSWORD);
		props.put(IKafkaConstants.SSL_KEY_PASSWORD, IKafkaConstants.KEY_PASSWORD);

		return new KafkaProducer<>(props);
	}
}
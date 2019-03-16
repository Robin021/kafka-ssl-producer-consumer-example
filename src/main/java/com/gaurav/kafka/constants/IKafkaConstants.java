package com.gaurav.kafka.constants;

public interface IKafkaConstants {
	public static String KAFKA_BROKERS = "192.168.82.39:9092";
	
	public static Integer MESSAGE_COUNT=1000;
	
	public static String CLIENT_ID="client1";
	
	public static String TOPIC_NAME="sslTest2";
	
	public static String GROUP_ID_CONFIG="consumerGroup10";
	
	public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
	
	public static String OFFSET_RESET_LATEST="latest";
	
	public static String OFFSET_RESET_EARLIER="earliest";
	
	public static Integer MAX_POLL_RECORDS=1;

	public static final String SECURITY_PROTOCOL = "security.protocol";

	public static final String SSL_TRUSTSTORE_LOCATION = "ssl.truststore.location";

	public static final String SSL_TRUSTSTORE_PASSWORD = "ssl.truststore.password";

	public static final String SSL_KEYSTORE_LOCATION = "ssl.keystore.location";

	public static final String SSL_KEYSTORE_PASSWORD = "ssl.keystore.password";

	public static final String SSL_KEY_PASSWORD = "ssl.key.password";

	public static String PROTOCOL_NAME = "SSL";

	public static String TRUSTSTORE_LOCATION = "/home/user/ssl-test_old/kafka.client.truststore.jks";

	public static String TRUSTSTORE_PASSWORD = "hello123";

	public static String KEYSTORE_LOCATION = "/home/user/ssl-test_old/kafka.client.keystore.jks";

	public static String KEYSTORE_PASSWORD = "hello123";

	public static String KEY_PASSWORD = "hello123";



}

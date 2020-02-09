# KafkaLearning

create kafka topics :
**************************************************
kafka-topics.bat --zookeeper localhost:2181 --create --topic first_topic --partition 2 --replication-factor 1

list kafka topics :
***************************************************
kafka-topics.bat --zookeeper localhost:9092 --list

describe topics:
*************************************************
kafka-topics.bat --zookeeper localhost:9092 --topic first_topic --describe

console producer :
***********************************************
kafka-console-producer.bat --broker-list localhost:9092 --topic first_topic

console consumer:
**********************************************
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first-topic
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first-topic --from-beginning

console consumer group:
*********************************************
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first_topic --group my_first_cons_grp

Based on the partition on topics, message will be routed to different windows.

kafka-consumer-groups:
**********************************************


reset offsets:
*******************************************************

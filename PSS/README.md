# Spring Microservices
Code repository for [Spring Microservices]

# Rabbit MQ Mac Commands
  * brew services restart rabbitmq
  * create queues CheckINQ,SearchQ

# Order of applications to run
  * java -jar target/fares-1.0.jar
  * java -jar target/search-1.0.jar
  * java -jar target/checkin-1.0.jar
  * java -jar target/book-1.0.jar
  * java -jar target/website-1.0.jar

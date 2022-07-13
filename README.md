# Rabbitmq_example

Run RabbitMQ through Docker:
 - Clone project: git clone https://github.com/hoangnhat2003/Rabbitmq_example.git
 - Type command: mvn clean install
 - Type command: docker-compose up -d --build
 - Type command: docker exec [CONTAINER_NAME] rabbitmq-plugins enable rabbitmq_management
 - Truy cập vào RabbitMQ Web Admin: `http://localhost:15672`, Default account : Username: guest/Password: guest 

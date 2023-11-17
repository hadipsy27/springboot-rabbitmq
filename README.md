## springboot-rabbitmq

#### RabbitMQ from Docker
1. Pull RabbitMQ From Docker Hub
`docker pull rabbitmq:3.12.8-management`
2. Run the RabbitMQ From Docker
`docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.12.8-management`
   - 15672 is Port of RabbitMQ Management Website
   - 5672 is port to connection with springboot application with the RabbitMQ broker using RabbitMQ Client

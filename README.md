## springboot-rabbitmq

#### RabbitMQ from Docker
1. Pull RabbitMQ From Docker Hub
`docker pull rabbitmq:3.12.8-management`
2. Run Docker Dekstop
3. Run the RabbitMQ From Docker
`docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.12.8-management`
   - 15672 is Port of RabbitMQ Management Website
   - 5672 is port to connection with springboot application with the RabbitMQ broker using RabbitMQ Client
4. To Send message to RabbtMQ you can use the url like this
   - `localhost:8080/api/v1/publish?message=Hello`
5. To check the message you must to login RabbitMQ Website
   - `localhost:15672`
   - username : guest
   - password : guest
6. You can check created Exchange tab Exchange
7. If you want to check message sent, in tab Queue and Stream
   - Click name of Queue
   - And click button Get Message

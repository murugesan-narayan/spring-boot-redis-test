### spring Boot Redis

    This application demonstrates how to use redis cache in spring boot

To Pull and Run Redis:
   
    docker pull redis
    docker run -d -p 6379:6379 --name my-redis redis

To Build Image:

    mvn clean spring-boot:build-image
    
To Run Container:

    docker run -p 10091:10091 --name springbootredis spring-boot-redis-test:1.0-SNAPSHOT
    
To Test:

   Import the [test json collection file](springboot_redis_tutorial_postman_collection.json) to postman app

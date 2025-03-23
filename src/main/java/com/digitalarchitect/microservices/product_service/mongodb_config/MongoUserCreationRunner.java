package com.digitalarchitect.microservices.product_service.mongodb_config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoUserCreationRunner {

//    @Bean
//    public CommandLineRunner createMongoUser(MongoClient mongoClient) {
//        return args -> {
//            MongoDatabase database = mongoClient.getDatabase("admin");
//            database.runCommand(new org.bson.Document("createUser", "admin")
//                    .append("pwd", "password")
//                    .append("roles", new org.bson.Document("role", "readWrite")
//                            .append("db", "product-service")));
//        };
//    }
}

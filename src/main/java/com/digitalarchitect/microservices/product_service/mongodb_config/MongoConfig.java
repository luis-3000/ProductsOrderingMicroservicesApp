package com.digitalarchitect.microservices.product_service.mongodb_config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

/*    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017"); // Update with your MongoDB connection string
    }

    @Bean
    public void createMongoUser(MongoClient mongoClient) {
        MongoDatabase database = mongoClient.getDatabase("admin");
        database.runCommand(new org.bson.Document("createUser", "admin")
                .append("pwd", "password")
                .append("roles", new org.bson.Document("role", "readWrite")
                        .append("db", "product-service")));
    }*/
}

package task12_3_1.zadanye3_2;

import com.mongodb.client.*;
import org.bson.Document;

// Команда в терминале для создания базы данных PostgreSQL: docker run --name postgresTest -d -p 5432:5432 -e POSTGRES_DB=somedbPGtest -e POSTGRES_USER=someuser -e POSTGRES_PASSWORD=123 postgres:alpine
// Значения параметров для настройки соединения в DBeaver (пришли в ответ на команду в терминале: docker inspect postgresTest
// Сервер (Хост): 172.17.0.2 (нужно писать localhost вместо этого)
// База данных: somedbPGtest
// Пользователь: someuser
// Пароль: 123
// Для проверки настроек можно сделать такой тестовый запрос:  "select * from users" в DB Browser в папке "Consoles -→ somedbPGtest"

public class Zadanye3_2 {

    private static final String URL = "jdbc:postgresql://localhost:5432/somedbPGtest";
    private static final String USER = "someuser";
    private static final String PASSWORD = "123";

    public static void main(String[] args) {
        System.out.println("""
            Модуль 12. Базы данных и Git. Задание №5:
            Задание:
            1. Напишите запрос MongoDB для отображения всех данных из представленной таблицы
            
            Решение (при каждом последующем запуске кода перезагрузите соединение
                    с базой данных somedbPostgres, т.е. нажмите disconnect' и затем
                    'connect' в блоке 'DB Browser' внутри 'IntelliJ IDEA'
                    и обновите папку 'public' внутри базы данных):
            """);

        String connectionString = "mongodb://localhost:27017/mongoTest2";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("mongoTest2");

            // Создаем коллекцию users
            MongoCollection<Document> collection = database.getCollection("users");

            // Создаем и добавляем несколько документов в коллекцию
            Document doc1 = new Document("name", "Alice").append("age", 30);
            Document doc2 = new Document("name", "Bob").append("age", 25);
            Document doc3 = new Document("name", "Charlie").append("age", 35);

            collection.insertOne(doc1);
            collection.insertOne(doc2);
            collection.insertOne(doc3);

            System.out.println("Collection 'users' created and documents inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

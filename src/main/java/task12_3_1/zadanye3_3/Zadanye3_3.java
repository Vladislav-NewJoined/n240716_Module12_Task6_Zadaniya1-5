package task12_3_1.zadanye3_3;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

// Команда в терминале для создания базы данных PostgreSQL: docker run --name postgresTest -d -p 5432:5432 -e POSTGRES_DB=somedbPGtest -e POSTGRES_USER=someuser -e POSTGRES_PASSWORD=123 postgres:alpine
// Значения параметров для настройки соединения в DBeaver (пришли в ответ на команду в терминале: docker inspect postgresTest
// Сервер (Хост): 172.17.0.2 (нужно писать localhost вместо этого)
// База данных: somedbPGtest
// Пользователь: someuser
// Пароль: 123
// Для проверки настроек можно сделать такой тестовый запрос:  "select * from users" в DB Browser в папке "Consoles -→ somedbPGtest"

public class Zadanye3_3 {
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


        // Подключение к MongoDB
//        try (MongoClient mongoClient = MongoClients.create("{your connection string}")) {
        try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
//            MongoDatabase database = mongoClient.getDatabase("your_database_name");
//            MongoCollection<Document> collection = database.getCollection("your_collection_name");
//
//            // Вывод всех данных из коллекции
//            for (Document doc : collection.find()) {
//                System.out.println(doc.toJson());
//            }
        } catch (Exception e) {
            System.err.println("Ошибка при работе с MongoDB: " + e.getMessage());
        }





    }
}

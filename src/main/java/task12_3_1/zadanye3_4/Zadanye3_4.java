package task12_3_1.zadanye3_4;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

// Команда в терминале для создания базы данных
// Значения параметров для настройки соединения
// Сервер (Хост): localhost
// База данных: mmongoTest
// Пользователь: не указан (Аутентификации по пользователю нет)
// Пароль: не указан (Аутентификации по паролю нет)
// Для проверки настроек можно сделать такой тестовый запрос:  "select * from users" в DB Browser в папке "Consoles -→ somedbPGtest"

public class Zadanye3_4 {
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


        try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Подключаемся к базе данных "mongoTest"
            MongoDatabase database = mongoClient.getDatabase("mongoTest");

            // Создаем коллекцию, если она еще не существует
            if (!database.listCollectionNames().into(new ArrayList<>()).contains("mongoTestCollection")) {
                database.createCollection("mongoTestCollection");
                System.out.println("Коллекция 'mongoTestCollection' создана");
            }

            // Получаем коллекцию
            MongoCollection<Document> collection = database.getCollection("mongoTestCollection");

            // Удаляем все документы из коллекции перед каждым запуском
            collection.deleteMany(new Document());

            // Добавляем документы в коллекцию
            Document doc1 = new Document("name", "John").append("age", 30).append("city", "New York");
            Document doc2 = new Document("name", "Alice").append("age", 25).append("city", "London");
            collection.insertOne(doc1);
            collection.insertOne(doc2);

            System.out.println("Документы успешно добавлены в коллекцию");
        } catch (Exception e) {
            System.err.println("Ошибка при работе с MongoDB: " + e.getMessage());
        }
    }
}

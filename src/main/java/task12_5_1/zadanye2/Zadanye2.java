package task12_5_1.zadanye2;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import org.bson.Document;

import java.util.ArrayList;

// Значения параметров для настройки соединения c сервером 'Mongo DB'
// Сервер (Хост): localhost
// База данных: mongoTest
// Коллекция: mongoTestCollection
// Пользователь: не указан (Аутентификации по пользователю нет)
// Пароль: не указан (Аутентификации по паролю нет)

public class Zadanye2 {
    public static void main(String[] args) {
        System.out.println("""
            Модуль 12. Базы данных и Git. Задание №5:
            Задание:
            2. Напишите запрос MongoDB для отображения ФИО и даты рождения всех лиц из представленной таблицы
            
            Решение (Я в коде оперировал не с датой рождения, а с датой приёма на работу, т.е. с 'hire_date') (ПРИМЕЧАНИЕ: при первом запуске кода выполните команду 'mongod' в терминале IntelliJ IDEA
               для выполнения соединения с сервером 'Mongo DB'. После этого запускайте код):
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
            Document doc1 = new Document("employee_id", 100).append("first_name", "Steben\t")
                    .append("last_name", "King\t").append("email", "SKING\t").append("phone_number", "515.123.4567")
                    .append("hire_date", "1987-06-17").append("job_id", "AD_PRES").append("salary", 24000.00);
            Document doc2 = new Document("employee_id", 101).append("first_name", "Neena\t")
                    .append("last_name", "Kochhar\t").append("email", "NKOCHHAR").append("phone_number", "515.123.4568")
                    .append("hire_date", "1987-06-18").append("job_id", "AD_VP").append("salary", 17000.00);
            Document doc3 = new Document("employee_id", 102).append("first_name", "Lex\t\t")
                    .append("last_name", "De Haan\t").append("email", "LDEHAAN\t").append("phone_number", "515.123.4569")
                    .append("hire_date", "1987-06-19").append("job_id", "AD_VP").append("salary", 17000.00);
            Document doc4 = new Document("employee_id", 103).append("first_name", "Alexander")
                    .append("last_name", "Hunold\t").append("email", "AHUNOLD\t").append("phone_number", "590.423.4567")
                    .append("hire_date", "1986-06-20").append("job_id", "ID_PROG").append("salary", 9000.00);
            Document doc5 = new Document("employee_id", 104).append("first_name", "Bruce\t")
                    .append("last_name", "Ernst\t").append("email", "BERNST\t").append("phone_number", "590.423.4568")
                    .append("hire_date", "1986-06-21").append("job_id", "ID_PROG").append("salary", 6000.00);
            Document doc6 = new Document("employee_id", 105).append("first_name", "David\t")
                    .append("last_name", "Austin\t").append("email", "DAUSTIN\t").append("phone_number", "590.423.4569")
                    .append("hire_date", "1986-06-22").append("job_id", "ID_PROG").append("salary", 4800.00);
            Document doc7 = new Document("employee_id", 106).append("first_name", "Valli\t")
                    .append("last_name", "Pataballa").append("email", "VPATABAL").append("phone_number", "590.423.4569")
                    .append("hire_date", "1986-06-23").append("job_id", "ID_PROG").append("salary", 4800.00);
            collection.insertOne(doc1);
            collection.insertOne(doc2);
            collection.insertOne(doc3);
            collection.insertOne(doc4);
            collection.insertOne(doc5);
            collection.insertOne(doc6);
            collection.insertOne(doc7);

            System.out.println("Документы успешно добавлены в коллекцию\n");

            // Отображаем только столбцы "employee_id", "first_name", "last_name" и "hire_date"
            FindIterable<Document> documents = collection.find().projection(
                    Projections.include("employee_id", "first_name", "last_name", "hire_date"));

            // Печатаем заголовки столбцов
            System.out.println("employee_id\t|\tfirst_name\t|\tlast_name\t|\thire_date");
            System.out.println("--------------------------------------------------------------");

            // Печатаем данные из коллекции
            for (Document doc : documents) {
                int employee_id = doc.getInteger("employee_id");
                String first_name = doc.getString("first_name");
                String last_name = doc.getString("last_name");
                String hire_date = doc.getString("hire_date");
                System.out.println(employee_id + "\t\t\t|\t" + first_name + "\t|\t" + last_name + "\t|\t" + hire_date);
            }

        } catch (Exception e) {
            System.err.println("Ошибка при работе с MongoDB: " + e.getMessage());
        }
    }
}

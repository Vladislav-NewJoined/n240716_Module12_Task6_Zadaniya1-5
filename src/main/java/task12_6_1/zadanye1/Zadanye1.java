package task12_6_1.zadanye1;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class Zadanye1 {
    public static void main(String[] args) {
        System.out.println("""
            Модуль 12. Базы данных и Git. Задание №6:
            Задание:
            1. Что такое GitHub? Для чего он используется?
            
            Решение:""");

        System.out.println("""
            GitHub - это веб-сервис для хостинга IT-проектов, основанный на системе управления версиями Git. Он
              используется для хранения и совместной работы над кодом, отслеживания изменений в коде, управления
              задачами и запросами на слияние, а также для совместной разработки программного обеспечения. GitHub
              также предоставляет возможности для автоматической сборки и развертывания проектов, интеграции с другими
              сервисами и инструментами разработки.""");
    }
}

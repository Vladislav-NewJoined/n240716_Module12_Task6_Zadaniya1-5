package task12_6_1.zadanye2;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import org.bson.Document;

import java.util.ArrayList;

public class Zadanye2_2 {
    public static void main(String[] args) {
        System.out.println("""
            Модуль 12. Базы данных и Git. Задание №6:
            Задание:
            2. Что такое GitLab?
            
            Решение:""");

        System.out.println("""
                GitLab - это веб-платформа для управления кодом, совместной разработки программного обеспечения и
                  непрерывной интеграции и развертывания (CI/CD). GitLab также основан на системе управления
                  версиями Git, аналогично GitHub.
            
                GitLab позволяет командам разработчиков работать над проектами, управлять версиями кода,
                  отслеживать задачи и ошибки, управлять запросами на слияние, а также использовать пайплайны
                  CI/CD для автоматизации процессов сборки, тестирования и развертывания.
            
                GitLab также предлагает возможности для управления доступом к репозиториям, встроенные инструменты
                  для проведения код-ревью и управления конфигурациями проектов. Он может быть использован как
                  самостоятельное решение, развернутое на собственной инфраструктуре, или как облачный сервис
                  GitLab.com.""");
    }
}

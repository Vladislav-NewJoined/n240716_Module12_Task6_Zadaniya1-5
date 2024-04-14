package task8_5_1;

public class Task8_5_1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Задание:\s
                Модуль 8. Многопоточность. Задание №5:\s
                    1. Расскажите своими словами, что такое Atomic  в JAVA  и для чего они используются?\s

                Решение:\s""");

        System.out.println("""
                Atomic – это класс, который предоставляет возможность оперировать\s
                неизменяемыми значениями и атомарными операциями. В языке Java\s
                атомарные операции обеспечивают безопасность и надежность многопоточных\s
                приложений, предотвращая состояние гонки и гарантируя целостность данных.\s
                Атомарные классы в java находятся в пакете util.concurrent.\s
                Пакет java.util.concurrent.atomic содержит девять классов для\s
                выполнения атомарных операций. Операция называется атомарной,\s
                если её можно безопасно выполнять при параллельных вычислениях\s
                в нескольких потоках, не используя при этом ни блокировок,\s
                ни синхронизацию synchronized. Atomic классы предоставляют набор\s
                атомарных операций для соответствующих типов. Условно можно\s
                разделить подходы реализации большинства atomic-методов на две группы:\s
                compare-and-set и set-and-get. Методы категории compare-and-set\s
                принимают старое значение и новое. Если переданное старое\s
                значение совпало с текущим, устанавливается новое.""");
    }
}
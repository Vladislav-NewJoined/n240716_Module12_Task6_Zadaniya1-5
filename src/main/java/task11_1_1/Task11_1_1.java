package task11_1_1;

// В этом фрагменте, Draft_Module11_Task1_Zadaniya1-5, приступил к Модулю 11

public class Task11_1_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 11. Протокол “HTTP”. Задание №1:\s
                    1. Расскажите, как вы поняли, что такое HTTP?
                    2. Какие возможные сценарии использования протокола HTTP?
                    3. Опишите методы  HTTP
                    4. Что такое URL?
                    5. Какие еще сетевые протоколы вам известны?

                Решение:\s""");

        System.out.println("""
                Ответ на вопрос 1, Расскажите, как вы поняли, что такое HTTP?:
                  HTTP (англ. HyperText Transfer Protocol — «протокол передачи гипертекста») — широко
                  распространенный протокол передачи данных, изначально предназначенный для передачи
                  гипертекстовых документов (то есть документов, которые могут содержать ссылки,
                  позволяющие организовать переход к другим документам).
                  Также HTTP - это некий программный механизм, который обеспечивает взаимодействие фронтенда и
                  бэкэнда. Существует 'разновидность' HTTP - это HTTPS, в нём добавлена буква 'S' - 'secure', это
                  означает, что передача данных по этому протоколу зашифровывается.
                
                Ответ на вопрос 2, Какие возможные сценарии использования протокола HTTP?
                  - Компьютерные онлайн игры;
                  - Для использования в чатах в мессенджерах;
                  - Передача JSON документов;
                  - APIs для взаимодействия между клиентскими и серверными приложениями;
                  - Обмен данными между различными компьютерными системами;
                  - Передача файлов и мультимедийных контентов;
                  - Работа с веб-сервисами и сервисами облачных хранилищ данных;
                  - Отправка запросов к серверам для получения информации;
                  - и др.
                
                Ответ на вопрос 3, Опишите методы  HTTP
                  Их, основных, всего - 9, чаще всего используются следующие:
                  - GET - когда мы хотим получить страницу;
                  - POST - когда мы хотим что-то изменить на бэкэнде;
                  - PUT - для того, чтобы положить какую-то информацию на бэкэнд (на сервер);
                  - DELETE - когда мы хотим удалить какую-то информацию;
                
                Ответ на вопрос 4, Что такое URL?
                  Если пояснить примитивно, это стартовая строка HTTP. Или, другими словами, это ссылка по которой мы
                  переходим на определённую веб-страницу.
                
                Ответ на вопрос 5, Какие еще сетевые протоколы вам известны?
                  - TCP и UDP - сейчас являются устаревшими. В частности на протоколе TCP реализован HTTP.
                  - FTP (File Transfer Protocol) - протокол для передачи файлов;
                  - SMTP (Simple Mail Transfer Protocol) - протокол для отправки почты;
                  - POP3 (Post Office Protocol) и IMAP (Internet Message Access Protocol) - протоколы для получения почты;
                  - SSH (Secure Shell) - протокол для безопасного удаленного доступа к компьютеру;
                  - DNS (Domain Name System) - протокол для преобразования доменных имён в IP-адреса;
                  - SNMP (Simple Network Management Protocol) - протокол для управления и мониторинга сетевыми устройствами;\s""");
    }
}
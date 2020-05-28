# Тестер
# Домашнее задание 11. Bank
##### [Изменился путь к пакету! (rain -> test)]
##### Добавьте пакет [`ru.ifmo.test.common.bank`](https://github.com/geny200/itmo-bank-test/blob/master/modules/ru.ifmo.test.common.bank/ru/ifmo/test/common/bank/ "package ru.ifmo.test.common.bank") в ваш проект.

* `Client` должен реализовывать интерфейс [`BankClient`](https://github.com/geny200/itmo-bank-test/blob/master/modules/ru.ifmo.test.common.bank/ru/ifmo/test/common/bank/BankClient.java "BankClient")
* `Server` должен реализовывать интерфейс [`BankServer`](https://github.com/geny200/itmo-bank-test/blob/master/modules/ru.ifmo.test.common.bank/ru/ifmo/test/common/bank/BankServer.java "BankServer")

* `RemotePerson` и `LocalPerson` должны реализовывать интерфейс [`Person`](https://github.com/geny200/itmo-bank-test/blob/master/modules/ru.ifmo.test.common.bank/ru/ifmo/test/common/bank/Person.java "Person")
* `RemoteAccount` и `LocalAccount` должны реализовывать интерфейс [`Account`](https://github.com/geny200/itmo-bank-test/blob/master/modules/ru.ifmo.test.common.bank/ru/ifmo/test/common/bank/Account.java "Account")
* `RemoteBank` должен реализовывать интерфейс [`Bank`](https://github.com/geny200/itmo-bank-test/blob/master/modules/ru.ifmo.test.common.bank/ru/ifmo/test/common/bank/Bank.java "Bank")


Тестирование
* клиент: `client <полное_имя_класса>`
* сервер: `bank <полное_имя_класса>`

--------------------------------
Все тесты запускаются через класс `Tester`

Запуск через терминал `.jar`:
- клиент: `java -cp . -p . -m ru.ifmo.test.common.bank/ru.ifmo.test.common.bank.Tester client ru.ifmo.rain._last_name_.bank.Client`
- сервер: `java -cp . -p . -m ru.ifmo.test.common.bank/ru.ifmo.test.common.bank.Tester bank ru.ifmo.rain._last_name_.bank.Server`

Пример через IDEA для клиента:
- main class `ru.ifmo.test.common.bank.Tester`
- program arguments `client ru.ifmo.rain._last_name_.bank.Client`

Пример через IDEA для сервера:
- main class `ru.ifmo.test.common.bank.Tester`
- program arguments `bank ru.ifmo.rain._last_name_.bank.Server`
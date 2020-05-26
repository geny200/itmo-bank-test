# Тестер
# Домашнее задание 11. Bank
##### Добавьте пакет `ru.ifmo.rain.common.bank` в ваш проект.

* `Client` должен реализовывать интерфейс [BankClient](https://github.com/geny200/itmo-bank-test/blob/master/ru/ifmo/rain/common/bank/BankClient.java "BankClient")
* `Server` должен реализовывать интерфейс [BankServer](https://github.com/geny200/itmo-bank-test/blob/master/ru/ifmo/rain/common/bank/BankServer.java "BankServer")

* `RemotePerson` и `LocalPerson` должны реализовывать интерфейс [Person](https://github.com/geny200/itmo-bank-test/blob/master/ru/ifmo/rain/common/bank/Person.java "Person")
* `RemoteAccount` и `LocalAccount` должны реализовывать интерфейс [Account](https://github.com/geny200/itmo-bank-test/blob/master/ru/ifmo/rain/common/bank/Account.java "Account")
* `RemoteBank` должен реализовывать интерфейс [Bank](https://github.com/geny200/itmo-bank-test/blob/master/ru/ifmo/rain/common/bank/Bank.java "Bank")


Тестирование 
* клиент: `client <полное_имя_класса>`
* сервер: `bank <полное_имя_класса>`

--------------------------------
Все тесты запускаются через класс `Tester`

Пример через IDEA 
- main class `ru.ifmo.rain.common.bank.Tester`
- program arguments `client ru.ifmo.rain._last_name_.bank.Client`

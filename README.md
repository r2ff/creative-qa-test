# creative-qa-test
стэк Gradle + JUnit5 + Selenide + Allure. <br>
Два одинаковых теста,  один с использованием Page Object, другой без. 

### Запуск тестов
```bash
gradle test
```

#### Возможно выбрать браузер, на котором будут запускаться тесты. 
Сделать можно либо через local.properties 
```
browser=firefox
```
либо через консоль
```
gradle test -Dbrowser=firefox
```
По умолчанию тесты запускаются на firefox

# UI автотесты для сайта https://l-post.ru/

## Cписок автоматизированных тест-кейсов в данном проекте:

- [x] Проверка, что все элементы в header страниц имеют правильные ссылки и отображаются  
- [x] Проверка, что все элементы в основном меню страниц имеют правильные ссылки и отображаются 
- [x] Проверка, что блоки с информацией на страницах сайта имеют названия и содержат контент
- [x] Проверка, что поиск по номеру посылки дает верный результат и правильно отображается 
- [x] Проверка, что расчет стоимости перевозки дает верный результат и правильно отображается
- [x] Проверка выполнения поиска ПВЗ в городе и выдачи правильного результата 
- [x] Проверки, что все элементы в footer страниц имеют правильные ссылки и отображаются  

## Стек технологий:

![Intelij_IDEA](img/icons/Intelij_IDEA.png)![Java](img/icons/Java.png)![Selenide](img/icons/Selenide.png)![Selenoid](img/icons/Selenoid.png)![Gradle](img/icons/Gradle.png)![JUnit5](img/icons/JUnit5.png)![Allure Report](img/icons/Allure_Report.png)![AllureTestOps](img/icons/AllureTestOps.png)![Github](img/icons/Github.png)![Jenkins](img/icons/Jenkins.png)![Telegram](img/icons/Telegram.png)![Jira](img/icons/Jira.png)

Java, Gradle, JUnit5, Selenide, Jenkins, Selenoid, Allure Reports, Telegram (уведомления), Jira, TestOps

### Для запусков автотестов используется Jenkins.

##### Примеры готовых сборок можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/c23-andreikuzn-ui-project-lpost/)

### Используемые параметры сборки Jenkins:

* BROWSER (браузер, по умолчанию chrome)
* BROWSER_VERSION (версия браузера, по умолчанию 100.0)
* REMOTE_URL (адрес удаленного сервера, на котором будут выполняться тесты)
* BROWSER_SIZE (размер окна браузера, по умолчанию 1920x1080)
* TASK (набор тестов (all, smoke, regerss) для запуска)
* BASE_URL (адрес основной страницы тестируемого сайта)

### Запуск тестов из терминала

```bash
gradle clean all_tests
gradle clean smoke_tests
gradle clean regress_tests
```

### Запуск тестов в Jenkins

##### Открыть сборку Jenkins [по ссылке](https://jenkins.autotests.cloud/job/c23-andreikuzn-ui-project-lpost/)
##### Нажать на кнопку "Собрать с параметрами"

![Jenkins_Start](./img/JenkinsStart.png)

##### Выбрать параметры, нажать на кнопку "Собрать"

![Jenkins_Start](./img/JenkinsStart1.png)

##### Дождаться выполнения сборки. нажать на кнопку "Allure Report"

![Jenkins_Start](./img/JenkinsStart2.png)

### Анализ результатов запусков в Jenkins через Allure Reports

![Jenkins_Allure_Reports](./img/JenkinsAllureReports.png)

![Jenkins_Allure_Reports1](./img/JenkinsAllureReports1.png)

### Для отображения результатов сборок также используется Allure TestOps.

##### Примеры запусков и их результаты можно посмотреть [по ссылке](https://allure.autotests.cloud/project/3888/dashboards)

### Пример списка тестов и их прохождения в Allure TestOps

![Allure TestOps](./img/AllureTestOps.png)

### Результаты запусков Launches в Allure TestOps

![Allure_Launches](./img/AllureLaunches.png)

### Основной Dashboards

![Allure Dashboards](img/AllureDashboards.png)

### Добавлена интеграция с Jira, где можно посмотреть запускаемые кейсы и их результаты.

##### Перейти в Jira можно [по ссылке](https://jira.autotests.cloud/browse/HOMEWORK-1009)

![Jira](./img/Jira1009.png)

### После прохождения тестов в telegram канал приходит оповещение с результами.

![Telegram](./img/Telegram1.jpg)

### Пример прохождения тестов можно посмотреть на видео

![video](./img/videoPvz.gif)

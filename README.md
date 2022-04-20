# Autotests demo project for <a target="_blank" href="https://www.klara.com/">Klara website</a>

## :mag: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

##  Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="artefacts/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="artefacts/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="artefacts/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="artefacts/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="artefacts/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="artefacts/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="artefacts/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="artefacts/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="artefacts/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :white_check_mark: Реализованные проверки

- ✓ Взаимодействие с блоками контента на домашней странице
- ✓ Соответствие заголовка на домашней странице
- ✓ Проверка наличия ошибок в console log

## <img src="artefacts/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins <a target="_blank" href="https://jenkins.autotests.cloud/job/Klara-autotests-demo/"> job </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/Klara-autotests-demo/">
<img src="artefacts/screens/JenkinsMainScreen.png" alt="Jenkins"/></a>
</p>

### Удаленный запуск тестов

```bash
gradle clean test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${USER}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### Параметры сборки в Jenkins:

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – разрешени окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).
>
> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>USER</code> - логин пользователя для подключения к Selenoid
>
> <code>PASSWORD</code> - пароль пользователя для подключения к Selenoid
>
> <code>THREADS</code> - количество одновременных запускаемых потоков для тестов.
>

### Запуск тестов из терминала

```bash
gradle clean test
```

## <img src="artefacts/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/Klara-autotests-demo/15/allure">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="artefacts/screens/AllureMainScreen.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="artefacts/screens/AllureTestScreen.png">
</p>

### Графики

<p align="center">
<img title="Allure Graphics" src="artefacts/screens/AllureGrafScreen.png">
</p>


## <img title="Telegram" src="artefacts/logo/Telegram.svg" width="25" height="25" alt="Telegram"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="artefacts/screens/TelegramReport.png" >
</p>


## <img title="Selenoid" src="artefacts/logo/Selenoid.svg" width="25" height="25" alt="Selenoid"/></a> Видео прохождения теста

https://user-images.githubusercontent.com/24870446/164145218-aea61f76-56ff-490e-b63f-51e441417b5b.mp4

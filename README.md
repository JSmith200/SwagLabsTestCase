The performance of the tests was checked on this environment:

Windows 10 x64
Idea 2021.2 х64
Google Chrome browser 93.0.4577.82 х64

Instructions for running tests:

1. Download the project repository to your computer.
2. Place the chromedriver.exe file from the repository to the root of the system partition of the operating system (C: \).
3. Import the project into IDEA.
4. Change to the "test" directory
5. Run any test.

Configuring tests:

In the basic version, tests are run from under the user
standard_user and provide automatic closing of the browser after the test is executed.

1.To change authorization parameters, you need to change the credentials located in the file
SwagSettings.java on lines 18 and 19.
2.To disable the option to automatically close the browser after the test is finished
you need to comment out line 24.
3.To change the location of chromedriver.exe, edit line 15. 

##############################################################################################################################################

Работоспособность тестов была проверена на данном окруженим:

Windows 10 x64
Idea 2021.2 х64
Браузер Google Chrome 93.0.4577.82 х64

Инструкция по запуску тестов:

1. Скачайте репозиторий проекта на свой компьютер.
2. Разместите файл chromedriver.exe из репозитория, в корне системного раздела операционной системы (С:\).
3. Импортируйте проект в IDEA.
4. Перейдите в каталог "test"
5. Запустите любой тест.

Конфигурирование тестов:

В базовом варианте тесты запускается из под пользователя
standard_user и предусматривают автоматическое закрытие браузера после выполнения теста.

1.Для изменений параметров авторизации необходимо изменить учетные данные расположенные в файле
SwagSettings.java на 18 и 19 строке.
2.Для отключения опции автоматического закрытия браузера после завершения теста
необходимо закомментировать 24 строку.
3.Для изменения местоположения chromedriver.exe, отредактируйте 15 строку.

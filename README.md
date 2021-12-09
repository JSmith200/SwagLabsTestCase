The performance of the tests was checked on this environment:

Windows 10 x64
Idea 2021.2 х64
Browser Google Chrome 96.0.4664.93 х64

Instructions for running tests:

1. Download the project repository to your computer.
2. Place the chromedriver.exe file from the repository to the root of the system partition of the operating system (C: \).
3. Import the project into IDEA.
4. Change to the directory "src / test / java / SwagLabs / LoginPage"
5. Open the LoginPageTests file
6. Run any test.

Configuring tests:

In the basic version, tests are run from a user account
standard_user and allow tests to run in the background and to automatically close the browser after a test is run.

1.To change the authorization parameters, you must change the credentials located in the file
LoginPageSetting.java on lines 5 and 6.
2.To disable the option to automatically close the browser after the test is finished
you need to comment out line 23 in SwagGlobalSettings.
3.To change the location of chromedriver.exe, edit line 15 in SwagGlobalSettings.

##############################################################################################################################################

Работоспособность тестов была проверена на данном окруженим:

Windows 10 x64
Idea 2021.2 х64
Браузер Google Chrome 96.0.4664.93 х64

Инструкция по запуску тестов:

1. Скачайте репозиторий проекта на свой компьютер.
2. Разместите файл chromedriver.exe из репозитория, в корне системного раздела операционной системы (С:\).
3. Импортируйте проект в IDEA.
4. Перейдите в каталог "src/test/java/SwagLabs/LoginPage"
5. Откройте файл LoginPageTests
6. Запустите любой тест.

Конфигурирование тестов:

В базовом варианте тесты запускается из под пользователя
standard_user и предусматривают выполнение тестов в фоновом режиме и автоматическое закрытие браузера после выполнения теста.

1.Для изменений параметров авторизации необходимо изменить учетные данные расположенные в файле
LoginPageSetting.java на 5 и 6 строке.
2.Для отключения опции автоматического закрытия браузера после завершения теста
необходимо закомментировать 23 строку в файле SwagGlobalSettings.
3.Для изменения местоположения chromedriver.exe, отредактируйте 15 строку в файле SwagGlobalSettings.

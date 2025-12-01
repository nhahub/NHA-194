@echo off

call mvn clean test
call allure serve allure-results

pause
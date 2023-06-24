from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By



service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://www.training-support.net/selenium/dynamic-controls")
    textField=driver.find_element(By.ID,"input-text")
    print("Text Field Enable:- " +str(textField.is_enabled()))

    driver.find_element(By.ID,"toggleInput").click()
    print("Text Field Enable:- " +str(textField.is_enabled()))


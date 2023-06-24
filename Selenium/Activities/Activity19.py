from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time


service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/javascript-alerts")
    print("Page Title :- " + driver.title)
    driver.find_element(By.ID,"confirm").click()
    alrt=driver.switch_to.alert
    print(alrt.text)
    alrt.accept()
    driver.find_element(By.ID,"confirm").click()
    alrt.dismiss()
    driver.close()


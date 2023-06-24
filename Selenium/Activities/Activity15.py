from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/dynamic-attributes")
    print("Page Title :- " + driver.title)
    driver.find_element(By.XPATH,"//input[starts-with(@name,'name-') and (contains(@class,'username-'))]").send_keys("admin")
    driver.find_element(By.XPATH,"//input[starts-with(@name,'name-') and (contains(@class,'password-'))]").send_keys("password")
    driver.find_element(By.XPATH,"//button[text()='Log in']").click()
    txt=driver.find_element(By.ID,"action-confirmation").text
    print("Message :- " +txt)
    driver.close()

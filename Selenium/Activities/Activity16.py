from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/dynamic-attributes")
    print("Page Title :- " + driver.title)

    driver.find_element(By.XPATH,"//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//input[@placeholder='Username']").send_keys("admin")

    driver.find_element(By.XPATH,"//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//label[text()='Password']/following-sibling::input").send_keys("password")

    driver.find_element(By.XPATH,"//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//label[text()='Confirm Password']/following-sibling::input").send_keys("password")

    driver.find_element(By.XPATH,"//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//label[text()='Email']/following-sibling::input").send_keys("sanu@gmail.com")

    driver.find_element(By.XPATH,"//button[text()='Sign Up']").click()

    loginMessage=driver.find_element(By.ID,"action-confirmation").text

    print("Login Message :- " + loginMessage)

    driver.close()



from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium import webdriver
from selenium.webdriver.common.by import By


services=FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=services) as driver:
    driver.get("https://training-support.net")
    print("Page title :- " ,driver.title)
    driver.find_element(By.XPATH,"//a[@id='about-link']").click()
    print("Page title :- " ,driver.title)

    driver.get("https://www.training-support.net/selenium/login-form")
    print("Page Title:- " + driver.title)

    driver.find_element(By.XPATH,"//input[@id='username']").send_keys("admin")
    driver.find_element(By.XPATH,"//input[@id='password']").send_keys("password")
    driver.find_element(By.XPATH,"//button[text()='Log in']").click
    driver.close()

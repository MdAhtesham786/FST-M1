from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.common.action_chains import ActionChains


service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://www.training-support.net/selenium/popups")
    print("Page Title :- " + driver.title)
    ele=driver.find_element(By.CLASS_NAME,"orange")
    act=ActionChains(driver)
    act.move_to_element(ele).perform()
    toolTeap=ele.get_attribute("data-tooltip")
    print("Tool Teap:- " + toolTeap)
    ele.click()
    driver.find_element(By.ID,"username").send_keys("admin")
    driver.find_element(By.ID,"password").send_keys("password")
    driver.find_element(By.XPATH,"//button[text()='Log in']").click()
    message=driver.find_element(By.ID,"action-confirmation").text
    print("Confirmation Message :- " + message)
    driver.close()


    

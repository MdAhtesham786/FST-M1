from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
import time
from selenium.webdriver.support import expected_conditions as EC

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/dynamic-controls")
    print("Page Title :- " + driver.title)

    checkbx=driver.find_element(By.NAME,"toggled")

    print("Check Box Selected:- " + str(checkbx.is_selected()))
    checkbx.click()
    print("Check Box Selected:- " + str(checkbx.is_selected()))


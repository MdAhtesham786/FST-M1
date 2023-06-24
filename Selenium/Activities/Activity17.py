from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.support.select import Select

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/selects")
    print("Page Title :- " + driver.title)
    sel=Select(driver.find_element(By.ID,"single-select"))
    sel.select_by_visible_text("Option 2")
    sel.select_by_index(2)
    sel.select_by_value("4")
    opt=sel.options
    
    for option in opt:
        print(option.text)

    driver.close()
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
    sel=Select(driver.find_element(By.ID,"multi-select"))
    sel.select_by_visible_text("Javascript")
    sel.select_by_index(4)
    sel.select_by_index(5)
    sel.select_by_index(6)
    sel.select_by_value("node")
    sel.deselect_by_index(5)
    

    driver.close()
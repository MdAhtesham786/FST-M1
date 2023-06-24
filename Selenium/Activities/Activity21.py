from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time


service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://www.training-support.net/selenium/tab-opener")
    print("Page Title :- " + driver.title)
    driver.find_element(By.ID,"launcher").click()
    window=driver.window_handles
    itr=window.__iter__()
    id=[]

    for win in itr:
        id.append(win)

    driver.switch_to.window(id[len(id)-1])
    time.sleep(2)
    print("New Window title :- " + driver.title)
    header=driver.find_element(By.CLASS_NAME,"content").text
    print("First Header :- " + header)

    driver.find_element(By.ID,"actionButton").click()

    window=driver.window_handles
    itr2=window.__iter__()
    for win in itr2:
        id.append(win)
    driver.switch_to.window(id[len(id)-1])
    time.sleep(2)
    print("New Window title :- " + driver.title)
    header2=driver.find_element(By.CLASS_NAME,"content").text
    print("Second Header :- " +header2)

    driver.quit()



    
    


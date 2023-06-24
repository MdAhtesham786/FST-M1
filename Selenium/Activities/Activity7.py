from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
import time
service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/drag-drop")
    print("Page Title :- " + driver.title)

    source=driver.find_element(By.ID,"draggable")
    target=driver.find_element(By.ID,"droppable")
    act=ActionChains(driver)

    act.drag_and_drop(source,target).perform()

    verify="Dropped!"

    text=driver.find_element(By.XPATH,"//div[@id='droppable']/p").text

    if verify==text:
        print("Dropped Successful")

    else:
        print("Dropped Not Sucessfull")


    target2=driver.find_element(By.ID,"dropzone2")
    act.drag_and_drop(source,target2)
    
    act.drag_and_drop(source,target2).perform()
    time.sleep(3)
    text2=driver.find_element(By.XPATH,"//div[@id='dropzone2']/p").text    
    
    if verify==text2:
        print("Dropped Successful")

    else:
        print("Dropped Not Sucessfull")






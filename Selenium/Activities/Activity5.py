from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.action_chains import ActionChains


service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:    
    actions = ActionChains(driver)   
    driver.get("https://www.training-support.net/selenium/input-events")   
    print("Page title is: ", driver.title)

    ele=driver.find_element(By.XPATH,"//div[@class='active']")    
    actions.click(ele).pause(2).perform()   
    active_side = driver.find_element(By.CLASS_NAME, "active")    
    print("left click: ", active_side.text)

    actions.double_click(ele).pause(2).perform()
    active_side = driver.find_element(By.CLASS_NAME, "active")
    print("Double click: ", active_side.text)

    actions.context_click(ele).pause(2).perform()
    active_side = driver.find_element(By.CLASS_NAME, "active")
    print("Right click: ", active_side.text)

    driver.close


    
    
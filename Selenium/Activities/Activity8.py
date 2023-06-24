from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/dynamic-controls")
    print("Page Title:- " + driver.title)

    toggleCheckbox=driver.find_element(By.ID,"toggleCheckbox")
    toggleCheckbox.click()
    wait=WebDriverWait(driver,20)

    wait.until(EC.presence_of_element_located([By.XPATH,"//button[text()='Add Checkbox']"]))
    print(toggleCheckbox.is_displayed())

    driver.find_element(By.XPATH,"//button[text()='Add Checkbox']").click()
    wait.until(EC.presence_of_element_located([By.XPATH,"//button[text()='Remove Checkbox']"]))
    print(driver.find_element(By.XPATH,"//button[text()='Remove Checkbox']").is_displayed)
    driver.close()

    
    
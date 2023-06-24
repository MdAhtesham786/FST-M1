from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://www.training-support.net/selenium/ajax")
    print("Page Title:- " + driver.title)

    driver.find_element(By.XPATH,"//button[text()='Change Content']").click()
    wait=WebDriverWait(driver,5)
    wait.until(EC.visibility_of_element_located((By.XPATH,"//div[@id='ajax-content']//h1")))
    print(driver.find_element(By.XPATH,"//div[@id='ajax-content']//h1").text)

    wait.until(EC.visibility_of_element_located((By.XPATH,"//h3[text()=\"I'm late!\"]")))
    print(driver.find_element(By.XPATH,"//h3[text()=\"I'm late!\"]").text)

    driver.close()
    

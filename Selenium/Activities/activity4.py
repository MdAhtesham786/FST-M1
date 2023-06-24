from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://training-support.net/selenium/target-practice")
    print("Page title :- " ,driver.title)
    ThirdHeader=driver.find_element(By.XPATH,"//h3[@id='third-header']").text
    print("Third Header :- " + ThirdHeader )

    fifthHeading=driver.find_element(By.XPATH,"//h5[text()='Fifth header']").value_of_css_property("color")
    print("FifthHeading:- " + fifthHeading)

    violetAttribute=driver.find_element(By.XPATH,"//button[text()='Violet']").get_attribute("class")
    print("Violet:- " + violetAttribute)

    greyText=driver.find_element(By.XPATH,"//button[text()='Grey']").text
    print("Grey Text:- " + greyText)

    driver.close
    
    #not completed
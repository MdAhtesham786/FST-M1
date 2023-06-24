from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By
import time

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://www.training-support.net/selenium/tables")
    print("Page Title:- " + driver.title)

    row=driver.find_elements(By.XPATH,"//table[@id='sortableTable']//tbody//tr")
    col=driver.find_elements(By.XPATH,"//table[@id='sortableTable']//tbody//tr//td")
    print("Row Count:- " + str(len(row)))
    print("Col Count :- " + str(len(col)))

    secondCell=driver.find_element(By.XPATH,"//table[@id='sortableTable']//tbody//tr[2]//td[2]")
    print("Second Cell value :- " + secondCell.text)
    time.sleep(2)
    driver.find_element(By.XPATH,"//table[@id='sortableTable']//thead//th[text()='Name']").click()
    print("Header is clicked")

    secondCell=driver.find_element(By.XPATH,"//table[@id='sortableTable']//tbody//tr[2]//td[2]")
    print("Second Cell value :- " + secondCell.text)

    footer=driver.find_elements(By.XPATH,"//table[@id='sortableTable']//tfoot//tr//th")

    for value in footer:
        print(value.text)





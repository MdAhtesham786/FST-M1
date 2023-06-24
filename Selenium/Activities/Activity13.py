from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.common.by import By

service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/tables")
    print("Page Title:- " + driver.title)

    row=driver.find_elements(By.XPATH,"//table[@class='ui celled striped table']//tr")
    cell=driver.find_elements(By.XPATH,"//table[@class='ui celled striped table']//tr//td")

    print("Row Count:- " , len(row))
    print("Cell Count:- ", len(cell))

    thrdRow=driver.find_elements(By.XPATH,"//table[@class='ui celled striped table']//tr[3]//td")
    print("Third row Value:- " , end=" ")
    for row in thrdRow:
        print( row.text ,end= " " + ",")

    SecondVellValue=driver.find_element(By.XPATH,"//table[@class='ui celled striped table']//tr[2]//td[2]")
    print('\n')
    print("Second Row Second Cell valuec:- " +SecondVellValue.text)

    driver.close()






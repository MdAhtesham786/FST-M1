from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.firefox.service import Service as fireFoxService
from selenium.webdriver.chrome.service import Service as chrome
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys


service=fireFoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service)as driver:
    driver.get("https://training-support.net/selenium/input-events")    
    print("Page title:- " +driver.title)

    actions=ActionChains(driver)
    actions.send_keys(Keys.SHIFT+'s')
    actions.key_down(Keys.CONTROL).send_keys("a").send_keys("C").key_up(Keys.CONTROL).perform()

    

     
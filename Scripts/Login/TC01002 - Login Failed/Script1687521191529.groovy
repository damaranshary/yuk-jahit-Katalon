import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/h2_Masuk'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Masuk  YukJahit/label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Masuk  YukJahit/label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Masuk  YukJahit/input_Email_email'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Masuk  YukJahit/input_Password_password'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Masuk  YukJahit/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Email_email'), 'user@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Password_password'), 'rbqJdQq2VWrKbZ3Q4btrGA==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  YukJahit/button_Masuk'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Masuk  YukJahit/div_Login Gagal'))

WebUI.closeBrowser()


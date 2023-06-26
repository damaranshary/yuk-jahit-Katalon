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

WebUI.navigateToUrl('http://localhost:5173/cart')

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Silahkan login terlebih dahulu'))

WebUI.navigateToUrl('http://localhost:5173/profile')

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Silahkan login terlebih dahulu'))

WebUI.navigateToUrl('http://localhost:5173/order')

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Silahkan login terlebih dahulu'))

WebUI.navigateToUrl('http://localhost:5173/checkout')

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Silahkan login terlebih dahulu'))

WebUI.navigateToUrl('http://localhost:5173/somerandomroutes')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Halaman tidak ditemukan  YukJahit/img_Daftar_chakra-image css-12mhnvv'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Halaman tidak ditemukan  YukJahit/h1_Halaman tidak ditemukan'), 
    'Halaman tidak ditemukan')

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://yukjahit.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Kaos Abu Polosby YukJahitRp 180.000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Detail Produk/h2_Product_name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Detail Produk/p_Product_description'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Detail Produk/p_Product_price'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Detail Produk/button_decrement'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Detail Produk/button_increment'))

WebUI.setText(findTestObject('Object Repository/Page_Detail Produk/input_-_quantity'), '0')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Detail Produk/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Detail Produk/button_increment'))

WebUI.click(findTestObject('Object Repository/Page_Detail Produk/button_decrement'))

WebUI.click(findTestObject('Object Repository/Page_Detail Produk/button_increment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Detail Produk/button_Add to Cart'))

WebUI.navigateToUrl('https://yukjahit.vercel.app/products/somerandomid')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Produk tidak ditemukan  YukJahit/div_Produk tidak ditemukan'), 
    'Produk tidak ditemukan')

WebUI.closeBrowser()


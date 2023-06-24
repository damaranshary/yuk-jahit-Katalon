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

WebUI.click(findTestObject('Page_Home  YukJahit/a_Masuk'))

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), 'user@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), '9KzOjDimb7zsqjjOXXaQnQ==')

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Pembelian'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/h2_Daftar Transaksi'), 'Daftar Transaksi')

WebUI.verifyElementPresent(findTestObject('Page_Daftar Transaksi  YukJahit/div_order Card (index pertama)'), 0)

order_status = WebUI.getText(findTestObject('Page_Daftar Transaksi  YukJahit/p_order status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Lihat Detail Transaksi'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Keluar'))

WebUI.click(findTestObject('Page_Home  YukJahit/a_Masuk'))

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), 'yukjahitkatalon1@email.com')

WebUI.setEncryptedText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), '5tCNF2fjTyt5MBtTc9d1ug==')

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Pembelian'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/p_Belum ada transaksi'), 'Belum ada transaksi')

WebUI.closeBrowser()


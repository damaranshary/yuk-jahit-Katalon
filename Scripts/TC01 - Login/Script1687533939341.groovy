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

WebUI.click(findTestObject('Navigation/a_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/h2_Masuk'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Email_email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Password_password'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Masuk  YukJahit/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Email_email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Password_password'), Password)

WebUI.click(findTestObject('Object Repository/Page_Masuk  YukJahit/button_Masuk'))

if (Expected == 'success') {
    WebUI.verifyElementVisible(findTestObject('Toasts/div_Login Berhasil'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Navigation/button_Akun'), 0)

    WebUI.verifyElementPresent(findTestObject('Navigation/a_Keranjang'), 0)

    WebUI.click(findTestObject('Object Repository/Navigation/button_Akun'))

    WebUI.click(findTestObject('Object Repository/Navigation/button_Keluar'))
} else if (Expected == 'failed') {
    WebUI.verifyElementVisible(findTestObject('Toasts/div_Login Gagal'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Email_email'), '')

    WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Password_password'), '')
} else if (Expected == 'nothing') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk  YukJahit/h2_Masuk'), 0)

    WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Email_email'), '')

    WebUI.setText(findTestObject('Object Repository/Page_Masuk  YukJahit/input_Password_password'), '')
}

WebUI.closeBrowser()


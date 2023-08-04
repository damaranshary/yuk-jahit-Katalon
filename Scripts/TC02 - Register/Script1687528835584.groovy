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

WebUI.click(findTestObject('Object Repository/Navigation/a_Daftar'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar  YukJahit/h2_Daftar'), 'Daftar')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Daftar  YukJahit/label_Nama'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Nama_name'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar  YukJahit/label_Alamat Email'), 'Alamat Email*')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Alamat Email_email'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar  YukJahit/label_Password'), 'Password*')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Password_password'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar  YukJahit/label_Nomor HP'), 'Nomor HP*')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Nomor HP_phone'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar  YukJahit/label_Alamat Lengkap'), 'Alamat Lengkap*')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Daftar  YukJahit/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Nama_name'), Name)

WebUI.setText(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Alamat Email_email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Password_password'), Password)

WebUI.setText(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Konfirmasi Password_confirmPassword'), ConfirmPassword)

WebUI.setText(findTestObject('Object Repository/Page_Daftar  YukJahit/input_Nomor HP_phone'), Phone)

WebUI.setText(findTestObject('Page_Daftar  YukJahit/textarea_Address'), Address)

WebUI.click(findTestObject('Page_Daftar  YukJahit/button_Daftar'))

if (Expected == 'nothing') {
    WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar  YukJahit/h2_Daftar'), 'Daftar')
} else if (Expected == 'failed') {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Registrasi Gagal'), FailureHandling.STOP_ON_FAILURE)
} else if (Expected == 'success') {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Registrasi Berhasil'))
}

WebUI.closeBrowser()


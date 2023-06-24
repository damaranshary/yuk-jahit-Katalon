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

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Profil'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/h2_Profil Saya'), 'Profil Saya')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/h3_Nama Lengkap'), 'Usery Tadd')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_email_user'), 'user@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_phone'), '08134489888')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_Alamat'), 'Kp. Sejahtera Nusa Bangsa Satu Indonesia No. 23 Rt.03/Rw.09, Padalarang Tengah, Bandung Barat, Jawa Barat,')

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah Data Profil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Profil - YukJahit/button_tutup (modal)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Profil - YukJahit/button_Kembali (modal)'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah (modal)'))

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Kembali (modal)'))

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah Data Profil'))

WebUI.clearText(findTestObject('Object Repository/Page_Profil - YukJahit/input_Nomor HP (modal)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Profil - YukJahit/input_Nomor HP (modal)'), '8')

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah (modal)'))

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Keluar'))

WebUI.closeBrowser()


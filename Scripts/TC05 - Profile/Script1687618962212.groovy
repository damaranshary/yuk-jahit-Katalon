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

WebUI.click(findTestObject('Navigation/a_Masuk'))

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), email)

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), password)

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Navigation/button_Akun'))

WebUI.click(findTestObject('Object Repository/Navigation/a_Profil'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/h2_Profil Saya'), 'Profil Saya')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/h3_Nama Lengkap'), name)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_email_user'), email)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_phone'), phone)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_Alamat'), address)

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah Data Profil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Profil - YukJahit/button_tutup (modal)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Profil - YukJahit/button_Kembali (modal)'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah (modal)'))

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Kembali (modal)'))

WebUI.click(findTestObject('Object Repository/Page_Profil - YukJahit/button_Ubah Data Profil'))

WebUI.clearText(findTestObject('Page_Profil - YukJahit/input_Nama (modal)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Profil - YukJahit/input_Nama (modal)'), '')

WebUI.setText(findTestObject('Page_Profil - YukJahit/input_Nomor HP (modal)'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_phone'), phone)

WebUI.clearText(findTestObject('Page_Profil - YukJahit/input_Alamat Lengkap (modal)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Profil - YukJahit/input_Alamat Lengkap (modal)'), '')

WebUI.click(findTestObject('Page_Profil - YukJahit/button_Ubah (modal)'))

WebUI.verifyElementVisible(findTestObject('Toasts/div_Edit Profil Berhasil'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil - YukJahit/p_phone'), phone + '0')

WebUI.click(findTestObject('Navigation/button_Akun'))

WebUI.click(findTestObject('Navigation/button_Keluar'))

WebUI.closeBrowser()


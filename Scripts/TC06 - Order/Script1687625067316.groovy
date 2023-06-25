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

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), email)

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), password)

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Pembelian'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/h2_Daftar Transaksi'), 'Daftar Transaksi')

if (hasOrder == true) {
    WebUI.verifyElementPresent(findTestObject('Page_Daftar Transaksi  YukJahit/div_order Card (index pertama)'), 0)

    order_status = WebUI.getText(findTestObject('Page_Daftar Transaksi  YukJahit/p_order status'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Lihat Detail Transaksi'))

    if (order_status == 'Belum dibayar') {
        WebUI.verifyElementClickable(findTestObject('Page_Daftar Transaksi  YukJahit/button_Batalkan'))
    } else {
        WebUI.verifyElementNotClickable(findTestObject('Page_Daftar Transaksi  YukJahit/button_Batalkan'))
    }
    
    WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Lihat Detail Transaksi'))

    WebUI.verifyElementPresent(findTestObject('Page_Daftar Transaksi  YukJahit/section_Modal'), 0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/div_Detail order section (modal)'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/div_Detail Produk section (modal)'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/div_Info Penerima section (modal)'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/div_Rincian Pembayaran (modal)'), 
        0)

    WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_close button (modal)'))
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/p_Belum ada transaksi'), 'Belum ada transaksi')
}

WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/button_Keluar'))

WebUI.closeBrowser()


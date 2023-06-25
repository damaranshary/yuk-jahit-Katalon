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

WebUI.setText(findTestObject('Object Repository/Page_Semua Produk  YukJahit/input_Jahit_nav-search-input'), Query)

WebUI.sendKeys(findTestObject('Object Repository/Page_Home  YukJahit/input_Jahit_nav-search-input'), Keys.chord(Keys.ENTER))

if (Result == 'RedirectToAll') {
    WebUI.verifyElementText(findTestObject('Object Repository/Page_Semua Produk  YukJahit/h2_Semua Produk'), 'Semua Produk')

    WebUI.verifyElementPresent(findTestObject('Page_Semua Produk  YukJahit/LinkBox_Semua produk (index pertama)'), 0)

    WebUI.verifyElementClickable(findTestObject('Page_Semua Produk  YukJahit/LinkBox_Semua produk (index pertama)'))

    WebUI.verifyElementPresent(findTestObject('Page_Semua Produk  YukJahit/LinkBox_Semua produk (index terakhir)'), 0)

    WebUI.verifyElementClickable(findTestObject('Page_Semua Produk  YukJahit/LinkBox_Semua produk (index terakhir)'))
} else if (Result == 'Found') {
    WebUI.verifyElementPresent(findTestObject('Page_Pencarian produk  YukJahit/LinkBox_hasil pencarian (index pertama)'), 
        0)

    WebUI.verifyElementClickable(findTestObject('Page_Pencarian produk  YukJahit/LinkBox_hasil pencarian (index pertama)'))
} else if (Result == 'NotFound') {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pencarian produk  YukJahit/img_Pencarian_chakra-image css-0'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pencarian produk  YukJahit/img_Pencarian_chakra-image css-0'), 
        0)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_Pencarian produk  YukJahit/p_Produk tidak ditemukan'), 
        'Produk tidak ditemukan')
}

WebUI.closeBrowser()


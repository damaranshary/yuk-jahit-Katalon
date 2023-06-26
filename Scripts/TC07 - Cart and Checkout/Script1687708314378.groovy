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

WebUI.click(findTestObject('Object Repository/Page_Home  YukJahit/a_Kaos Putih Polosby YukJahitRp 140.000'))

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Silahkan login terlebih dahulu (div)'))

WebUI.verifyElementText(findTestObject('Object Repository/Toasts/div_Silahkan login terlebih dahulu (text)'), 'Silahkan login terlebih dahulu')

WebUI.click(findTestObject('Navigation/a_Masuk'))

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), 'testingcart@email.com')

WebUI.setEncryptedText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), '5tCNF2fjTyv5Dr1Pxh+Teg==')

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home  YukJahit/a_Kaos Hitam Polosby YukJahitRp 125.000'))

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Toasts/div_Cannot read properties of undefined (re_e4e67f'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Produk berhasil ditambahkan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Navigation/input_Jahit_nav-search-input'), 'kemeja')

WebUI.sendKeys(findTestObject('Navigation/input_Jahit_nav-search-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Pencarian produk  YukJahit/LinkBox_hasil pencarian (index pertama)'))

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Toasts/div_Cannot read properties of undefined (re_e4e67f'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Toasts/div_Produk berhasil ditambahkan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Navigation/a_Keranjang'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout YukJahit/h2_Keranjang'), 'Keranjang')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Keranjang  YukJahit/div_product in cart (index pertama)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Keranjang  YukJahit/div_product in cart (index kedua)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_delete product in cart (index kedua)'))

WebUI.verifyElementNotPresent(findTestObject('Page_Keranjang  YukJahit/div_product in cart (index kedua)'), 0)

WebUI.click(findTestObject('Page_Keranjang  YukJahit/a_nama produk (link text)'))

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.click(findTestObject('Navigation/a_Keranjang'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Keranjang  YukJahit/p_Jumlah'), 'Jumlah: 2')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_Lakukan Pembayaran'))

WebUI.setText(findTestObject('Page_Keranjang  YukJahit/textarea_Catatan'), 'Ukuran XXL')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_Lakukan Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_Lakukan Pembayaran'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Keranjang  YukJahit/div_Alert dialog checkout (in cart)'))

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_Batal'))

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_Lakukan Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout YukJahit/a_link pembayaran'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout YukJahit/h2_Selesaikan pembayaran sebelum'), 
    0)

WebUI.click(findTestObject('Page_Checkout YukJahit/a_link pembayaran'))

WebUI.switchToWindowTitle('Midtrans Mock Payment Provider')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Midtrans Mock Payment Provider/input_PIN_pin'), 'Tscr9DIxB28=')

WebUI.click(findTestObject('Object Repository/Page_Midtrans Mock Payment Provider/button_Submit'))

WebUI.switchToWindowTitle('Checkout berhasil | YukJahit')

WebUI.click(findTestObject('Navigation/a_Keranjang'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout YukJahit/h2_Keranjang'), 'Keranjang')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Keranjang  YukJahit/img_Keranjang_chakra-image css-0'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Keranjang  YukJahit/p_Keranjangmu kosong'), 'Keranjangmu kosong')

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/a_Mulai Belanja'))

WebUI.verifyElementText(findTestObject('Page_Semua Produk  YukJahit/h2_Semua Produk'), 'Semua Produk')

WebUI.click(findTestObject('Navigation/button_Akun'))

WebUI.click(findTestObject('Navigation/button_Keluar'))

WebUI.closeBrowser()


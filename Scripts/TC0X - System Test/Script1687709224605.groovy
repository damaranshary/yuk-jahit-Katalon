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

WebUI.click(findTestObject('Page_Home  YukJahit/a_Daftar'))

WebUI.setText(findTestObject('Page_Daftar  YukJahit/input_Nama_name'), 'system test (1)')

WebUI.setText(findTestObject('Page_Daftar  YukJahit/input_Alamat Email_email'), 'systemtestkatalon@email.com')

WebUI.setEncryptedText(findTestObject('Page_Daftar  YukJahit/input_Password_password'), '5tCNF2fjTyv5Dr1Pxh+Teg==')

WebUI.setEncryptedText(findTestObject('Page_Daftar  YukJahit/input_Konfirmasi Password_confirmPassword'), '5tCNF2fjTyv5Dr1Pxh+Teg==')

WebUI.setText(findTestObject('Page_Daftar  YukJahit/input_Nomor HP_phone'), '08123456789')

WebUI.setText(findTestObject('null'), 'System test address')

WebUI.click(findTestObject('Page_Daftar  YukJahit/button_Daftar'))

WebUI.verifyElementVisible(findTestObject('Page_Masuk  YukJahit/div_Registrasi Berhasil'))

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), 'systemtestkatalon@email.com')

WebUI.setEncryptedText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), '5tCNF2fjTyv5Dr1Pxh+Teg==')

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Page_Home  YukJahit/div_Login Berhasil'))

WebUI.click(findTestObject('Page_Home  YukJahit/a_Kaos Hitam Polosby YukJahitRp 125.000'))

WebUI.click(findTestObject('Object Repository/Page_Kaos Hitam Polos  YukJahit/button_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/Page_Kaos Hitam Polos  YukJahit/input_Jahit_nav-search-input'), 'kaos')

WebUI.sendKeys(findTestObject('Object Repository/Page_Kaos Hitam Polos  YukJahit/input_Jahit_nav-search-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Pencarian produk  YukJahit/a_Kaos Putih Polosby YukJahitRp 140.000'))

WebUI.click(findTestObject('Object Repository/Page_Kaos Putih Polos  YukJahit/button_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/Page_Kaos Putih Polos  YukJahit/input_Jahit_nav-search-input'), 'kemeja')

WebUI.sendKeys(findTestObject('Object Repository/Page_Kaos Putih Polos  YukJahit/input_Jahit_nav-search-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_Pencarian produk  YukJahit/a_Kemeja Panjang Biru Gelapby YukJahitRp 215.000'))

WebUI.setText(findTestObject('Object Repository/Page_Kemeja Panjang Biru Gelap  YukJahit/input_-_quantity'), '25')

WebUI.click(findTestObject('Object Repository/Page_Kemeja Panjang Biru Gelap  YukJahit/p_Rp 215.000'))

WebUI.click(findTestObject('Object Repository/Page_Kemeja Panjang Biru Gelap  YukJahit/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Kemeja Panjang Biru Gelap  YukJahit/a_Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Keranjang  YukJahit/path'))

WebUI.setText(findTestObject('null'), 'Semuanya Ukuran XXL')

WebUI.click(findTestObject('Page_Keranjang  YukJahit/button_Lakukan Pembayaran'))

WebUI.click(findTestObject('Page_Keranjang  YukJahit/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout 649866c26887d0ab718ef2e8  YukJahit/a_httpssimulator.sandbox.midtrans.comgopayp_c260c9'))

WebUI.switchToWindowTitle('Midtrans Mock Payment Provider')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Midtrans Mock Payment Provider/input_PIN_pin'), 'Tscr9DIxB28=')

WebUI.click(findTestObject('Object Repository/Page_Midtrans Mock Payment Provider/button_Submit'))

WebUI.switchToWindowTitle('Checkout berhasil | YukJahit')

WebUI.click(findTestObject('Object Repository/Page_Checkout berhasil  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Checkout berhasil  YukJahit/a_Pembelian'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/div_BelanjaSelesai25 Juni 2023  2309 WIB649_286765'), 
    0)

WebUI.click(findTestObject('Page_Daftar Transaksi  YukJahit/button_Lihat Detail Transaksi'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/section_Detail TransaksiSelesaiID Transaksi_b2a399'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/svg_Instagram_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Page_Daftar Transaksi  YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Transaksi  YukJahit/a_Profil'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil- YukJahit/p_systemtestkatalonemail.com'), 'systemtestkatalon@email.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil- YukJahit/p_08123456789'), '08123456789')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profil- YukJahit/p_System test address'), 'System test address')

WebUI.click(findTestObject('Object Repository/Page_Profil- YukJahit/button_Ubah Data Profil'))

WebUI.setText(findTestObject('Object Repository/Page_Profil- YukJahit/input_Nomor HP_phone'), '081234567890')

WebUI.click(findTestObject('Object Repository/Page_Profil- YukJahit/button_Ubah'))

WebUI.click(findTestObject('Object Repository/Page_Profil- YukJahit/button_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Profil- YukJahit/button_Keluar'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Navigation/a_Daftar'))

WebUI.setText(findTestObject('Page_Daftar  YukJahit/input_Nama_name'), 'system test katalon (1)')

WebUI.setText(findTestObject('Page_Daftar  YukJahit/input_Alamat Email_email'), 'systemtestkatalon@email.com')

WebUI.setEncryptedText(findTestObject('Page_Daftar  YukJahit/input_Password_password'), '5tCNF2fjTytOufdTKCncEA==')

WebUI.setEncryptedText(findTestObject('Page_Daftar  YukJahit/input_Konfirmasi Password_confirmPassword'), '5tCNF2fjTytOufdTKCncEA==')

WebUI.setText(findTestObject('Page_Daftar  YukJahit/input_Nomor HP_phone'), '08123456789')

WebUI.setText(findTestObject('Page_Daftar  YukJahit/textarea_Address'), 'System test address')

WebUI.click(findTestObject('Page_Daftar  YukJahit/button_Daftar'))

WebUI.verifyElementVisible(findTestObject('Toasts/div_Registrasi Berhasil'))

WebUI.setText(findTestObject('Page_Masuk  YukJahit/input_Email_email'), 'systemtestkatalon@email.com')

WebUI.setEncryptedText(findTestObject('Page_Masuk  YukJahit/input_Password_password'), '5tCNF2fjTytOufdTKCncEA==')

WebUI.sendKeys(findTestObject('Page_Masuk  YukJahit/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Toasts/div_Edit Profil Berhasil'))

WebUI.click(findTestObject('Page_Home  YukJahit/a_Kaos Hitam Polosby YukJahitRp 125.000'))

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.setText(findTestObject('Page_Pencarian produk  YukJahit/input_Jahit_nav-search-input'), 'kaos')

WebUI.sendKeys(findTestObject('Page_Pencarian produk  YukJahit/input_Jahit_nav-search-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Pencarian produk  YukJahit/LinkBox_hasil pencarian (index kedua)'))

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.setText(findTestObject('Page_Pencarian produk  YukJahit/input_Jahit_nav-search-input'), 'kemeja')

WebUI.sendKeys(findTestObject('Page_Pencarian produk  YukJahit/input_Jahit_nav-search-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Pencarian produk  YukJahit/LinkBox_hasil pencarian (index pertama)'))

WebUI.setText(findTestObject('Page_Detail Produk/input_-_quantity'), '25')

WebUI.click(findTestObject('Page_Detail Produk/button_Add to Cart'))

WebUI.click(findTestObject('Navigation/a_Keranjang'))

WebUI.setText(findTestObject('Page_Keranjang  YukJahit/textarea_Catatan'), 'Semuanya Ukuran XXL')

WebUI.click(findTestObject('Page_Keranjang  YukJahit/button_Lakukan Pembayaran'))

WebUI.click(findTestObject('Page_Keranjang  YukJahit/button_Checkout'))

WebUI.click(findTestObject('Page_Checkout YukJahit/a_link pembayaran'))

WebUI.switchToWindowTitle('Midtrans Mock Payment Provider')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Midtrans Mock Payment Provider/input_PIN_pin'), 'Tscr9DIxB28=')

WebUI.click(findTestObject('Object Repository/Page_Midtrans Mock Payment Provider/button_Submit'))

WebUI.switchToWindowTitle('Checkout berhasil | YukJahit')

WebUI.click(findTestObject('Navigation/button_Akun'))

WebUI.click(findTestObject('Navigation/a_Pembelian'))

WebUI.verifyElementPresent(findTestObject('Page_Daftar Transaksi  YukJahit/div_order Card (index pertama)'), 0)

WebUI.click(findTestObject('Page_Daftar Transaksi  YukJahit/button_Lihat Detail Transaksi'))

WebUI.verifyElementPresent(findTestObject('Page_Daftar Transaksi  YukJahit/section_Modal'), 0)

WebUI.click(findTestObject('Page_Daftar Transaksi  YukJahit/button_close button (modal)'))

WebUI.click(findTestObject('Navigation/button_Akun'))

WebUI.click(findTestObject('Navigation/a_Profil'))

WebUI.verifyElementText(findTestObject('Page_Profil - YukJahit/p_email_user'), 'systemtestkatalon@email.com')

WebUI.verifyElementText(findTestObject('Page_Profil - YukJahit/p_phone'), '08123456789')

WebUI.verifyElementText(findTestObject('Page_Profil - YukJahit/p_Alamat'), 'System test address')

WebUI.click(findTestObject('Page_Profil - YukJahit/button_Ubah Data Profil'))

WebUI.setText(findTestObject('Page_Profil - YukJahit/input_Nomor HP (modal)'), '0')

WebUI.click(findTestObject('Page_Profil - YukJahit/button_Ubah (modal)'))

WebUI.click(findTestObject('Navigation/button_Akun'))

WebUI.click(findTestObject('Navigation/button_Keluar'))

WebUI.closeBrowser()


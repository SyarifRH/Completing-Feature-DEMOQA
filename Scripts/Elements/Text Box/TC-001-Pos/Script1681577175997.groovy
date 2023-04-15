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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Elements/Text Box/Full Name'), 'Syarif Ridhohidayatulloh')

WebUI.setText(findTestObject('Elements/Text Box/Email'), 'testing@gmail.com')

WebUI.setText(findTestObject('Elements/Text Box/Adrress'), 'Purwokerto, Jawa Tengah')

WebUI.setText(findTestObject('Elements/Text Box/Adress Permanent'), 'Purwokerto, Jawa Tengah')

WebUI.click(findTestObject('Elements/Text Box/Button Submit'))

WebUI.delay(3)

if(WebUI.verifyTextPresent('Name:Syarif Ridhohidayatulloh', false, FailureHandling.OPTIONAL )) {
	WebUI.comment("Positive Berhasil")
} else {
	WebUI.comment("Positive FAILED")
}

WebUI.closeBrowser()


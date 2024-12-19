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

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/Page_GitHub  Build and ship software on a s_00080d/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'sbvanyo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), 'ehC0kYuUQPBxCW7J80LS7w==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Page_Two-factor authentication  GitHub/span_Use passkey'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/img_Create new_avatar circle'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/span_Your profile'))

WebUI.click(findTestObject('Object Repository/Page_sbvanyo (Stacey Vanyo)/button_Edit profile'))

WebUI.setText(findTestObject('Object Repository/Page_sbvanyo (Stacey Vanyo)/textarea_Studying full-stack web developmen_797c8a'), 
    'Studying full-stack web development.')

WebUI.setText(findTestObject('Object Repository/Page_sbvanyo (Stacey Vanyo)/input_Pronouns_userprofile_company'), 'FortyAU')

WebUI.click(findTestObject('Object Repository/Page_sbvanyo (Stacey Vanyo)/span_Save'))

WebUI.closeBrowser()


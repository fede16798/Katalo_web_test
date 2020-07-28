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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.way2automation.com/angularjs-protractor/banking/#/manager/addCust')

WebUI.setText(findTestObject('Page_Protractor practice website - Banking App/input_First Name _form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'), 
    nombre)

WebUI.setText(findTestObject('Page_Protractor practice website - Banking App/input_Last Name _form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'), 
    apellido)

WebUI.setText(findTestObject('Page_Protractor practice website - Banking App/input_Post Code _form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'), 
    codPostal)

WebUI.click(findTestObject('Page_Protractor practice website - Banking App/button_Add Customer'))


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Autosifting-University criteria')

WebUI.delay(5)

Random rad = new Random()

'Random Selection of University '
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('getEmployable/select_University'))

int UniversityCount = 1 + rad.nextInt(UniversityTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('getEmployable/select_University'), UniversityCount)

' Selection of University Course'
WebUI.delay(5)

WebUI.click(findTestObject('getEmployable (Siftings)/University course - acc and finance'))

'Random Selection of Degree'
WebUI.click(findTestObject('getEmployable (Siftings)/degree'), FailureHandling.STOP_ON_FAILURE)

'Random selection of Course Duration and Year Of Study'
CourseDurationTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('getEmployable/select_CourseDuration'))

int CourseDurationCount = 1 + rad.nextInt(CourseDurationTotalOptions - 1)

WebUI.selectOptionByIndex(findTestObject('getEmployable/select_CourseDuration'), CourseDurationCount)

WebUI.selectOptionByIndex(findTestObject('getEmployable/select_YearOfStudy'), CourseDurationCount)

'Select Full Time '
WebUI.click(findTestObject('getEmployable/select_FullTime'))

WebUI.delay(10)

'Click Next '
WebUI.click(findTestObject('getEmployable/button_NextUniversity'))

WebUI.delay(2)


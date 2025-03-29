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

// Test data - u can move these to GlobalVariables or a data file
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def getId = 12345
def expectedPetName = "doggie"

try {
	// 1. Get the request object from repository
	def getPetRequest = findTestObject('Object Repository/Swagger Petstore/getPetById')
	
	// Verify Object was found
	if (getPetRequest == null) {
		throw new Exception('GET_PetById object not found in repository')
	}
	
	// 2. Replace path parameter with actual petId
	def requestUrl = getPetRequest.getRestUrl().replace('${petId}', petId.toString())

	// 3. Set updated URL to the request object
	getPetRequest.setRestUrl(requestUrl)

	println("Sending GET request to: ${requestUrl}")

	// 4. Send request and get response
	def response = WS.sendRequest(getPetRequest)

	// 5. Verify Response Status
	WS.verifyResponseStatusCode(response, 200)
	WS.verifyElementPropertyValue(response,"id",petId)

	// 6. Verify Response Content
	WS.verifyElementPropertyValue(response, 'name', expectedPetName)
	println("Response: ${response.getResponseText()}")

} catch (Exception e) {
	println("Error: " + e.getMessage())
}

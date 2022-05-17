package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;

public class AddEmployeeTest extends CommonMethods {

    /*
    read the configuration file for username and password
    and add an employee
     */
    @Test
    public void addEmployee() {

//        login.usernameBox.sendKeys(ConfigReader.getPropertyValue("username"));
//        login.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
//        login.loginBtn.click();

        login.loginMethod(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));

        click(dash.pimOption);
        click(dash.addEmployeeButton);

        sendText(addEmployeePage.firstNameField, "Kevin");
        sendText(addEmployeePage.middleNameField, "Jr.");
        sendText(addEmployeePage.lastNameField, "Davichi");

        // get the employee ID
        String employeeID = addEmployeePage.empIDLocator.getAttribute("value");

        click(addEmployeePage.saveButton);

        System.out.println(employeeID);

        click(dash.pimOption);
        click(dash.employeeListOption);

        sendText(employeeSearchPage.idField, employeeID);
        click(employeeSearchPage.searchButton);

        String empIDActual = employeeSearchPage.empIDrow.getText();
        Assert.assertEquals(empIDActual, employeeID);

    }

    /*
       read the employee data from excel file
       assert that you have successfully added the employee
    */
    @Test
    public void addMultipleEmployee() {

    }
}

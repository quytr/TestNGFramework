package utils;

import pages.*;

public class PageInitializers {

    public static LoginPage login;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeDetailPage employeeDetailPage;
    public static DashboardPage dash;

    public static void initializePageObjects(){
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        employeeDetailPage = new EmployeeDetailPage();
        dash = new DashboardPage();
    }
}

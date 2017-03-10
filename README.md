# Search_Page(It searches for the maximum recommended business in a web page)
1)Search functionality implemented with proper Framework

2)Package pages contains all the Page Object(Impletmenting page Object model)

3)Package Utility contains all the library files(Methods for reading from excel, property file, capturing screenshot etc) --DRY(Do not Repeat Your code)

4)BaseClass contains @BeforeClass, @AfterClass, @BeforeMethod and @AfterMethod which is generically implemented. All the test class should extend the base class.

5)DriverClass is singleton (Static class) which is used to make sure that only one instance of driver is instantiated throughout the test.

6)Test Class contains @Test(Which is executed)

7)Configuration class contains the configuration details(Any changes in configuration can be easily done without changing code)

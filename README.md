# Search_Page(It searches for the maximum recommended business in a web page)
Search functionality implemented with proper Framework
Package pages contains all the Page Object(Impletmenting page Object model)
Package Utility contains all the library files(Methods which are used at many places are made as library files) --DRY(Do not Repeat Your code)
BaseClass contains @BeforeClass, @AfterClass, @BeforeMethod and @AfterMethod which is generically implemented. All the test class should extend the base class.
DriverClass is singleton (Static class) which is used to make sure that only one instance of driver is instantiated throughout the test.
Test Class contains @Test(Which is executed)

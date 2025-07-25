# 🧪 OrangeHRM Automation Project

This is a capstone project developed as part of an automation testing course. The project focuses on automating key modules of the OrangeHRM application using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** framework.


## 📌 Project Objectives

Automate the following modules of the OrangeHRM application:

### ✅ Module 1: Login
- Automates login/logout using **5 different datasets** (valid & invalid).
- Reads data from Excel using Apache POI.
- Capture screenshots for each login attempt.
- Asserts valid and invalid credentials.
- Generates ExtentReports for test execution.

### ✅ Module 2: Admin → User Management
- Search functionality automation:
- Search by **Username**
- Search by **User Role**
- Search by **User Status**
- Validate and print all **12 left side menu** options.


## 🛠️ Tools & Technologies Used

- **Language**: Java  
- **Framework**: Selenium WebDriver, TestNG  
- **Design Pattern**: Page Object Model (POM)  
- **Reporting**: ExtentReports  
- **Build Tool**: Maven  
- **Utilities**: Apache POI (Excel), Screenshot Utility  
- **IDE**: Eclipse / IntelliJ


<pre> ## 📂 Project Structure ``` OrangeHRM_Automation/ ├── src/ │ ├── pages/ # POM classes for each module │ ├── testcases/ # Test classes │ ├── utilities/ # Excel, Screenshot, Report Utils │ └── testng.xml # TestNG configuration ├── reports/ # ExtentReports output ├── screenshots/ # Captured screenshots └── README.md ``` </pre>

## 🚀 How to Run the Tests

### 1. Clone the Repository

git clone https://github.com/LakshmisriAkula/OrangeHRM_Automation.git
cd OrangeHRM_Automation


### 2. Open in IDE (Eclipse/IntelliJ)

### 3. Install Dependencies
Ensure Maven is installed and run:

mvn clean install


### 4. Run Tests
Use the TestNG XML file:

Right-click on testng.xml → Run As → TestNG Suite


## 📷 Sample Output

- Screenshots saved in `/screenshots`
- Reports generated in `/reports`


## 🙋‍♀️ Author

**Lakshmi Akula**  
Automation Tester | 8+ Years QA Experience including 4 years Selenium Automation
[GitHub](https://github.com/LakshmisriAkula)

---

## 📬 Contact

If you have any queries, feel free to reach out via GitHub Issues or [LinkedIn](https://www.linkedin.com/in/lakshmisri-akula-b78232130/).

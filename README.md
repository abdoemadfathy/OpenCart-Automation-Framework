# OpenCart Automation Framework

A robust End-to-End Automation Testing Framework designed to validate core user journeys and UI functionalities of the OpenCart e-commerce platform.

---

## Technical Stack and Tools
* **Programming Language:** Java
* **Automation Library:** Selenium WebDriver
* **Test Runner and Assertions:** TestNG
* **Design Pattern:** Page Object Model (POM)
* **Build and Dependency Management:** Maven

---

## Project Architecture and Design
This framework strictly adheres to the **Page Object Model (POM)** design pattern to ensure clean separation of concerns, high maintainability, and code reusability:

* **Pages Directory (`src/main/java/Pages`):** Encapsulates the WebElements, locators, and UI actions for each individual webpage (e.g., HomePage, LoginPage, ProductPage).
* **Tests Directory (`src/test/java/PagesForTest`):** Contains the functional TestNG verification classes and execution logic where assertions are performed.
* **Base Configuration (`src/test/java/Base`):** Houses the `BaseClass` responsible for WebDriver initialization, global browser configurations, and setup/teardown hooks (`@BeforeClass`, `@AfterClass`).

---

## Key Automated Test Scenarios
* User Registration, Account Creation, and Authentication workflows.
* Product Search, filtering, and catalog navigation validation.
* Shopping Cart Management (Adding items, removing items, and verifying real-time quantity or price updates).
* Checkout progression and end-to-end purchasing pipelines.

---

## Execution Instructions
1. Clone this repository to your local machine.
2. Open the project directory using **IntelliJ IDEA** or any compatible Java IDE.
3. Allow **Maven** to sync and download all necessary dependencies specified in the `pom.xml` file.
4. Locate the `TestSuite.xml` file in the root directory.
5. Right-click the file and select **Run** to execute the complete automated test suite.

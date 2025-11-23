# API Automation Framework – FakeRestAPI Authors

![Java](https://img.shields.io/badge/Java-11%2B-blue)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-IDE-000000?logo=intellijidea&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?logo=apachemaven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-Framework-brightgreen)
![RestAssured](https://img.shields.io/badge/RestAssured-API--Testing-yellowgreen)
![Allure](https://img.shields.io/badge/Allure-Reports-ff69b4)

---

## 🗂️ Overview  

This project is an **API Automation Framework** built to test the public
[FakeRestAPI Authors Endpoint](https://fakerestapi.azurewebsites.net/index.html)

The framework is developed using **Java**, **Rest-Assured**, **TestNG**, **Maven**, and **Allure Reports**, providing a clean, modular, and maintainable structure.

Payloads in this project are created using **raw JSON strings**, making it simple and dependency-free.

---

## 🚀 Features

- Automated tests for the **Authors** and **Authors → Books** endpoints
- Covers full **CRUD operations**
- **String-based payloads creation**
- Includes **JSON Schema Validation**
- Integration test covering end-to-end author flows
- Structured into modular components:
    - Endpoints
    - Payload Manager
    - Assertion utilities
    - CRUD Tests
    - Integration Tests
- Supports **Allure Reporting**
- Logging support using **Log4j2**

---

## ⚙️ Tech Stack

- **Java 11+**
- **IntelliJ IDEA** – IDE for development
- **Maven** – Build & dependency management
- **Rest-Assured** – HTTP client for API automation
- **TestNG** – Testing framework
- **AssertJ** – Advanced assertions
- **Allure Reports** – Reporting framework

---

## 🏗️ Project Structure

```base
API_Automation_Framework_FakeRestAPI_Authors/
│
├── .idea/                                              # IntelliJ config
├── .mvn/                                               # Maven wrapper files
├── allure-results/                                     # Allure results (auto-generated)
├── logs/
│   └── test.log                                        # Sample execution log
│
├── pom.xml                                             # Dependencies & build config
├── .gitignore
│
├── testng_*.xml                                        # TestNG suite files
│
├── src/
│   ├── main/java/com/avinashsinha/
│   │   ├── endpoints/                                  # API endpoints
│   │   │   └── APIConstants.java
│   │   │
│   │   └── modules/                                    # Payload Manager (String-based)
│   │       └── PayloadManager.java
│   │
│   ├── main/resources/
│   │   └── log4j2.xml                                  # Logging config
│   │
│   └── test/java/com/avinashsinha/
│       ├── asserts/                                    # Assertion utilities
│       │   └── AssertActions.java
│       │
│       ├── base/                                       # Base Test setup
│       │   └── BaseTest.java
│       │
│       └── tests/
│           ├── crud/                                   # CRUD Test Cases
│           │   ├── TestAuthorsCreate.java
│           │   ├── TestAuthorsDelete.java
│           │   ├── TestAuthorsDetails.java
│           │   ├── TestAuthorsDetailsById.java
│           │   ├── TestAuthorsFullUpdate.java
│           │   ├── TestAuthorBookById.java
│           │   └── TestJSONSchemaValidation.java
│           │
│           ├── integration/                            # Integration Tests
│           │   └── TestE2EFlow.java
│           │
│           └── sample/                                 # Sample Tests
│               └── TestIntegrationSample.java
│
└── README.md

```
---

## ▶️ Running Tests

### Integration Test (Create Author, Details, Update and Delete Author)
```bash
mvn clean test -DsuiteXmlFile=testng_integration.xml
```
#### Available TestNG XMLs

- `testng_authorBookById.xml`
- `testng_createAuthors.xml`
- `testng_deleteAuthors.xml`
- `testng_detailsAuthorById.xml`
- `testng_fullUpdate.xml`
- `testng_integration.xml`
- `testng_JSONSchemaValidation.xml`
- `testng_sample.xml`

---

## 📊 Reporting
### Generate Allure Report
```bash
allure serve allure-results
```
  <img src="https://github.com/user-attachments/assets/285180c9-fc54-45ec-9289-93075c9f199f" alt="FakeRestAPI Authors Allure Report" width="1100">

This will launch an interactive report in your browser.

---
##  ✅ Example Payload (String-Based JSON)

```java
String payload = """
{
  "id": 15,
  "idBook": 3,
  "firstName": "Avinash",
  "lastName": "Sinha"
}
""";

```
---
## 📌 Author
👤 Avinash Sinha

---

# Java Playwright Automation Project

[![Build Status](https://travis-ci.org/your-username/java-playwright.svg?branch=master)](https://travis-ci.org/your-username/java-playwright "Travis CI")
[![codecov](https://codecov.io/gh/your-username/java-playwright/branch/master/graph/badge.svg)](https://codecov.io/gh/your-username/java-playwright)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.your-username/playwright.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.your-username%22%20AND%20a:%22playwright%22)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Overview:

This project is a test automation framework using **Java** and **Playwright**, focused on automated interaction with web page elements, component verification, and browser initialization tests. The **Playwright** tool allows testing web applications across multiple browsers with high precision and efficiency.

## Problem Statement:
- Automating tests for web pages involving complex interactions like button clicks and screenshot capturing.
- Testing the initialization and behavior of web applications.

## Solution:
This project enables you to use **Playwright** to automate web page interactions efficiently, supporting multiple browsers.

## Features:

- **Web Page Interaction**: Automates clicks, form filling, and component verification.
- **Screenshot Capture**: Allows capturing screenshots during tests.
- **Browser Initialization**: Tests application launch across different browsers supported by Playwright.

## Methods:

  `void startApplication(String browser)`: Launches the specified browser (Chrome, Firefox, etc.).
  
  `WebElement findElement(String selector)`: Finds a page element based on the CSS selector.
  
  `void clickElement(WebElement element)`: Clicks the found element.
  
  `void captureScreenshot(String fileName)`: Captures a screenshot and saves it with the specified filename.

## How It Works:

### Test Example:

```java
@Test
public void testButtonClick() throws InterruptedException {
    InitAplication.startApplication("chrome");
    ElementPage elementPage = new ElementPage();
    
    WebElement button = elementPage.findElement("button#submit");
    elementPage.clickElement(button);
    
    elementPage.captureScreenshot("clicking_on_the_button.png");
}
```

# What's New?

This project now supports the following technologies:
- Java 11+
- Playwright 1.x for web test automation.
- Multiple Browsers: Tests can be executed on Chrome, Firefox, and Safari.

# How to Use This Project:

To use this project, simply add the Maven dependency or clone the GitHub repository.

Maven:

```xml
<dependency>
    <groupId>com.your-username</groupId>
    <artifactId>java-playwright</artifactId>
    <version>1.0.0</version>
</dependency>
```

Gradle:

```xml
implementation 'com.your-username:java-playwright:1.0.0'
```

# Configuration:

You can define the browser and other settings in the config.properties file.

# CSS Selector Example:

Here are examples of how to use selectors to find and interact with elements on the page.

### HTML Tag Example:

```html
<button id="submit" type="submit">Submit</button>
```

### You can use the following selector in your test:

```java
WebElement button = elementPage.findElement("button#submit");
elementPage.clickElement(button);
```

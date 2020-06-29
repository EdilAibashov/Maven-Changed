$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/adminCouponPage.feature");
formatter.feature({
  "name": "Admin Coupon Page test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@adminCouponPage"
    }
  ]
});
formatter.scenario({
  "name": "Verify new coupon is created",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@adminCouponPage"
    },
    {
      "name": "@addingCoupon"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@couponTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens Admin home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_Admin_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logsin with admin account",
  "keyword": "When "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logsin_with_admin_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Coupons page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_navigate_to_Coupons_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d83.0.4103.106)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Edil-MacBook-Pro.local\u0027, ip: \u00272601:140:8101:c980:0:0:0:cd11%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/k_/ft1v1brx4qs...}, goog:chromeOptions: {debuggerAddress: localhost:57942}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2dcfb1b595ad6295678d214203a85f5f\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Coupons\u0027)]}\n\tat jdk.internal.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.toString(Unknown Source)\n\tat java.base/java.lang.String.valueOf(String.java:3042)\n\tat java.base/java.lang.StringBuilder.append(StringBuilder.java:168)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.toString(ExpectedConditions.java:305)\n\tat java.base/java.lang.String.valueOf(String.java:3042)\n\tat java.base/java.lang.StringBuilder.append(StringBuilder.java:168)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:268)\n\tat util.SeleniumUtils.waitForClickability(SeleniumUtils.java:27)\n\tat util.SeleniumUtils.click(SeleniumUtils.java:46)\n\tat step_definitions.step_impl.AdminHomePage_Impl.navigateToPage(AdminHomePage_Impl.java:25)\n\tat step_definitions.AdminHomePage_STEPS.user_navigate_to_Coupons_page(AdminHomePage_STEPS.java:36)\n\tat ✽.User navigate to Coupons page(file:src/test/resources/features/adminCouponPage.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "Creates a new coupon",
  "keyword": "And "
});
formatter.match({
  "location": "AdminCouponPage_STEPS.creates_a_new_coupon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verifies coupon is created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});
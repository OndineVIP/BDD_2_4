package ru.netology.test;

import lombok.var;

import static com.codeborne.selenide.Selenide.open;

public class MoneyTransferTest{

    DashboardPage dashboardPage;
 var loginPage = open("http://localhost:9999", LoginPage.class);
        var authInfo = getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = getVerificationCode();
        dashboardPage = verificationPage.validVerify(verificationCode);
}

package org.selenide.examples.tests;

import org.junit.Test;

/**
 * Created by bent5 on 02.12.2020.
 */
public class testUpload extends TestBase {

    @Test
    public void testUpload () throws InterruptedException {
        loginForm.authenticateLoginForm();
        homePage.userSetting();
        homePage.uploadImage();
    }

}

package org.selenide.examples.appmanager;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;


/**
 * Created by bent5 on 02.12.2020.
 */
public class LoginForm {

    public void authenticateLoginForm() throws InterruptedException {
        Thread.sleep(4000);
        $("#email").setValue("bent533@gmail.com");
        $("#password").setValue("123456789123456789");
        Thread.sleep(1000);
        $("button[type='submit']").click();

    }



}

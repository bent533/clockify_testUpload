package org.selenide.examples.appmanager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;




/**
 * Created by bent5 on 02.12.2020.
 */
public class HomePage {


    //Метод перехода в настройки пользователя
    public void userSetting() throws InterruptedException {
        Thread.sleep(5000);
        $(byText("Be")).click();
        $(byText("Profile settings")).click();
    }

    //Метод загрузки аватарки
    public void uploadImage ()
    {
        $("input[type='file']").uploadFile(new File("src/java/org/selenide/examples/tests/resources/ava.jpg"));
    }


}

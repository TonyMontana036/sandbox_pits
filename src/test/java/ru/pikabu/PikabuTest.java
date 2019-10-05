package ru.pikabu;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

public class PikabuTest {

    @Test
    public void checkSearchBar() {
        open("https://pikabu.ru/");
        $(By.cssSelector("div.input_focus")).shouldBe(Condition.visible);
    }

    @Test
    public void userCanSearchGoole() {
        open("https://pikabu.ru/");
        $(By.id("search")).setValue("коты").pressEnter();
    }
}

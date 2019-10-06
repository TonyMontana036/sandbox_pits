package ru.pikabu;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PikabuTest {

  @Test
  public void userCanSearch() {
    Configuration.holdBrowserOpen = true;
    open("https://pikabu.ru/");
    $(By.cssSelector("form[action='/search']"))
            .click();
    $(By.name("q"))
            .setValue("коты")
            .pressEnter();
    $(By.cssSelector("section.section_gray"))
            .shouldBe(Condition.visible);
  }

  @Test
  public void stories() {
    Configuration.holdBrowserOpen = true;
    open("https://pikabu.ru/");
    $(By.cssSelector("div.stories-feed"))
            .shouldBe(Condition.visible);
  }

  @Test
  public void authorization() {
    Configuration.holdBrowserOpen = true;
    open("https://pikabu.ru/");
    $(By.cssSelector("div.input__box input.input__input[name='username']"))
            .shouldBe(Condition.visible);
    $(By.cssSelector("div.input__box input.input__input[name='username']"))
            .setValue("fynjif18");
    $(By.cssSelector("div.input__box input.input__input[name='password']"))
            .setValue("Kjkqsrkzptq01");
    $(By.cssSelector("form[id='signin-form'] button.button_success.button_width_100")).click();
  }

}

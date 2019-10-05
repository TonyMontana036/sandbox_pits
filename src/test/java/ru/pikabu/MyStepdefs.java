package ru.pikabu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MyStepdefs {
  @Если("открыть главную")
  public void открытьГлавную() {
    open("https://pikabu.ru/");
  }

  @И("нажать на значок поиска")
  public void нажатьНаЗначокПоиска() {
    $(By.cssSelector("form[action='/search']")).click();
  }

  @И("ввести в поле поиска {string}")
  public void ввестиВПолеПоиска(String arg0) {
    $(By.name("q")).setValue(arg0);
  }

  @И("нажать Enter")
  public void нажатьEnter(SelenideElement el) {
    el.pressEnter();
  }

  @То("настройка поиска отображена")
  public void настройкаПоискаОтображена() {
    $(By.cssSelector("section.section_gray"))
            .shouldBe(Condition.visible);
  }

  @То("новостная лента отображена")
  public void новостнаяЛентаОтображена() {
    $(By.cssSelector("div.stories-feed"))
            .shouldBe(Condition.visible);

  }

  @И("ввести в поле логин {string}")
  public void ввестиВПолеЛогин(String arg0) {
    $(By.cssSelector("div.input__box input.input__input[name='username']"))
            .setValue(arg0);
  }

  @И("ввести в поле пароль {string}")
  public void ввестиВПолеПароль(String arg0) {
    $(By.cssSelector("div.input__box input.input__input[name='password']"))
            .setValue(arg0);
  }
}

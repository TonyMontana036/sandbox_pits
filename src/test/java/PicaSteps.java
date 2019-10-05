//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.SelenideElement;
//import cucumber.api.java.ru.Если;
//import cucumber.api.java.ru.И;
//import cucumber.api.java.ru.То;
//
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//public class PicaSteps {
//  @Если("открыть главную")
//  public void открытьГлавную() {
//    open("https://pikabu.ru/");
//  }
//
//  @И("нажать на {el}")
//  public void нажатьНа(SelenideElement el) {
//    el.click();
//  }
//
//  @И("ввести в {el} {string}")
//  public void ввестиВ(SelenideElement el, String str) {
//    el.setValue(str);
//  }
//
//  @И("нажать Enter")
//  public void нажатьEnter(SelenideElement el) {
//    el.pressEnter();
//  }
//
//  @То("{el} отображена")
//  public void элементОображен(SelenideElement el) {
//    el.shouldBe(Condition.visible);
//  }
//}

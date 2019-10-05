//import com.codeborne.selenide.SelenideElement;
//import resolves.CucumberName;
//
//import java.util.function.Supplier;
//
//import static com.codeborne.selenide.Selenide.$;
//
//@CucumberName("пикабу")
//public class PicaEl {
//  @CucumberName("значок поиска")
//  public static Supplier<SelenideElement> searchPic = () ->
//          $("form[action='/search']");
//
//  @CucumberName("поле поиска")
//  public static Supplier<SelenideElement> searchBar = () ->
//          $("q");
//
//  @CucumberName("настройка поиска")
//  public static Supplier<SelenideElement> settingSearch = () ->
//          $("section.section_gray");
//
//  @CucumberName("новостная лента")
//  public static Supplier<SelenideElement> news = () ->
//          $("div.stories-feed");
//
//  @CucumberName("поле логин")
//  public static Supplier<SelenideElement> loginBar = () ->
//          $("div.input__box input.input__input[name='username']");
//
//  @CucumberName("поле пароль")
//  public static Supplier<SelenideElement> passwordBar = () ->
//          $("div.input__box input.input__input[name='password']");
//}

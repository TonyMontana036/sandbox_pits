# language: ru
Функция: Проверка сайта пикабу

  Предыстория: Если открыть главную

  @1
  Сценарий: Проверка поиска
    Если открыть главную
    И нажать на значок поиска
    И ввести в поле поиска "коты"
    И нажать Enter
    То настройка поиска отображена

  @2
  Сценарий: Проверка ленты с постами
    То новостная лента отображена

  @3
  Сценарий: Проверка авторизации
    И ввести в поле логин "fynjif18"
    И ввести в поле пароль "Kjkqsrkzptq01"
    И нажать Enter
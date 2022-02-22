![LOGO](https://fs-thb03.getcourse.ru/fileservice/file/thumbnail/h/b635b6cb9478bb87c77e9c070ee6e122.png/s/x50/a/159627/sc/207)

## Homework QA_GURU

### Selenide #1

Simple drag and drop test

```
public class DragAndDropTests {
    @Test
    public void shouldBeSwapped() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("column-b");
        $("#column-a").$("header").shouldHave(text("B"));
        $("#column-b").$("header").shouldHave(text("A"));
    }
}
```

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DragAndDropTests {
    @Test
    public void shouldBeSwapped() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Selenide.sleep(5000);
        $("#column-a").dragAndDropTo("#column-b");
        Selenide.sleep(5000);
        $("#column-a").$("header").shouldHave(text("B"));
        $("#column-b").$("header").shouldHave(text("A"));
    }
}

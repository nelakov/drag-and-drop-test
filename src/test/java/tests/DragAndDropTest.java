package tests;

import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class DragAndDropTest {

    private static final String DRAG_AND_DROP_PAGE = "https://the-internet.herokuapp.com/drag_and_drop";
    private static final String COLUMN_A = "#column-a";
    private static final String COLUMN_B = "#column-b";

    @Test
    @DisplayName("Columns A and B swap places after drag-and-drop")
    void shouldSwapColumns() {
        open(DRAG_AND_DROP_PAGE);

        $(COLUMN_A).dragAndDrop(DragAndDropOptions.to(COLUMN_B));

        $(COLUMN_A).$("header").shouldHave(text("B"));
        $(COLUMN_B).$("header").shouldHave(text("A"));
    }
}

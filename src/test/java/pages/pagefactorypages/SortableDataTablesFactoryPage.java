package pages.pagefactorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SortableDataTablesFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//*[@id='table1']/tbody/tr[1]/td[3]")
    private WebElement email;

    //Constructor
    public SortableDataTablesFactoryPage(WebDriver driver) {
        super(driver);
    }

    public int getRowCount() {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
        int rowCount = rows.size();
        return rowCount;
    }

    public int getColumnCount() {
        List<WebElement> cols = driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th"));
        int colCount = cols.size();
        return colCount;
    }

    public int getRowNumberForEmail(String text) {
        String beforeXpath = "//*[@id='table1']/tbody/tr[";
        String afterXpath = "]/td[3]";

        int i;
        for(i = 1; i <= getRowCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            if(element.getText().equals(text)) {
                System.out.println("email: " + element.getText() + " is found at row " + i);
                break;
            }
        }
        return i;
    }

    public void printRawContent(int rawNumber) {
        String beforeXpath = "//*[@id='table1']/tbody/tr["+rawNumber+"]/td[";
        String afterXpath = "]";

        for (int i = 1; i <= getColumnCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
    }

    public void printLastNameColumn() {
        String beforeXpath = "//*[@id='table1']/tbody/tr[";
        String afterXpath = "]/td[1]";

        for (int i = 1; i <= getRowCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
    }

    public void printFirstNameColumn() {
        String beforeXpath = "//*[@id='table1']/tbody/tr[";
        String afterXpath = "]/td[2]";

        for (int i = 1; i <= getRowCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
    }

    public void printEmailColumn() {
        String beforeXpath = "//*[@id='table1']/tbody/tr[";
        String afterXpath = "]/td[3]";

        for (int i = 1; i <= getRowCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
    }

    public void printDueColumn() {
        String beforeXpath = "//*[@id='table1']/tbody/tr[";
        String afterXpath = "]/td[4]";

        for (int i = 1; i <= getRowCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
    }

    public void printWebSiteColumn() {
        String beforeXpath = "//*[@id='table1']/tbody/tr[";
        String afterXpath = "]/td[5]";

        for (int i = 1; i <= getRowCount(); i++) {
            String actualXpath = beforeXpath+i+afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
    }



}


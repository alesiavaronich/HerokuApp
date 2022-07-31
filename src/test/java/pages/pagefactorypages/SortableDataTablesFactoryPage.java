package pages.pagefactorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SortableDataTablesFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//*[@id='table1']/tbody/tr[1]/td[3]")
    private WebElement email;

    @FindBy(xpath = "//table[@id='table1']/tbody/tr/td[text()='fbach@yahoo.com']//preceding-sibling::td")
    private List<WebElement> firstNameLastNameFromTableOne;

    @FindBy(xpath = "//table[@id='table1']/tbody/tr/td[text()='fbach@yahoo.com']/following-sibling::td/preceding-sibling::td")
    private List<WebElement> frankBachRowFromTableOne;

    @FindBy(xpath = "//table[@id='table2']/tbody/tr/td[text()='fbach@yahoo.com']//following-sibling::td")
    private List<WebElement> dueAndWebSiteFromTableTwo;



    //Constructor
    public SortableDataTablesFactoryPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getFirstNameLastNameFromTableOne() {
        List<String> textFromElements = new ArrayList<String>();
        for(WebElement element : firstNameLastNameFromTableOne) {
            textFromElements.add(element.getText());
        }
        return textFromElements;
    }

    public List<String> getRowFromTableOne() {
        List<String> textFromElements = new ArrayList<String>();
        for(WebElement element : frankBachRowFromTableOne) {
            textFromElements.add(element.getText());
        }
        return textFromElements;
    }

    public List<String> getAmountDueAndWebsiteFromTableTwo() {
        List<String> textFromElements = new ArrayList<String>();
        for(WebElement element : dueAndWebSiteFromTableTwo) {
            textFromElements.add(element.getText());
        }
        textFromElements.remove(2);
        return textFromElements;
    }






    //sandbox for future tests with sortable data tables

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


package tests;

import org.junit.jupiter.api.Test;

import static page.GooglePage.openGooglePage;

public class SearchAndCheckAddressWithPageObjectTest extends TestBase {

    @Test
    void searchAndCheckAddressWithPageObjectTest() {
        openGooglePage()
                .inputTextToSearch()
                .searchTextFromResults()
                .clickOnMenu()
                .searchContactsAndClick()
                .checkDataOnWebPage();
    }
}

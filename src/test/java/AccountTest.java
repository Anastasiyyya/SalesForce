
import objects.Account;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountTest extends BaseTest {

    /**
     * This test checks the compliance of the entered data with the data displayed on the site.
     */
    @Test
    public void createAccountTest() {
        Account account1 = new Account();
        account1
                .setAccountName("account 1")
                .setPhone("111")
                .setWebsite("account1.com")
                .setType("Investor")
                .setIndustry("Banking")
                .setFax("111")
                .setDescription("First account");
        loginPage
                .openPage(LOGIN_URL)
                .login(USERNAME,PASSWORD);
        newAccountModalPage
                .openPage(NEW_ACCOUNT_MODAL_URL)
                .createNewAccount(account1);
        accountListPage
                .openPage(ACCOUNTS_LIST_URL);
        Assert.assertEquals(accountListPage.getExistAccountName("account 1"),"account 1");
        Assert.assertEquals(accountListPage.getExistPhoneNumber("111"),"111");
        accountListPage
                .clickOnAccountName(account1.getAccountName());
        Assert.assertEquals(accountPage.getExistWebsiteName("Website"),"account1.com");
        Assert.assertEquals(accountPage.getExistTypeIndustryDescription("Type"),"Investor");
        Assert.assertEquals(accountPage.getExistTypeIndustryDescription("Industry"),"Banking");
        Assert.assertEquals(accountPage.getExistWebsiteName("Fax"),"111");
        Assert.assertEquals(accountPage.getExistTypeIndustryDescription("Description"),"First account");
    }
}

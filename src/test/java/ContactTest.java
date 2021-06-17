import objects.Contact;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    /**
     * This test checks the compliance of the entered data with the data displayed on the site.
     */
    @Test
    public void createContactTest() {
        Contact contact1 = new Contact();
        contact1
                .setFirstName("1")
                .setLastName("2")
                .setPhone("37517")
                .setMobile("375")
                .setEmail("111@gmail.com")
                .setSalutation("Ms.")
                .setAccountName("account 1");
        loginPage
                .openPage(LOGIN_URL)
                .login(USERNAME, PASSWORD);
        newContactModalPage
                .openPage(NEW_CONTACT_MODAL_URL)
                .createNewContact(contact1);
        contactListPage
                .openPage(CONTACTS_LIST_URL);
        Assert.assertEquals(contactListPage.getExistPhoneNumber("37517"),"37517");
        Assert.assertEquals(contactListPage.getExistContactName("1", "2"),"1 2");
    }
}

package objects;

public class Account {
    private String accountName;
    private String phone;
    private String fax;
    private String website;
    private String type;
    private String industry;
    private String description;

    public Account(String accountName, String phone, String fax, String website, String type, String industry, String description) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.website = website;
        this.type = type;
        this.industry = industry;
        this.description = description;
    }

    public Account() {
    }

    public String getAccountName() {
        return accountName;
    }

    public Account setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public Account setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getType() {
        return type;
    }

    public Account setType(String type) {
        this.type = type;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Account setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Account setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getIndustry() {
        return industry;
    }

    public Account setIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public Account setFax(String fax) {
        this.fax = fax;
        return this;
    }
}

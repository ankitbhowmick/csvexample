/**
 * @author ankitbhowmick@hotmail.com
 * 16/9/18 12:38 PM
 */
public class Customer {
    private Integer CustomerId;
    private String CustomerName;
    private String Country;
    private Long PinCode;
    private String Email;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String country, Long pinCode, String email) {
        super();
        this.CustomerId = customerId;
        this.CustomerName = customerName;
        this.Country = country;
        this.PinCode = pinCode;
        this.Email = email;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Long getPinCode() {
        return PinCode;
    }

    public void setPinCode(Long pinCode) {
        PinCode = pinCode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer [CustomerId=" + CustomerId + ", CustomerName="
                + CustomerName + ", Country=" + Country + ", PinCode="
                + PinCode + ", Email=" + Email + "]";
    }
}

public interface CustomerNameValidation extends CustomerValidation {
    static CustomerValidation isNameValid() {
        return CustomerValidation.holds(customer -> customer.getName().equals("SAID"), "NAME_NOT_VALID");
    }
}

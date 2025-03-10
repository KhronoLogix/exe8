class BusContact extends Contact {
    private String phone;

    public BusContact(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void display() {
        System.out.println("\nBusiness Contact:\nName: " + this.getName() + "\nEmail: " + this.getEmail() + "\nPhone Number: " + this.getPhone());
    }
}
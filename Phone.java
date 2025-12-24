package com.DesignPatterns;

public class Phone {

    private String pname;
    private Integer price;
    private String processor;

    // Private constructor
    private Phone(PhoneBuilder builder) {
        this.pname = builder.pname;
        this.price = builder.price;
        this.processor = builder.processor;
    }

    @Override
    public String toString() {
        return "Phone [pname=" + pname + ", price=" + price + ", processor=" + processor + "]";
    }

    // 🔹 Builder Class
    public static class PhoneBuilder {

        private String pname;
        private Integer price;
        private String processor;

        public PhoneBuilder setPname(String pname) {
            this.pname = pname;
            return this;
        }

        public PhoneBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}

package ets;

public class Delivery {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private double weight;
    private int quantity;
    private int priceItem;
    private String productName;

    public Status getStatus() {
        return status;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public City getCity() {
        return city;
    }

    public double getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public String getProductName() {
        return productName;
    }

    // Buat kelas Status, ServicePackage, dan City beserta getter-setter sesuai
    // dengan struktur JSON

    public class Status {
        private int code;
        private String description;

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }

    public class ServicePackage {
        private String service;
        private int value;

        public String getService() {
            return service;
        }

        public int getValue() {
            return value;
        }
    }

    public class City {
        private String origin;
        private String destination;

        public String getOrigin() {
            return origin;
        }

        public String getDestination() {
            return destination;
        }
    }
}

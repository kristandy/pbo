package ets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSONFile {
    public static void main(String[] args) {
        try {
            // Baca file JSON
            FileReader reader = new FileReader("C:/Users/Aryagara Kristandy/OneDrive/Documents/Kuliah and Stuffs/Semester 3/Pemrograman Berorientasi Objek/Praktik/praktik/praktik/src/ets/data.json");

            // Buat objek Gson
            Gson gson = new GsonBuilder().create();

            // Parse JSON menjadi objek Delivery[]
            Delivery[] deliveries = gson.fromJson(reader, Delivery[].class);

            // Cetak header
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.printf("%-30s | %-8s | %-8s | %-20s | %-25s | %-15s | %-10s%n", 
                "Product Name", "Quantity", "Weight", "Destination", "Service Package", "Service Value", "Total");
            System.out.println("----------------------------------------------------------------------------------------------");

            // Iterasi melalui setiap objek dalam array
            for (int i = 0; i < deliveries.length; i++) {
                Delivery delivery = deliveries[i];

                // Dapatkan data yang diperlukan dari objek Delivery
                String productName = delivery.getProductName();
                int quantity = delivery.getQuantity();
                double weight = delivery.getWeight();
                String destinationCity = delivery.getCity().getDestination();
                String servicePackage = delivery.getServicePackage().getService();
                int serviceValue = delivery.getServicePackage().getValue();
                int total = quantity * serviceValue;

                // Cetak data sesuai format
                System.out.printf("%-30s | %-8d | %-8.2f | %-20s | %-25s | %-15d | %-10d%n",
                    productName, quantity, weight, destinationCity, servicePackage, serviceValue, total);
            }

            System.out.println("----------------------------------------------------------------------------------------------");

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


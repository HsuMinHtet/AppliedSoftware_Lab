package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMgmtAp {
    public static void main(String[] args){
        List<Product> products= new ArrayList<>();

        // Adding products with data
        products.add(new Product(3128874119L, "Banana", LocalDate.parse("2023-01-24"), 124, 0.55));
        products.add(new Product(2927458265L, "Apple", LocalDate.parse("2022-12-09"), 18, 1.09));
        products.add(new Product(9189927460L, "Carrot", LocalDate.parse("2023-03-31"), 89, 2.99));

        print(products);

    }
    private static void print(List<Product> products){
        // Sort products by name using Stream API
        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());

        System.out.println("JSON-formatted list of all Products:");
        String jsonOutput = sortedProducts.stream()
                .map(product -> String.format("  {\n    \"id\": \"%s\",\n    \"name\": \"%s\",\n    \"dateSupplied\": \"%s\",\n    \"quantityInStock\": %d,\n    \"unitPrice\": %.2f\n  }",
                        product.getProduct_Id(), product.getName(), product.getDate_supplied(), product.getQuantityInStock(), product.getUnitPrice()))
                .collect(Collectors.joining(",\n", "[\n", "\n]"));
        System.out.println(jsonOutput);

        System.out.println("\nJSON-formatted list of all Products:");
        String xmlOutput = sortedProducts.stream()
                .map(product -> String.format("  <product>\n    <id>%s</id>\n    <name>%s</name>\n    <dateSupplied>%s</dateSupplied>\n    <quantityInStock>%d</quantityInStock>\n    <unitPrice>%.2f</unitPrice>\n  </product>",
                        product.getProduct_Id(), product.getName(), product.getDate_supplied(), product.getQuantityInStock(), product.getUnitPrice()))
                .collect(Collectors.joining("\n", "<products>\n", "\n</products>"));
        System.out.println(xmlOutput);

        System.out.println("\nJSON-formatted list of all Products :");
        String csvHeader = "Id,Name,DateSupplied,QuantityInStock,UnitPrice";
        String csvOutput = sortedProducts.stream()
                .map(product -> String.format("%s,%s,%s,%d,%.2f",
                        product.getProduct_Id(), product.getName(), product.getDate_supplied(), product.getQuantityInStock(), product.getUnitPrice()))
                .collect(Collectors.joining("\n", csvHeader + "\n", ""));
        System.out.println(csvOutput);
    }
}

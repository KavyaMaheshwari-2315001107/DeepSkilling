package Week_1;

public class EcommerceSearch {
    public static Product linearSearch(Product[] products, int id) {
        for(int i=0; i<products.length; i++) {
            if(products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {
        int start = 0;
        int end = products.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            
            if(products[mid].productId == id) {
                return products[mid];
            }

            if(products[mid].productId < id) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }

        }

        return null;

    }

    public static void main(String[] args) {
        Product products[] = {
        		
                new Product(101,"Laptop","Electronics"),

                new Product(102,"Mobile","Electronics"),

                new Product(103,"Shoes","Fashion"),

                new Product(104,"Watch","Accessories")
        };

        Product p1 = linearSearch(products,103);
        System.out.println("Linear Search Found: " + p1.productName);

        Product p2 = binarySearch(products,104);
        System.out.println("Binary Search Found: " + p2.productName);

        System.out.println("Linear Search: O(n)");

        System.out.println("Binary Search: O(log n)");

    }

}
package com.company;

import com.company.image.Image;
import com.company.image.LazyImageProxy;
import com.company.internet.Internet;
import com.company.internet.LazyInternetProxy;

import java.util.Scanner;

public class Main {

    private static final String document = "\n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur aliquam, neque in varius interdum, metus erat pulvinar enim, vel facilisis nisl eros sed ipsum. Duis sed lorem at elit hendrerit ultricies. Ut finibus quis dolor in suscipit. Suspendisse varius metus eget nulla sollicitudin, ut vulputate nibh cursus. Integer vestibulum nisl a ante venenatis pretium. Suspendisse euismod neque in mollis condimentum. In vitae velit congue, pharetra purus sed, lacinia mi. Sed fermentum, leo tincidunt luctus vulputate, velit velit rhoncus arcu, nec tincidunt purus nibh in tortor. Nam augue turpis, dapibus sed mollis sed, aliquam vestibulum dolor.\n" +
            "\n" +
            "IMAGE NOT LOADED \n" +
            "Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla at lacus a risus suscipit euismod. Vestibulum lobortis risus nec elit mollis rutrum. Praesent eget nibh viverra, tincidunt nunc ac, placerat est. Integer accumsan nec nibh vehicula lobortis. Morbi ut risus diam. Cras interdum egestas ex, in porttitor est commodo venenatis.\n" +
            "\n" +
            "Praesent maximus gravida nisl vitae mollis. Integer malesuada nisl sed tortor lobortis, et maximus nisl ultricies. Phasellus dignissim orci risus. Quisque pellentesque augue a diam rutrum ornare. Cras aliquam lectus sed purus egestas, ut laoreet odio vulputate. Nulla nec aliquet nibh. Cras posuere lacus arcu, et finibus mi gravida eget. Donec dignissim sed tortor non lobortis. Ut mollis mi non diam feugiat posuere. Fusce et lorem quis nibh ullamcorper tincidunt sit amet ultricies nisl.\n" +
            "\n" +
            "IMAGE NOT LOADED \n" +
            "Duis tempor leo quis fermentum imperdiet. Duis quis sodales magna. Proin at elit risus. Mauris laoreet dignissim ex eget tristique. Nunc eu arcu vel lacus elementum auctor euismod id lacus. Nullam lacinia ante id neque condimentum, sit amet porttitor augue facilisis. Proin luctus nunc massa, vel vulputate dolor lobortis ut. Phasellus semper tempus posuere. Cras sollicitudin fringilla nibh, sed blandit nisi maximus varius. Nunc pellentesque, augue eget dignissim viverra, turpis turpis cursus justo, ac pellentesque mauris quam non lectus.\n" +
            "\n" +
            "Nam tempus tempus nulla, in tristique ipsum imperdiet et. Nulla facilisi. Pellentesque venenatis turpis ut enim imperdiet, ac luctus arcu semper. Morbi elementum ligula et mauris vulputate, cursus varius enim posuere. Mauris molestie rhoncus dignissim. Maecenas non neque a eros mollis iaculis. Morbi at semper felis. Nunc a viverra mi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum id augue nec tellus tincidunt tempus a id orci. Etiam malesuada, ex eget placerat rutrum, nulla velit iaculis dolor, non pretium risus metus at ipsum. Cras fringilla suscipit mi, at porttitor urna consequat non. ";

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("For Image Example, press 1 and hit enter ");
            System.out.println("For Internet Example, press 2 and hit enter ");
            int app = scanner.nextInt();
            if(app == 1) {
                runImageProxyExample();
            } else if(app == 2) {
                runInternetExample();
            }
        } catch (Exception e) {
            System.out.println("Try again!");
        }
    }

    private static void runImageProxyExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the document reader. Please type the filename below: ");
        String fileName = scanner.nextLine();
        Image image = new LazyImageProxy(fileName);
        System.out.println(document);
        System.out.println("If you want to load images, press 1 ");
        int control = scanner.nextInt();
        if (control == 1) {
            image.display();
        }
        scanner.close();
    }

    private static void runInternetExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the browser. Please type the url below: ");
        String url = scanner.nextLine();
        Internet internet = new LazyInternetProxy();
        internet.connectTo(url);
        scanner.close();
    }
}

package tearsMy.one;

import vertex.Vertex;

import java.io.IOException;

/**
 * @author Viktor Bilko on 18.09.2017.
 */
public class Test {

    public static void main(String[] args) throws IOException {

        Vertex.write("Hello","src/main/resources/file.txt");
        System.out.println(Vertex.read("src/main/resources/file.txt"));
        System.out.println(Vertex.createdList(5));
    }
}

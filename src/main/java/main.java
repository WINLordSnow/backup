
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        try {
            File resource = new File(Thread.currentThread().getContextClassLoader().getResource("config.txt").toURI());
            //File file = new File(resource);
            Scanner scanner = new Scanner(resource);
            //System.out.println(scanner.nextLine());
            File outDir = new File(scanner.nextLine());
            File inDir = new File(scanner.nextLine());
            FileUtils.copyDirectory(outDir, inDir);
            FileUtils.cleanDirectory(outDir);
        }catch (FileNotFoundException | URISyntaxException e) {
            System.out.println("HER");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
}
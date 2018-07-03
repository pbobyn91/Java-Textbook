import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
	public static void main (String[] args) {
		try {
			
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter a file or directory name: ");
		
			Path path = Paths.get(input.nextLine() );
		
			if (Files.exists(path) ){
				System.out.printf("%n%s exists", path.getFileName() );
				System.out.printf("%s is a directory%n", Files.isDirectory(path) ? "Is" : "Is not" );
				System.out.printf("%s is an absolute path%n", path.isAbsolute() ? "Is" : "Is not" );
				System.out.printf("Last Modified: %s%n", Files.getLastModifiedTime(path) );
				System.out.printf("Size: %s%n", Files.size(path) );
				System.out.printf("Path: %s%n", path);
				System.out.printf("Absolute Path: %s%n", path.toAbsolutePath() );
			
				if (Files.isDirectory(path) ){
					System.out.printf("%nDirectory contents:%n");
				
					DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				
					for (Path p : directoryStream){
						System.out.println(p);
					}
				}
			} else {
				System.out.printf("%s does not exist%n", path);
			}
		} catch (IOException ioe) {
		
		}
	}
}
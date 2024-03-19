package HW4_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HW4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath= Path.of("C:/Users/User/Desktop/demo.txt");
		try {
			String content = Files.readString(filePath);
			
		Pattern pattern=Pattern.compile("01AF0055\\/\\d{6}[a-z]\\.HRV\\.jpg\\?HRV\\.bpp");
		Matcher matcher= pattern.matcher(content);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	} catch(IOException e) {
			e.printStackTrace();		
		}
	}

}

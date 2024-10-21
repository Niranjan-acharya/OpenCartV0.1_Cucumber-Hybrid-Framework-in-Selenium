package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  static Properties p;

  public static Properties getProperties() throws IOException {
    FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
    try {
      p = new Properties();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    p.load(file);
    return p;
  }
}

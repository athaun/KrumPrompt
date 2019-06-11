import java.util.Scanner;
class Methods {

    static String osName = System.getProperty("os.name").toLowerCase();
    static boolean isMacOs = osName.startsWith("mac os x");
    static boolean isLinux = osName.startsWith("linux");
    static boolean isWindows = osName.startsWith("windows");

    public static void runCommand(String input) {
    //  String version = "Alpha 1.0.0";
      // InOut.commands(input);

    }

    public static void osCheck () {
      if (isLinux)
      {
        print("Krum Prompt for Linux\n");
      } else if (isMacOs)
      {
        print("Krum Prompt for Mac OS\n");
      } else if (isWindows)
      {
        print("Krum prompt does not work for windows (yet), please use either the Windows Subsystem for Linux, Mac OS, or Linux");
      }
    }

    public static void textArt () {

      try {
        TextArt artGen = new TextArt();
        // .ART_SIZE_SMALL does not work well on Mac, so we change it to .ART_SIZE_MEDIUM)
        if (Methods.isMacOs) {
          artGen.printTextArt("Krum Prompt", artGen.ART_SIZE_MEDIUM);
        } else {
          artGen.printTextArt("Krum Prompt", artGen.ART_SIZE_SMALL);
        }
      } catch (Exception Exception) {
          print("Error in catch exception (Methods.textArt())");
      }
    }

    public static void clearScreen () {
        System.out.print("\033c");
    }

    public static void print (String str) {
        System.out.println(str);
    }

    public static void printL (String str) {
        System.out.print(str);
    }

    public static String input (String prompt) {
        Scanner reader = new Scanner(System.in);
        printL(prompt);
        String in = reader.nextLine();
        return in;
    }

}

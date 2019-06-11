public class InputMethods {

  public static void manual (String command_) {
    String command = command_.substring(3).replace(" ", "");
    Methods.print("---[ Help for command '" + command + "' ]---");
    switch(command) {
      case "help":
        Methods.print("Help");
        break;
    }
  }

  public static void runBashCmd(String command) {
     try {
        Runtime rt = Runtime.getRuntime();
        Process pID = rt.exec(command);
      } catch(Exception exception) {
        Methods.print("Catch exception | Error running command in Methods.runBashCmd()");
     }
  }

  public static void commands(String input) {
    String version = "Alpha 1.1.0";
    String returnString = "";
    // if (input.equals("")) {}
    if (input.startsWith("man")) {
      manual(input);
    }
    if (input.equals("quit") || input.equals("exit") || input.equals("")) {
      System.exit(0);
    }
    if (input.equals("about")) {
      Methods.print("Krum Prompt " + version);
    }
    if (input.equals("credits")) {
      Methods.print("Developed by:\nEthan, Keith, and Asher (with inspiration from Krum)");
    }
    if (input.equals("hello")) {
      Methods.print("Greetings Krum Prompt user");
    }
    if (input.startsWith("web ")) {
      String defaultSearchEngine = "startpage"; // bing
      String search = input.substring(3).replace(" ", "+");
      if (Methods.isMacOs) {
        runBashCmd("open -a firefox https://www." + defaultSearchEngine + ".com/search?q=" + search);
      } else if (Methods.isLinux) {
        runBashCmd("firefox https://www." + defaultSearchEngine + ".com/search?q=" + search);
      }
    }
  }


}

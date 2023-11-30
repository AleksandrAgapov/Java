


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class lesson_3_task_4 {
/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
*/
static Logger logger = Logger.getAnonymousLogger();

public static void main(String[] args) {
String filePath = "src/lesson2/seminar/test.txt";
String logPath = "src/lesson2/seminar/log.txt";
String s = "Test";
int n = 5;

createLogger(logPath);
String s1 = repeat(s, n);
// System.out.println(s1);
saveToFile(s1, filePath);
System.out.println(readFile(filePath));
closeLogger();
}

static void closeLogger() {
Handler[] handlers = logger.getHandlers();
for (Handler handler: handlers){
handler.close();
}
}

static void createLogger(String logPath) {
try {
FileHandler handler = new FileHandler(logPath, true);
logger.addHandler(handler);
SimpleFormatter formatter = new SimpleFormatter();
handler.setFormatter(formatter);
} catch (IOException e) {
e.printStackTrace();
}
}

static void saveToFile(String s, String filePath) {
try (FileWriter writer = new FileWriter(filePath)) {
writer.write(s);
logger.info("Запись прошла успешно");
} catch (Exception e) {
e.printStackTrace();
logger.warning("Не удалось записать в файл");
}
}

static String readFile(String filePath) {
File file = new File(filePath);
StringBuilder stringBuilder = new StringBuilder();
try (Scanner scanner = new Scanner(file)) {
while (scanner.hasNext()) {
stringBuilder.append(scanner.nextLine());
stringBuilder.append("\n");
}
} catch (Exception e) {
e.printStackTrace();
}
return stringBuilder.toString();
}

static String repeat(String s, int n) {
s = s.toUpperCase();
StringBuilder stringBuilder = new StringBuilder();
for (int i = 0; i < n; i++) {
stringBuilder.append(s);
stringBuilder.append(" ");
}
// return s.repeat(n);
return stringBuilder.toString();
}
}
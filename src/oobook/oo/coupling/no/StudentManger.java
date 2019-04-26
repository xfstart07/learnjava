package oobook.oo.coupling.no;

public class StudentManger {
    public void add(Integer studentId, String name) {
        try {
            dbInsert(studentId, name);
        } catch (Exception e) {
            log("ERROR", e.getMessage());
        }
    }

    private void dbInsert(Integer studentId, String name) {
        // TODO
    }

    private void log(String level, String message) {
        openLogFile();

        String log = formatLogString(level, message);

    }

    private void closeLogFile() {

    }

    private void writeLog(String log) {

    }

    private String formatLogString(String level, String message) {
        return String.format("[%s] %s", level, message);
    }

    private void openLogFile() {

    }
}

package homework.day14;

public class Log {
    public static void main(String[] args) {
        String ipString = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.7 granted\n" +
                "access_log.2020.09.07 212.168.101.8 granted\n";

        String[] lines = ipString.replaceAll("access_log.\\d{4}.\\d{2}.\\d{2}", "").split("[\\n\\r]");
        String[][] logsSummary = new String[lines.length][3];
        for (String[] summaryItem : logsSummary) {
            for (int i = 0; i < 3; i++) {
                summaryItem[i] = "0";
            }
        }
        int uniqueRecords = 0;
        for (String line : lines) {
            String[] ipSplitted = line.split("");
            for (String[] summaryItem : logsSummary) {
                if (ipSplitted[0].equals(summaryItem[0]) || summaryItem[0].equals("0")) {
                    if (summaryItem[0].equals("0")) {
                        uniqueRecords++;
                        summaryItem[0] = ipSplitted[0];
                    }
                    int position = ipSplitted[1].equals("granted") ? 1 : 2;
                    summaryItem[position] = String.valueOf((!summaryItem[position].equals("0") ? Integer.parseInt(summaryItem[position]) : 0) +1);
                    break;
                }
            }
        }
        String[][] finalSummary = new String[uniqueRecords][3];
        for (int i=0; i < finalSummary.length; i++) {
            finalSummary[i] = logsSummary[i];
        }
        for (String[] summaryItem : finalSummary) {
            for (String st : summaryItem) {
                System.out.println(st + "");
            }
            System.out.println();
        }
    }
}

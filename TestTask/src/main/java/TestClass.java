import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestClass {
    public static void main(String[] args) {
        //Для теста
        //ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(0, 1,-1, 2,-9, 3,-7, 4));
        //System.out.println(getNumbers(testList));
    }

    public static String getNumbers(ArrayList<Integer> list) {
        String text = "";
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            switch (iterator.next()) {
                case 9:
                    text += "плюс девять;";
                    break;
                case 8:
                    text += "плюс восемь;";
                    break;
                case 7:
                    text += "плюс семь;";
                    break;
                case 6:
                    text += "плюс шесть;";
                    break;
                case 5:
                    text += "плюс пять;";
                    break;
                case 4:
                    text += "плюс четыре;";
                    break;
                case 3:
                    text += "плюс три;";
                    break;
                case 2:
                    text += "плюс два;";
                    break;
                case 1:
                    text += "плюс один;";
                    break;
                case 0:
                    text += "ноль;";
                    break;
                case -1:
                    text += "минус один;";
                    break;
                case -2:
                    text += "минус два;";
                    break;
                case -3:
                    text += "минус три;";
                    break;
                case -4:
                    text += "минус четрые;";
                    break;
                case -5:
                    text += "минус пять;";
                    break;
                case -6:
                    text += "минус шесть;";
                    break;
                case -7:
                    text += "минус семь;";
                    break;
                case -8:
                    text += "минус восемь;";
                    break;
                case -9:
                    text += "минус девять;";
                    break;
                default:
                    text = "error";
                    break;
            }
        }

        if (text.contains("error")) {
            text = "error";
        }

        if (text.substring(text.length()-1).equals(";")) {
            text = text.substring(0,text.length()-1);
        }

        return (text);
    }
}
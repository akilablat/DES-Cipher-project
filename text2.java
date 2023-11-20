import CASCII.java;
import java.util.*;
import java.io.*;

public class text2 {

    public static String listToStr(ArrayList<String> list) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            str.append(list.get(i));
        }
        return str.toString();
    }

    public static String decimalToBinary(int num) {
        String str = Integer.toBinaryString(num);
        ArrayList<String> list = new ArrayList<>();
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        for (char ch : str.toCharArray()) {
            String sh = String.valueOf(ch);
            list.add(sh);
        }
        while (list.size() > 10) {
            list.remove(0);
        }
        String ll = listToStr(list);
        return ll;
    }

    public static ArrayList<String> toList(String str) {
        ArrayList<String> out = new ArrayList<String>();
        for (char ch : str.toCharArray()) {
            String sh = String.valueOf(ch);
            out.add(sh);
        }
        return out;
    }

    public static ArrayList<String> P10List(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(2));
        chars.add(list.get(4));
        chars.add(list.get(1));
        chars.add(list.get(6));
        chars.add(list.get(3));
        chars.add(list.get(9));
        chars.add(list.get(0));
        chars.add(list.get(8));
        chars.add(list.get(7));
        chars.add(list.get(5));
        return chars;
    }

    public static ArrayList<String> P10Left_1(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(1));
        chars.add(list.get(2));
        chars.add(list.get(3));
        chars.add(list.get(4));
        chars.add(list.get(0));
        return chars;
    }

    public static ArrayList<String> P10Right_1(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(6));
        chars.add(list.get(7));
        chars.add(list.get(8));
        chars.add(list.get(9));
        chars.add(list.get(5));
        return chars;
    }

    public static ArrayList<String> P8List(ArrayList<String> list, ArrayList<String> list2) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list2.get(0));
        chars.add(list.get(2));
        chars.add(list2.get(1));
        chars.add(list.get(3));
        chars.add(list2.get(2));
        chars.add(list.get(4));
        chars.add(list2.get(4));
        chars.add(list2.get(3));
        return chars;
    }

    public static ArrayList<String> P10Left_2(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(3));
        chars.add(list.get(4));
        chars.add(list.get(0));
        chars.add(list.get(1));
        chars.add(list.get(2));
        return chars;
    }

    public static ArrayList<String> P10Right_2(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(8));
        chars.add(list.get(9));
        chars.add(list.get(5));
        chars.add(list.get(6));
        chars.add(list.get(7));
        return chars;
    }

    public static ArrayList<String> k1(String str) {
        ArrayList<String> out = toList(str);
        ArrayList<String> p10 = P10List(out);
        ArrayList<String> p10Left_1 = P10Left_1(p10);
        ArrayList<String> p10Right_1 = P10Right_1(p10);
        ArrayList<String> p8 = P8List(p10Left_1, p10Right_1);
        return p8;
    }

    public static ArrayList<String> k2(String str) {
        ArrayList<String> out = toList(str);
        ArrayList<String> p10 = P10List(out);
        ArrayList<String> p10Left_1 = P10Left_1(p10);
        ArrayList<String> p10Right_1 = P10Right_1(p10);
        ArrayList<String> p8 = P8List(p10Left_1, p10Right_1);
        ArrayList<String> p10Left_2 = P10Left_2(p10);
        ArrayList<String> p10Right_2 = P10Right_2(p10);
        ArrayList<String> p8_2 = P8List(p10Left_2, p10Right_2);
        return p8_2;
    }

    public static ArrayList<String> ip(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList();
        chars.add(list.get(1));
        chars.add(list.get(5));
        chars.add(list.get(2));
        chars.add(list.get(0));
        chars.add(list.get(3));
        chars.add(list.get(7));
        chars.add(list.get(4));
        chars.add(list.get(6));
        return chars;
    }

    public static ArrayList<String> ip_Left(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList();
        chars.add(list.get(0));
        chars.add(list.get(1));
        chars.add(list.get(2));
        chars.add(list.get(3));
        return chars;
    }

    public static ArrayList<String> ip_Right(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList();
        chars.add(list.get(4));
        chars.add(list.get(5));
        chars.add(list.get(6));
        chars.add(list.get(7));
        return chars;
    }

    public static ArrayList<String> ep(ArrayList<String> list) {
        ArrayList<String> chars = new ArrayList();
        chars.add(list.get(3));
        chars.add(list.get(0));
        chars.add(list.get(1));
        chars.add(list.get(2));
        chars.add(list.get(1));
        chars.add(list.get(2));
        chars.add(list.get(3));
        chars.add(list.get(0));
        return chars;
    }

    public static ArrayList<String> xor(ArrayList<String> list, ArrayList<String> list2) {
        ArrayList<String> chars = new ArrayList();
        for (int i = 0, n = list.size(); i < n; i++) {
            if ((list.get(i)).equals(list2.get(i))) {
                chars.add("0");
            } else {
                chars.add("1");
            }
        }
        return chars;
    }

    public static ArrayList<String> s0(ArrayList<String> list) {
        ArrayList<ArrayList<String>> s0 = new ArrayList<ArrayList<String>>();
        s0.add(new ArrayList<String>());
        s0.add(new ArrayList<String>());
        s0.add(new ArrayList<String>());
        s0.add(new ArrayList<String>());
        s0.get(0).add(0, "01");
        s0.get(0).add(1, "00");
        s0.get(0).add(2, "11");
        s0.get(0).add(3, "10");
        s0.get(1).add(0, "11");
        s0.get(1).add(1, "10");
        s0.get(1).add(2, "01");
        s0.get(1).add(3, "00");
        s0.get(2).add(0, "00");
        s0.get(2).add(1, "10");
        s0.get(2).add(2, "01");
        s0.get(2).add(3, "11");
        s0.get(3).add(0, "11");
        s0.get(3).add(1, "01");
        s0.get(3).add(2, "11");
        s0.get(3).add(3, "10");

        String rowS = list.get(0) + list.get(3);
        String colS = list.get(1) + list.get(2);

        int row = 0;
        int col = 0;

        if (rowS.equals("00")) {
            row = 0;
        } else if (rowS.equals("01")) {
            row = 1;
        } else if (rowS.equals("11")) {
            row = 3;
        } else {
            row = 2;
        }
        if (colS.equals("00")) {
            col = 0;
        } else if (colS.equals("01")) {
            col = 1;
        } else if (colS.equals("11")) {
            col = 3;
        } else {
            col = 2;
        }

        ArrayList<String> s3 = new ArrayList();
        s3.add(s0.get(row).get(col));

        ArrayList<String> s4 = new ArrayList();
        for (char ch : s3.get(0).toCharArray()) {
            String sh = String.valueOf(ch);
            s4.add(sh);
        }
        return s4;
    }

    public static ArrayList<String> s1(ArrayList<String> list) {
        ArrayList<ArrayList<String>> s0 = new ArrayList<ArrayList<String>>();
        s0.add(new ArrayList<String>());
        s0.add(new ArrayList<String>());
        s0.add(new ArrayList<String>());
        s0.add(new ArrayList<String>());
        s0.get(0).add(0, "00");
        s0.get(0).add(1, "01");
        s0.get(0).add(2, "10");
        s0.get(0).add(3, "11");
        s0.get(1).add(0, "10");
        s0.get(1).add(1, "00");
        s0.get(1).add(2, "01");
        s0.get(1).add(3, "11");
        s0.get(2).add(0, "11");
        s0.get(2).add(1, "00");
        s0.get(2).add(2, "01");
        s0.get(2).add(3, "00");
        s0.get(3).add(0, "10");
        s0.get(3).add(1, "01");
        s0.get(3).add(2, "00");
        s0.get(3).add(3, "11");

        String rowS = list.get(0) + list.get(3);
        String colS = list.get(1) + list.get(2);

        int row = 0;
        int col = 0;

        if (rowS.equals("00")) {
            row = 0;
        } else if (rowS.equals("01")) {
            row = 1;
        } else if (rowS.equals("11")) {
            row = 3;
        } else {
            row = 2;
        }
        if (colS.equals("00")) {
            col = 0;
        } else if (colS.equals("01")) {
            col = 1;
        } else if (colS.equals("11")) {
            col = 3;
        } else {
            col = 2;
        }

        ArrayList<String> s3 = new ArrayList();
        s3.add(s0.get(row).get(col));

        ArrayList<String> s4 = new ArrayList();
        for (char ch : s3.get(0).toCharArray()) {
            String sh = String.valueOf(ch);
            s4.add(sh);
        }
        return s4;
    }

    public static ArrayList<String> P4List(ArrayList<String> list, ArrayList<String> list2) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(1));
        chars.add(list2.get(1));
        chars.add(list2.get(0));
        chars.add(list.get(0));
        return chars;
    }

    public static ArrayList<String> swap(ArrayList<String> list, ArrayList<String> list2) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list2.get(0));
        chars.add(list2.get(1));
        chars.add(list2.get(2));
        chars.add(list2.get(3));
        chars.add(list.get(0));
        chars.add(list.get(1));
        chars.add(list.get(2));
        chars.add(list.get(3));
        return chars;
    }

    public static ArrayList<String> ip_1(ArrayList<String> list, ArrayList<String> list2) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(list.get(3));
        chars.add(list.get(0));
        chars.add(list.get(2));
        chars.add(list2.get(0));
        chars.add(list2.get(2));
        chars.add(list.get(1));
        chars.add(list2.get(3));
        chars.add(list2.get(1));
        return chars;
    }

    public static ArrayList<String> encryp(String plaintext, ArrayList<String> k1, ArrayList<String> k2) {
        ArrayList<String> out = toList(plaintext);
        ArrayList<String> initial = ip(out);
        ArrayList<String> initial_left = ip_Left(initial);
        ArrayList<String> initial_right = ip_Right(initial);
        ArrayList<String> expand_right = ep(initial_right);
        ArrayList<String> xor = xor(expand_right, k1);
        ArrayList<String> xor_left = ip_Left(xor);
        ArrayList<String> xor_right = ip_Right(xor);
        ArrayList<String> s0 = s0(xor_left);
        ArrayList<String> s1 = s1(xor_right);
        ArrayList<String> p4 = P4List(s0, s1);
        ArrayList<String> xor_p4 = xor(initial_left, p4);
        ArrayList<String> sw = swap(xor_p4, initial_right);
        ArrayList<String> sw_left = ip_Left(sw);
        ArrayList<String> sw_right = ip_Right(sw);
        ArrayList<String> expand_right2 = ep(sw_right);
        ArrayList<String> xor2 = xor(expand_right2, k2);
        ArrayList<String> xor2_left = ip_Left(xor2);
        ArrayList<String> xor2_right = ip_Right(xor2);
        ArrayList<String> s02 = s0(xor2_left);
        ArrayList<String> s12 = s1(xor2_right);
        ArrayList<String> p42 = P4List(s02, s12);
        ArrayList<String> xor2_p4 = xor(sw_left, p42);
        ArrayList<String> finalp = ip_1(xor2_p4, sw_right);
        return finalp;
    }

    public static ArrayList<String> decryp(String ciphertext, ArrayList<String> k2, ArrayList<String> k1) {
        ArrayList<String> out = toList(ciphertext);
        ArrayList<String> initial = ip(out);
        ArrayList<String> initial_left = ip_Left(initial);
        ArrayList<String> initial_right = ip_Right(initial);
        ArrayList<String> expand_right = ep(initial_right);
        ArrayList<String> xor = xor(expand_right, k2);
        ArrayList<String> xor_left = ip_Left(xor);
        ArrayList<String> xor_right = ip_Right(xor);
        ArrayList<String> s0 = s0(xor_left);
        ArrayList<String> s1 = s1(xor_right);
        ArrayList<String> p4 = P4List(s0, s1);
        ArrayList<String> xor_p4 = xor(initial_left, p4);
        ArrayList<String> sw = swap(xor_p4, initial_right);
        ArrayList<String> sw_left = ip_Left(sw);
        ArrayList<String> sw_right = ip_Right(sw);
        ArrayList<String> expand_right2 = ep(sw_right);
        ArrayList<String> xor2 = xor(expand_right2, k1);
        ArrayList<String> xor2_left = ip_Left(xor2);
        ArrayList<String> xor2_right = ip_Right(xor2);
        ArrayList<String> s02 = s0(xor2_left);
        ArrayList<String> s12 = s1(xor2_right);
        ArrayList<String> p42 = P4List(s02, s12);
        ArrayList<String> xor2_p4 = xor(sw_left, p42);
        ArrayList<String> finalp = ip_1(xor2_p4, sw_right);
        return finalp;
    }

    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter(new File("output2.txt"));
            String text = "00011111100111111110011111101100111000000011001011110010101010110001011101001101000000110011010111111110000000001010111111000001010010111001111001010101100000110111100011111101011100100100010101000011001100101000000101111011000010011010111100010001001000100001111100100000001000000001101101000000001010111010000001000010011100101111001101111011001001010001100010100000";
            ArrayList<String> list = toList(text);
            for (int i = 0; i < 1024; i++) {
                String RawKey = decimalToBinary(i);
                for (int s = 0; s < 1024; s++) {
                    String RawKey2 = decimalToBinary(s);
                    StringBuilder str1 = new StringBuilder();
                    for (int k = 0; k < list.size(); k += 8) {
                        ArrayList<String> list1 = new ArrayList<>();
                        list1.add(list.get(k));
                        list1.add(list.get(k + 1));
                        list1.add(list.get(k + 2));
                        list1.add(list.get(k + 3));
                        list1.add(list.get(k + 4));
                        list1.add(list.get(k + 5));
                        list1.add(list.get(k + 6));
                        list1.add(list.get(k + 7));
                        String str2 = listToStr(list1);
                        ArrayList<String> key1_1 = k1(RawKey);
                        ArrayList<String> key1_2 = k2(RawKey);
                        ArrayList<String> key2_1 = k1(RawKey2);
                        ArrayList<String> key2_2 = k2(RawKey2);
                        String plaintext = listToStr(decryp(
                                listToStr(encryp(listToStr(decryp(str2, key1_2, key1_1)), key2_1, key2_2)), key1_2,
                                key1_1));
                        str1.append(plaintext);
                    }

                    String str4 = str1.toString();
                    ArrayList<String> list2 = new ArrayList<>();
                    for (char ch : str4.toCharArray()) {
                        String sh = String.valueOf(ch);
                        list2.add(sh);
                    }
                    byte a[] = new byte[list2.size()];
                    for (int j = 0; j < list2.size(); j++) {
                        a[j] = Byte.parseByte(list2.get(j));
                    }
                    CASCII cas = new CASCII();
                    String out = cas.toString(a);
                    output.print("Key1: " + RawKey + "  ");
                    output.print("Key2: " + RawKey2 + "   ");
                    output.println(out);
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}

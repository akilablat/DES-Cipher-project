import java.util.Scanner;
import java.util.ArrayList;

public class SDES {

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
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter 0 for Encryption or 1 for Decryption");
        String select = myObj.nextLine();
        if (select.equals("0")) {
            System.out.println("Please Enter 10bits Raw Key: ");
            String RawKey = myObj.nextLine();
            System.out.println("Please Enter 8bits Plaintext: ");
            String Plaintext = myObj.nextLine();
            ArrayList<String> key1 = k1(RawKey);
            ArrayList<String> key2 = k2(RawKey);
            ArrayList<String> ciphertext = encryp(Plaintext, key1, key2);
            System.out.print("Ciphertext is: ");
            for (int i = 0; i < ciphertext.size(); i++) {
                System.out.print(ciphertext.get(i));
            }
        }

        if (select.equals("1")) {
            System.out.println("Please Enter 10bits Raw Key: ");
            String RawKey = myObj.nextLine();
            System.out.println("Please Enter 8bits Ciphertext: ");
            String ciphertext = myObj.nextLine();
            ArrayList<String> key1 = k1(RawKey);
            ArrayList<String> key2 = k2(RawKey);
            ArrayList<String> plaintext = decryp(ciphertext, key2, key1);
            System.out.print("Plaintext is: ");
            for (int i = 0; i < plaintext.size(); i++) {
                System.out.print(plaintext.get(i));
            }
        }
    }
}

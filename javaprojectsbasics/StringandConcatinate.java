package javaprojectsbasics;

public class StringandConcatinate{
    public static void main(String[] args) {
        // string
        //concatenation
        //indexing
        String name1 = "Supreme";
        String name2 = "Khatri";
        String name3 = name1 +  name2;
        String name4 = name1 + " and " + name2;
        System.out.println(name3); // call gareako object lai print garna ko lagi toString() method use garinxa
        System.out.println(name4);
        System.out.println(name1.endsWith("e")); // end ma e xa ki xaina check garna
        System.out.println(name1.charAt(1));   // indexing gareako
        System.out.println(name1.replace("S", "K")); // replace gareako
    }
}

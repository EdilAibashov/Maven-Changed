public class StringManipulation {
    public String returnInitialsInCaps(String str) {
        String t ="";
        String[] arr = str.split(" ");
        for(String e : arr) {
            t += e.charAt(0) + "";
        }
        System.out.println(t.toUpperCase());
        return t.toUpperCase();
        }



    public static void main(String[] args) {
        StringManipulation str = new StringManipulation();
        String testData = "tech Lead Academy";
        str.returnInitialsInCaps("Tech Lead Academy");
        String expected = "TLA";

        String actual = str.returnInitialsInCaps(testData);

        if(!expected.equals(actual))
            System.out.println("Test failed");

        }

}

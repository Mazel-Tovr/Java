public class TestProgram
{
    public static void main(String[] args)
    {
       // System.out.println(DuplicateEncoder.encode(")()([)])()(()()("));

        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA+"";

        System.out.println(CountingDuplicates.duplicateCount("111444445555556666611223333111312311111333333311111111"));
    }
}

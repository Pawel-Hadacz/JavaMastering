package mastering.repetition;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kb = 1024;
        if(kiloBytes>=0){
            int MB = kiloBytes/kb;
            int KBleft = kiloBytes%kb;
            System.out.println(kiloBytes + " KB = "
                    + MB + " MB and "
                    + KBleft + " KB");
        }else
        {
            System.out.println("Invalid Value");
        }
    }
}

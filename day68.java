public class day68 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int y = 0; y < 8;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i<8;i+=2){
            for(int y = 0; y<16;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

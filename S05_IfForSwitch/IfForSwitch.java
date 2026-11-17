public class IfForSwitch {
    public static void main(String[] args){
        // if文
        int num = 10;
        if(num > 0){
            System.out.println("Positive");
        } else if(num < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // for文
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // switch文
        switch(num){
            case 10:
                System.out.println("Ten");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
}

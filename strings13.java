import java.util.Scanner;

public class strings13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Jharkhand Khelgaow \n Play for your  State \n Fillup the form\n");

        System.out.println("Select Your Gender:");
        System.out.println("1.Male");
        System.out.println("2.Female");
        int g=sc.nextInt();

        switch(g){
            case 1:System.out.println("You are a Male");
            break;
            case 2:System.out.println("You are a Female");
            break;
            default:System.out.println("You are not eligible for this job");

        }
        if(g==1){
            System.out.println("Choose Your Game:\n1.Cricket\n2.Football\n3.Basketball\n4.Volleyball");
            int gm=sc.nextInt();
            switch(gm){
                case 1:System.out.println("Cricket");
                break;
                case 2:System.out.println("Football");
                break;
                case 3:System.out.println("Basketball");
                break;
                case 4:System.out.println("Volleyball");
                break;
                default:System.out.println("Invalid Option");
            }
            if(gm==1){
                System.out.println("You are Applying for Cricket\nEnter Your Name:\nEnter Your age:");
                String name=sc.next();
                int age=sc.nextInt();
                System.out.println("Mr"+name+" "+age+"\nSelect Your Profession:\n1.Batsman\n2.Baller\n3.Allrounder");
                int profession=sc.nextInt();
                switch(profession){
                    case 1:System.out.println("Batsman");
                    break;
                    case 2:System.out.println("Baller");
                    break;
                    case 3:System.out.println("Allrounder");
                    break;
                    default:System.out.println("Invalid Option");
                }

            }
            else if(gm==2) {
                System.out.println("You are Applying for Football \nEnter Your Name:\nEnter Your age:");
                String name = sc.next();
                int age = sc.nextInt();        
                System.out.println("Mr" + name + " " + age + "\nSelect Your Profession:\n1.Goalkeeper\n2.Goalki\n3.Allrounder");
                int fbprof = sc.nextInt();
                switch (fbprof) {
                    case 1:
                        System.out.println("Goalkeeper");
                        break;
                    case 2:
                        System.out.println("Goalki");
                        break;
                    case 3:
                        System.out.println("Allrounder");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
            }
            else if(gm==3){
                System.out.println("You are Applying for Basketball \nEnter Your Name:\nEnter Your age:");
                String name = sc.next();
                int age = sc.nextInt();
                System.out.println("Mr"+name );
            }
        }
    }
}

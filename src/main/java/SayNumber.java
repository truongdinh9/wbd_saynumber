
import java.util.Scanner;

public class SayNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so can doc thanh chu ");
        int number=scanner.nextInt();
        String[]num=new String[]{"one","two","three","four","five","six","seven","eight","nine"};
        int c=number%10;
        int b=((number-c)%100)/10;
        int a=(number-c-10*b)/100;
        String result="";
        if(a>=1&&a<10){result+=num[a-1]+"hundered";}
        if(a!=0){result+=" and ";}

        switch (b){
            case 0:
                for (int i=1;i<10;i++){
                    if (c==i){ result+=num[i-1];}

                }
                break;
            case 1:

                if (c>=6){ result+=num[c-1]+"teen";}
                if(c==0){result+="ten ";}
                if (c==1){result+=" elevent";}
                if (c==2){result+="twelve";}
                if(c==3){result+="thirteen";}
                if (c==4){result+="fourteen";}
                if(c==5){result+="fifteen";}
                break;
            case 2:
                if(c==0){result+="twenty";}else {
                    result+="twenty"+num[c-1];
                }
                break;
            case 3:
                result+="thirty";
                if (c!=0){result+=num[c-1];}
                break;
            case 5:
                result+="fifty";
                if(c!=0){ result+=num[c-1];}
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                result+=num[b-1]+"ty";
                if(c!=0){result+=num[c-1];
                break;
                }

        }
        System.out.println(result);
}
}

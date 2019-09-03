public class HeyJude {
  public static void main(String[] args) {

    String heyJude = "Hey Jude ";
    String dont = "don't ";

    String make = "make it bad ";
    String beAfraid = "be afraid ";
    String letMe = "let me down ";

    String takeaSad = "take a sad song and make it better ";
    String youWere = "you were made to go out and get her ";
    String youHave = "you have found her, now go and get her ";

    String remember = "remember to ";

    String letHerInto = "let her into your heart ";
    String letHerUnder = "let her under your skin ";

    String then = "then you ";

    String canStart = "can start ";
    String begin = "begin ";

    String toMake = "to make it better ";

    String better = "better ";

    String na = "na ";

    System.out.println();
    int p = 0;
    while (p < 7){
    if (p==0 || p==1 || p==3 || p==5){
      System.out.print(heyJude);
    }

    if (p==0 || p==1 || p==3 || p==5){
      System.out.print(dont);
    }

    if(p==3){
      System.out.println(letMe);
    }

    if(p==3){
      System.out.println(youHave);
    }

    if (p==0 || p==5){
      System.out.println(make);
      System.out.println(takeaSad);
    }

    if(p==1){
      System.out.println(beAfraid);
    }

    if(p==1){
      System.out.println(youWere);
    }

    if (p==0 || p==1 || p==3 || p==5){
      System.out.print(remember);
    }

    if(p==1 || p==5){
      System.out.println(letHerUnder);
    }

    if (p==0 || p==3){
      System.out.println(letHerInto);
    }

    if (p==0 || p==1 || p==3 || p==5){
      System.out.print(then);
    }

    if(p==1 || p==5){
      System.out.print(begin);
    }

    if (p==0 || p==3){
      System.out.print(canStart);
    }

    if (p==0 || p==1 || p==3 || p==5){
      System.out.println(toMake);
    }

    if (p==2 || p==4){
      int i=0;
      while (i<11){
        System.out.print(na);
        i++;
      }
      System.out.println();
    }

    if (p==6){
      int a=0;
      while (a<11){
        System.out.print(na);
        a++;
      }
      System.out.print (heyJude);
      System.out.println();
    }

    if (p==5){
      int j=0;
      while (j<6){
        System.out.print(better);
        j++;
      }
      System.out.print ("oh");
      System.out.println();
    }

    System.out.println();
    p++;
    }
  }
}

 /* encapsulation, abstraction, inheritance, class, constructors, object,exception handling,final keyword */
import java.util.*; //scanner class
import java.lang.*;


class budget 
{
  budget(int n, int m) // constructor
  {
    if (n == 1) 
    {
      n = 2500;
      if (m == 1)
      {
        m = 50;
      } else if (m == 2)
      {
        m = 800;
      } else
      {
        m = 20;
      }
    } 
    else if (n == 2) 
    {
      n = 7500;
      if (m == 1)
      {
        m = 50;
      } else if (m == 2) 
      {
        m = 800;
      } else
      {
        m = 20;
      }
    } else
    {
      n = 12500;
      if (m == 1)
      {
        m = 50;
      } else if (m == 2) 
      {
        m = 800;
      } else 
      {
        m = 20;
      }
    }
    System.out.println("The total approximate budget will be around: " + (n + m));
  }
}

// multilevel inheritance
abstract class mumbai // abstraction of parent class mumbai
{
  abstract void show(); // abstract method
}

class beach extends mumbai // beach is the child class
{
  void show() // calling abstract method
  {
    System.out.println("\t\t\t\t\tSEAS THE DAY!");
  }

  void show1() {
    System.out.println("\nHere are the beach options you have got");
  }
}

final class juhu extends beach // juhu is the child of beach
{
  void show1() {
    super.show1();
    System.out.println("\n\t\t\t\t\tJuhu Beach");
    System.out.println(
        "\nThe Juhu Beach in Mumbai is one of the most famous Indian beaches.\t This beach is known to be the one of the most-visited beaches of India and is situated in 'Ville Parle'.\t It is located approximately 18 km from the city centre and is a desired location for most film shootings.\n\t Juhu Beach borders a posh locality where most celebrities stay and therefore, it is quite common to find famous celebrities jogging along the sands of this popular beach of Mumbai.\t Tourists visit this beach because of its peaceful atmosphere and its scenic beauty. \tJuhu Beach is also famous for its local delicacies and street food. The food stalls set up here offer excellent cuisines and snack items.\t People in Mumbai visit this beach to relax and enjoy after a long, tedious day. There are extravagant hotels and apartments located at the southern end of the beach.\t Watching the sunset in this wonderful place, guarded by the vast Arabian Sea, is a dream-like vision for anyone who visits the beach.\n");
  }
}

final class gg extends beach // gg is child class of beach
{
  void show1() {
    System.out.println("\n\t\t\t\t\t Girgaon Chaupati");
    System.out.println(
        "\nGirgaon Chaupati , commonly known as just Chaupati (pronounced as chow-patty), is one of the most famous public beaches adjoining Marine Drive in the Girgaum area of Mumbai, India.\t \nThe beach is famous for Ganesh Chaturthi celebrations when hundreds of people from all over Mumbai come to immerse the idols of Lord Ganapati in the Arabian Sea. \tIt is also one of the many places in the city where the Ramlila is performed on a stage every year. An effigy of Ravan, that is erected on the sand, is burnt by the end of the 10-day performance.\t\n One can find severa bhelpuri, panipuri, ragda patties and pav bhaji vendors on the beach.Chowpatty is really Chau-pati  as per to that of Satpathy, a village in the Mahim Taluka of the Thane District, which is approached through a Channel or Creek, containing seven divisions of water.");
  }
}

class fort extends mumbai // fort is child class of mumbai
{
  void show() {
    System.out.println("\t\t\t\t\tUP THE HILL");
  }

  void show2() {
    System.out.println("\nHere are the fort options you have got");
  }
}

final class colaba extends fort // colaba is child class of fort
{
  void show2() {
    super.show2();
    System.out.println("\n\t\t\t\t\t Kolaba Fort");
    System.out.println(
        "\nThe first mention of Kolaba fort is when it was chosen by Shivaji to be fortified after the whole of South Konkan became free.\tThe work of constructing the fort started on 19 March 1680. In 1662, he strengthened and fortified Kolaba fort to make it one of his chief naval stations.\tThe command of the fort was given to Darya Sarang and Mainak Bhandari under whom Kolaba Fort became the centre of the Maratha attacks on British ships. Kolaba Fort was captured by Chatrapati Shivaji.\tKolaba Fort located at Alibag beach is an old fortified maritime base in Alibaug, Konkan, India.\t It is situated in the sea at a distance of 1–2 km from the shores of Alibag, 35 km south of Mumbai, in the Konkan region of Maharashtra, India.\t It is a popular tourist destination and a protected monument");
  }
}

final class worli extends fort // worli is child class of fort
{
  void show2() {
    System.out.println("\n\t\t\t\t\t Worli Fort");
    System.out.println(
        "\nSet at the very tip of Worli, past a dense and historic fishing village, is the iconic Worli Fort – a lesser known historic landmark in Mumbai. The centuries-old fort is very rarely frequented by tourists owing to its inconvenient location, and has accordingly been mostly neglected by the government as well. Yet the fort – which still stands tall and majestic – and its surrounding neighbourhood are gratifying sites to visit. The Worli Fort is considered to have been built by the British around the 17th century as a lookout for enemy ships and pirates. Alternate accounts suggest that it was built by the Portuguese during the 16th century. Regardless, overlooking the Mahim Bay at a time when Mumbai was just a group of islands, the fort was of great strategic importance to the British Navy guarding the western coast of the country.The fort has a built in well, a temple and plenty of space to soak in views of Mahim, Bandra. And the iconic Bandra-Worli Sea link outside the fort are platforms for cannons, a reminder of its military significance in the past.");
  }
}

class shop extends mumbai //shop is child class of mumbai
{
  void show() {
    System.out.println("\t\t\tALL SHOPOHOLICS..THE WAIT IS OVER!");
  }

  void show3() {
    System.out.println("\nHere are the Shopping options you have got");
  }
}

final class hillroad extends shop //hillroad is child class of shop
{
  void show3() {
    super.show3();
    System.out.println("\n\t\t\t\t\t Hill Road");
    System.out.println(
        "\nHill Road is a famous place for shopping and rejuvenation in Mumbai.\t It is basically an arterial road running through Mumbai that connects the intersection near Bandra Railway Station and S V Road.\t It is officially known as Ramdas Nayak Road but is called Hill Road because it goes over a hilly slope. This area of Bandra is famous for street shopping, eating and hanging out.\tIn Bandra, this is also one of the places where people can find general stores, hardware stores and also contractors for home services like plumbing, carpentry, painting etc.\t A couple of prominent hospitals, some century-old monuments and landmarks are also found around Hill Road.Hill Road is always bustling with vendors, customers, passers-by etc");
  }
}

final class crawfordmarket extends shop //crawfordmarket is the child of shop
{
  void show3() {
    System.out.println("\n\t\t\t\t\t Crawford Market");
    System.out.println(
        "\nThe everyday carnival of the Colaba Causeway market is a shopping experience like no other in Mumbai.\t Geared especially towards tourists, that infamous Indian saying of sab kuch milega(everything is possible) certainly applies at this market. Dodge persistent balloon and map sellers,\t as you meander along the sidewalk and peruse the stalls. Want your name written on a grain of rice? That's possible too.\t If you need a break from shopping, pop into Leopold's Cafe or Cafe Mondegar, two well known Mumbai hangouts.");
  }
}

class Main // calls the above method
{
  public static void main(String args[]) {
    int n1, n2;
    String ch;
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter choice: Beach, Shopping or Fort");
    ch = s1.nextLine();
    ch = ch.toUpperCase(); // converts everything to uppercase
    if (ch.equals("BEACH")) // beach
    {
      mumbai b = new beach(); //refernce parent obj child
      b.show();
      juhu j = new juhu();
      j.show1();
      gg g = new gg();
      g.show1();
    } else if (ch.equals("FORT")) // fort
    {
      mumbai f = new fort();
      f.show();
      colaba c = new colaba();
      c.show2();
      worli w = new worli();
      w.show2();
    } else if (ch.equals("SHOPPING")) // shop
    {
      mumbai s = new shop();
      s.show();
      hillroad p = new hillroad();
      p.show3();
    crawfordmarket v = new crawfordmarket();
      v.show3();
    } else {
      System.out.println("Invalid choice");
    }
    //Exception handling
    try {
    Scanner s2 = new Scanner(System.in);
    System.out.println("\nWe will give you an approximate budget depending on your choices");
    System.out.println("\n\nEnter a numerical answer here: \n1 for bus \n2 for cab \n3 for train");
    n1 = s2.nextInt();
    System.out.println("\nEnter your budget range :\n1 for 1.1k-5k \n2 for 5k-10k \n3 for 10k-15k");
    n2 = s2.nextInt();
    budget b = new budget(n1, n2);
    }
    catch(InputMismatchException e)
      {
        System.out.println("Input Mismatch Exception Occurs");
      }
    catch(Exception ex)
      {
        System.out.println("Exception occurs");
      }
  }
}

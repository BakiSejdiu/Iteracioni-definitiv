import javax.swing.JOptionPane;

   /** Application for mathematical definitions, computed with
     * definite-iteration loops.
     * @author Baki Sejdiu
     *
     */
public class Detyra_1 {
	 
   public int summation( int n)
   { int total = 0;
      int number = 0;
      while (number != n)
      { number = number+1;
         total = total + number;
      }
      return total;
   }
      /** product calculates iterated product ; a*(a+1)*(a+2)*...*b
      */
   
   public int product(int a, int b)
   { int totali = 1;
      if ( a <= b )
      { totali = a;
         int numeruesi = a;
         while ( numeruesi != b )
         
         { numeruesi = numeruesi + 1;
            totali = totali * numeruesi;
         }
      
      }
      return totali;
      
      /** factorial calculates iterated factorial ;  n! = 1 * 2 * ... * n, for positive n
       */
   }
   public long factorial(int n)
   { long fac = 1; 
      if( n > 0 && n <=20)
      { int numbers = 0; 
         while (numbers != n)
         { numbers = numbers + 1;
            fac = fac * numbers;}
                      
      }
      return fac;}
   
   /** sinus calculates the sine value of its argument, using the formula
   * sin(x) = x - (x^3/3!) + (x^5/5!) - (x^7/7!) + ... - (x^n/19!)
   */
	       
   public double sinus(double x)
   { double sin = x;
      int numberr = 3;
      while (numberr <=19)
      { double d = Math.pow(x, numberr) / factorial(numberr);
         if ((numberr % 4)==3)
         { sin = sin - d;} 
         else { sin = sin - d;}
         numberr = numberr + 2;
      }
      return sin; 
      
      /** cosinus calculates the cosine value of its parameter, using the formula
      * cos(x) = 1 - (x^2/2!) + (x^4/4!) - (x^6/6!) + ... - (x^20/20!)
      */
            
   }
	       
   public double cosinus(double y)
   { double cos = 1 ;
      int num = 2 ; 
      while (num <=20)
      { double c = Math.pow(y, num) / factorial(num);
         if ((num %4) == 2)
         { cos = cos - c;}
         { cos = cos + c;}
         num = num +2; 
      }
      return cos;
   }
	       
   public static void main(String[] args)
   { Detyra_1 d = new Detyra_1();
            
      String s = JOptionPane.showInputDialog("Shkruaj numrin");
      String v = JOptionPane.showInputDialog("Shkruaj numrin");    //  for iterated product 
      int i = new Integer(s).intValue();
      int j = new Integer(v).intValue();                          // for iterated product
      JOptionPane.showMessageDialog(null, "Shuma(" + s + ")"+ " eshte "+d.summation(i)) ;
      JOptionPane.showMessageDialog(null, "Prodhimi(" + s + ", " + v + ") eshte " + d.product(i, j));
      JOptionPane.showMessageDialog(null, s+" faktoriel eshte " + d.factorial(i));
      JOptionPane.showMessageDialog(null,  " Sinus "+ s + " eshte "+ d.sinus(i));
      JOptionPane.showMessageDialog(null,  " Kosinus " + s + " eshte " + d.cosinus(i) );
            
   }
	         
}



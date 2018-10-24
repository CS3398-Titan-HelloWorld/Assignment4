package src;


//import threesolid.IWorker;


public class ThreeSolidMain
{

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args)
   {

       Worker w = new Worker();
       TempWorker t = new TempWorker();
       ProductManager pd = new ProductManager();
       ProjectManager pj = new ProjectManager();
       SuperWorker s = new SuperWorker();
       RobotWorker r = new RobotWorker();

       System.out.println("Worker says:");


       w.work();
       w.eat();
       w.sick();

       System.out.println("TempWorker says:");

       t.work();
       t.eat();
       t.sick();

       System.out.println("Product Manager says:");


       pd.defineproduct();
       pd.setWorker(w);

       System.out.println("Project Manager says:");


       pj.schedulework();
       pj.setWorker(r);

       System.out.println("Super Worker says:");


       s.work();
       s.eat();
       s.sick();

       System.out.println("Robot Worker says:");


       r.work();
       r.reboot();

      try
      {
         System.out.format("Starting ... \n");
      }
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

            try
      {
         System.out.format("Stopping ... \n");
      }
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }

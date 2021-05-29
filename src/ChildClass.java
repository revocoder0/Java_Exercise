class ParentClass
{
   public void printData()
   {
      System.out.println("Parent class");
   }
}
class ChildClass extends ParentClass
{
    public void printData()
    {
         System.out.println("Child class");
         System.out.println("Overriding the method");
    }
   public static void main( String args[]) {
       ParentClass parentObject = new ChildClass();
       parentObject.printData();
   }
}

// Demonstrate that a derieved -class constructor cannot catch exceations thrown by its base -class constructor
class Base{
Base() Throws BaseException ()
  {  
    throw new BaseException();
   }
   class Derived extends Base{

   }
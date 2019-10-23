public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   private String name;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s, String names)
   {
       this.scores = s;
       this.name = names;
   }
   
   public double average(int first, int last)
   {
        double sum = 0.0;
        for(int i=first; i<= last; i++)
            sum += scores[i];
        sum /= (last-first)+1;
        return sum;
   }
   
   public String getName()
   {
       return name;
   }
   
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   public boolean hasImproved()
   {
      double value
      for(int i=0 ; i<=  ; i++)
        sum += scores[i]
        if value>
        
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      return 0; //here so the class compiles
   } 
}
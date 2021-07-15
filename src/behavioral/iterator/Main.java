
public class Main
{
    public static void main(String[] args)
    {
        CollectionofNames collectionofNames = new CollectionofNames();

        for(Iterator iter = collectionofNames.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
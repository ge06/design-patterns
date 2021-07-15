import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class CollectionofNames implements Container {

    public String name[] = {"Singleton","Factory","Prototype","Memento","Builder","Abstract Factory","Builder","Template Method"};


    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate();
    }

    private class CollectionofNamesIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}

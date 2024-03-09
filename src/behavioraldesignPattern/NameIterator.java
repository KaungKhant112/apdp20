package behavioraldesignPattern;

public class NameIterator implements Iterator{
    int index;//default 0
    NameRepository nameRepository=new NameRepository();
    @Override
    public boolean hasNext() {
        if(index<nameRepository.names.length)
        {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()){
            String name= nameRepository.names[index++];
            return name;
        }
       else return null;
    }
}

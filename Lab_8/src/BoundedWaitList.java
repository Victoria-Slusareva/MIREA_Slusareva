public class BoundedWaitList<E> extends WaitList<E>
{
    private int capacity;
    public BoundedWaitList(int capacity)
    {
        this.capacity = capacity;
    }
    public int getCapacity()
    {
        return capacity;
    }
    @Override
    public void add(E element)
    {
        if (content.size()<getCapacity()) {
            content.add(element);
        }
    }
    @Override
    public String toString()
    {
        return "Content: "+ content;
    }
}

class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        
        int arr[] = new int[n];
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for(int i=1;i<=m;i++)
        {
            ll.add(i);
        }
        
        int j = 0;
        
        for(Integer i:queries)
        {
            int q = i;
            
            int index = ll.indexOf(Integer.valueOf(q));
            
            arr[j++] = index;
            
            ll.remove(Integer.valueOf(q));
            
            ll.addFirst(q);
        }
        
        return arr;
    }
}

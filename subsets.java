public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>exp=new ArrayList<Integer>();
        res.add(exp);
        Collections.sort(A);
        find_subsets(res,exp,A,0);
        
        return res;
    }
    void find_subsets(ArrayList res,ArrayList exp,ArrayList A,int index)
    {
        for(int i=index;i<A.size();i++)
        {
            exp.add(A.get(i));
            res.add(new ArrayList<>(exp));
            find_subsets(res,exp,A,i+1);
            exp.remove(exp.size()-1);
        }
        return;
    }
}


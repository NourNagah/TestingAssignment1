public class MaxMinElements {
    public int Max(int[] x){
        int maxElement=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]>maxElement){
                maxElement=x[i];
            }
        }
        return maxElement;
    }
    public int Min(int[] x){
        int minElement=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]<minElement){
                minElement=x[i];
            }
        }
        return minElement;
    }
}

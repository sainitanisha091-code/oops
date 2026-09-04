class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here 
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }
            ArrayList<Integer> list = new ArrayList<>(); 
            list.add(min); 
            list.add(max);
            return list;
    }
}

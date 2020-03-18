public class MergeApp {


    public  int[] merge(int[] data1, int[] data2) {


        int[] merged = new int[data1.length + data2.length];
        
        int i = 0, j = 0, k = 0;

        while (i < data1.length && j < data2.length) {


            if (data1[i] < data2[j]){
                merged[k++] = data1[i++];
            }


            else{
                merged[k++] = data2[j++];
            }


        }

        while (i < data1.length) {
            merged[k++] = data1[i++];
        }
        while (j < data2.length) {
            merged[k++] = data2[j++];
        }



        return merged;
    }




}

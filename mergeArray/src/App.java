public class App {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 3, 6};
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
        // Print the result
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

    //since the array is soprted we can compare the last integers
    int i  = m -1;  
    int j = n -1 ; 
    int k = m + n -1;

    //since i and j tells you the quantity and (as  index location value) then as long as i or j are grater than 0, we have a comparison to make 
    while ( i >= 0 && j >= 0 ){
        if (nums1[i] >= nums2[j] ){
            nums1[k] = nums1[i];
            i--;
        }else{
           nums1[k] = nums2[j];
           j--;
        }
        k--;
    }
    //this code may never hit
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }
   




    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;
        int left = -1;
        int right = -1;
        if(total%2 == 0){
            right = total/2;
            left = total/2 - 1;
        }else{
            right = total/2;
        }
        int i=0; 
        int j=0;
        int counter = -1;
        int median = 0;
        while(i<n1 && j<n2){
            int temp = 0;
            if(nums1[i] < nums2[j]){
                temp = nums1[i];
                i++;
            }else{
                temp = nums2[j];
                j++;
            }
            counter++;
            if(counter == left || counter == right){
                median = median + temp;
            }

            if(counter >= right){
                break;
            }
        }

        while(i < n1){
            counter++;
            if(counter == left || counter == right){
                median = median + nums1[i];
            }
            i++;
        }

        while(j < n2){
            counter++;
            if(counter == left || counter == right){
                median = median + nums2[j];
            }
            j++;
        }

        if(left == -1)
            return median;
        return median/2.0;
    }
}
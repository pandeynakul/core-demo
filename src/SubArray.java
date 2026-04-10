
//find the subArray that sums up to k
//input: 1 2 3
//k=3
//logic 1 2 output 3
//basically checking the array concept
public class SubArray {
    public static void main(String[] args) {
        int arr[]={1,1,1};

        int result=0;
        int k=2;//target

        //the value will be equal to sum
        //k=sum
        //compate the elemnt and check the sum
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length ;j++){
                sum=sum+arr[j];
                if(sum==k){
                    result++;
                }
            }

        }
        System.out.println("subset :: "+result);
    }
}

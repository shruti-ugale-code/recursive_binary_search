public class binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,4,0,arr.length-1));
    }
    public static int search(int arr[],int target,int start,int end){
        if(start>end){
            return -1;

        }
        int mid=start+(end-start)/2;

        if(arr[target]==mid){
            return target;
        }
        if(arr[target]>mid){
            return search(arr,target,start,mid-1);
        }else{
            return search(arr,target,mid+1,end);
        }
    }
}

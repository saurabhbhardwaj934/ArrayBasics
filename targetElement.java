public class targetElement {
    public static void main(String[] args) {

        int[] arr = {4,5,3,5,2,7,8};
        int target = 7;

        boolean ans = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {
                ans = true;
                break;
            }
        }

        if(ans) {
            System.out.println("Yes");
        } else {
            System.out.println("-1");
        }
    }
} 
    

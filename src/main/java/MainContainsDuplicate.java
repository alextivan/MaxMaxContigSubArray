public class MainContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 12, 1};
        ContainsDuplicate Contains = new ContainsDuplicate();

        boolean b = Contains.containsDuplicate(nums);
        System.out.println(b);
    }

}

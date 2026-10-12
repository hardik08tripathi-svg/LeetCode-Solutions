// class Solution {
//     public int reverse(int x) {
//         return reverseHelper(x, 0);
//     }

//     public int reverseHelper(int x, int r) {
//         if (x == 0) {
//             return r;
//         }

//         return reverseHelper(x / 10, r * 10 + x % 10);
//     }
// }

class Solution {
    public int reverse(int x) {
        long ans = reverseHelper(x, 0);

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }

    public long reverseHelper(int x, long r) {
        if (x == 0) {
            return r;
        }

        return reverseHelper(x / 10, r * 10 + x % 10);
    }
}
package LeetCode.Medium;

public class CompareVersions {
    /*Given two version numbers, version1 and version2, compare them.

Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.

Return the following:

If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.


Example 1:

Input: version1 = "1.01", version2 = "1.001"
Output: 0
Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

     */
    public static void main(String[] args) {

      //String version1 = "1.01",version2 = "1.001";
     // String version1 = "1.0", version2 = "1.0.0";
      //String version1 = "0.1", version2 = "1.1";
    //    String version1 = "1.02",version2 = "1.05";
   //     String version1 = "7.5.7.4",version2 = "7.5.3";
        String version1 = "1.0.1",version2 = "1.001";
        System.out.print(compareVersions(version1,version2));
    }

    private static int compareVersions(String version1, String version2) {
        String[] attVersion1 = version1.split("\\.");
        String[] attVersion2 = version2.split("\\.");

        int maxLength = Math.max(attVersion1.length,attVersion2.length);
        for(int i = 0; i<maxLength; i++){
            int attr1 = i < attVersion1.length ? Integer.parseInt(attVersion1[i]) : 0;
            int attr2 = i < attVersion2.length ? Integer.parseInt(attVersion2[i]) : 0;

            if(attr1 > attr2){
                return 1;
            }else if(attr1 < attr2){
                return -1;
            }
        }
        return 0;
    }
}

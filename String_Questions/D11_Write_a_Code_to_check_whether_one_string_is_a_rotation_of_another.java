/*
Algorithm: areRotations(str1, str2)

    1. Create a temp string and store concatenation of str1 to
       str1 in temp.
                          temp = str1.str1
    2. If str2 is a substring of temp then str1 and str2 are 
       rotations of each other.

    Example:                 
                     str1 = "ABACD"
                     str2 = "CDABA"

     temp = str1.str1 = "ABACDABACD"
     Since str2 is a substring of temp, str1 and str2 are 
     rotations of each other.
*/
package String_Questions;


public class D11_Write_a_Code_to_check_whether_one_string_is_a_rotation_of_another {
    static boolean areRotation(String str1,String str2)
    {
        return (str1.length()==str2.length())&&((str1+str1).indexOf(str2)!=-1);
    }
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="BCDA";
        
        if(areRotation(str1,str2))
        {
            System.out.println("String are rotation of each other");
        }
        else
            System.out.println("Strings are not a roations of each other");
    }
}

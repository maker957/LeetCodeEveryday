package LongestCommonPrefix_14_3_2;

public class Soultion {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs[0].equals(""))
        {
            return "";
        }

        String temp = strs[0];

        for (int i = 0; i < strs.length; i++)
        {
            if (strs[i].length() == 0)
            {
                return "";
            }
            else if (strs[i].length() < temp.length())
            {
                for (int j = 0; j < strs[i].length(); j++)
                {
                    if (temp.charAt(j) != strs[i].charAt(j))
                    {
                        temp = strs[i].substring(0, j);
                        break;
                    }
                    if (j == strs[i].length() - 1)
                    {
                        temp = strs[i];
                    }
                }
            }
            else {
                for (int j = 0; j < temp.length(); j++)
                {
                    if (temp.charAt(j) != strs[i].charAt(j))
                    {
                        temp = strs[i].substring(0, j);
                        break;
                    }
                }
            }
        }
        return temp;
    }
}

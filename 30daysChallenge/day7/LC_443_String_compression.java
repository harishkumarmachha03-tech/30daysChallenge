public class LC_443_String_compression {
    public static int compress(char[] chars) 
    {
        int index = 0;  
        int i = 0;      

        while (i < chars.length) 
        {
            char current = chars[i];
            int count = 0;

           
            while (i < chars.length && chars[i] == current) 
            {
                i++;
                count++;
            }

            chars[index++] = current;  

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) 
                {
                    chars[index++] = c;  
                }
            }
    }

        return index;
    }

    public static void main(String[] args) {
        char[] input = {'a','a','b','b','c','c','c'};
        int length = compress(input);

        
        for (int i = 0; i < length; i++) {
            System.out.print("comprssed:"+input[i] + " ");
        }
        System.out.println("\nLength: " + length);
    }
}

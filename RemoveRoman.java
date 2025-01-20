public class RemoveRoman {
        public int romanToInt(String s) {
            int total = 0;
            int prevValue = 0;
    
            for (int i = s.length() - 1; i >= 0; i--) {
                int currentValue = getValue(s.charAt(i));
    
                // If the current value is less than the previous value, subtract it
                if (currentValue < prevValue) {
                    total -= currentValue;
                } else { // Otherwise, add it
                    total += currentValue;
                }
    
                prevValue = currentValue; // Update the previous value
            }
    
            return total;
        }
    
        private int getValue(char roman) {
            switch (roman) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
    


        public static void main(String[] args) {
            RemoveRoman solution = new RemoveRoman();
    
            // Test cases
            String test1 = "III";
            String test2 = "IV";
            String test3 = "IX";
            String test4 = "LVIII";
            String test5 = "MCMXCIV";
    
            // Printing results
            System.out.println(test1 + " -> " + solution.romanToInt(test1)); // 3
            System.out.println(test2 + " -> " + solution.romanToInt(test2)); // 4
            System.out.println(test3 + " -> " + solution.romanToInt(test3)); // 9
            System.out.println(test4 + " -> " + solution.romanToInt(test4)); // 58
            System.out.println(test5 + " -> " + solution.romanToInt(test5)); // 1994
        }
    }

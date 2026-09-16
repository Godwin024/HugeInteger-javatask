package hugeInteger;

public class HugeInteger {
    private int[] digit = new int [40];
    private int size;

    public void parse(String input) {
        size = input.length();
        for(int count = 0; count < size; count++){
            digit[count] = input.charAt(count) - '0';
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int count = 0; count < size; count++){
            result.append(digit[count]);
        }
        return result.toString();
    }


    public boolean isZero() {
        for(int count = 0; count < size; count++){
            if(digit[count] != 0){
                return false;
            }
        }
        return true;
    }

    public boolean isEqualTo(HugeInteger other) {
        if(size != other.size){
            return false;
        }
        for(int count = 0; count < size; count++){
            if(digit[count] != other.digit[count]){
                return false;
            }
        }
        return true;
    }

    public HugeInteger add(HugeInteger secondChar) {
        return null;
    }
}

public class Calculator {

    
    int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    int add(int add) {
        
    }
    }
    int subtract(int num1, int num2) {
        int difference = num1 -= num2;
        return difference;
}

int divide(int num1, int num2) {
    int quotient = num1 / num2;
    return quotient;
}
int multiply(int num1, int num2) {
    int product = num1 * num2;
    return product;
}

int power(int num1, int num2) {
    int pow = num1;
    for(int i = 1; i < num2; i++){
        pow *= num1;
    }
    return pow;
}
}
package version1;

/**
 * despaction
 *
 * @Author: jerry
 * @DATE: 2019/7/8 19:34
 **/
public class AddOperation implements Operation {

    @Override
    public double operation(int num1, int num2) {
        return num1+num2;
    }
}

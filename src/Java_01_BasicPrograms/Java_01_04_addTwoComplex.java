package Java_01_BasicPrograms;

public class Java_01_04_addTwoComplex {

    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(4, 5);
        ComplexNumber n2 = new ComplexNumber(10, 5);

        System.out.print("First complex number: ");
        System.out.println(n1.showC());
        System.out.print("Second complex number: ");
        System.out.println(n2.showC());

        ComplexNumber res = ComplexNumber.addC(n1, n2);
        System.out.print("result: ");
        System.out.println(res.showC());
    }
}

class ComplexNumber{
    int real, image;
    ComplexNumber(int real, int image){
        this.real = real;
        this.image = image;
    }
    public String showC(){
        return this.real + "+i" + this.image;
    }
    public static ComplexNumber addC(ComplexNumber n1, ComplexNumber n2){
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.image = n2.image + n2.image;
        return res;
    }


}

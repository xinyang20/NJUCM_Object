
package step2;
public class ComplexNumber {
	double real = 0;
	double imagine = 0;
	static final double THRESHOLD = 1e-5d;

	public ComplexNumber(double real, double imagine) {
		this.real = real;
		this.imagine = imagine;
	}

	public ComplexNumber minus(ComplexNumber operand) {
		return new ComplexNumber(this.real - operand.real, this.imagine
				- operand.imagine);
	}
    /******** Begin ********/
	public boolean equals(Object input){
        if(input instanceof ComplexNumber){
            String out;
            ComplexNumber num = (ComplexNumber) input;
            if(Math.abs(this.real-num.real)<THRESHOLD){
                if(Math.abs(this.imagine-num.imagine)<THRESHOLD){
                    return true;
                }
            }
        }
        return false;
    }

    
    /********  End  ********/
	public static void main(String[] args) {
		ComplexNumber complex1 = new ComplexNumber(2.02d, 3.1d);
		ComplexNumber complex2 = new ComplexNumber(2d, 3d);
		ComplexNumber complex3 = complex2;
		ComplexNumber complex4 = new ComplexNumber(2d, 3d);
		ComplexNumber complex5 = new ComplexNumber(0.02d, 0.1d);
		ComplexNumber complex6 = complex1.minus(complex2);

		System.out.println(complex2 == complex3);
		System.out.println(complex2.equals(complex3));
		System.out.println(complex2.equals(complex4));
		System.out.println(complex6.equals(complex5));
		System.out.println(complex1.equals(null));
		System.out.println(complex1.equals(new String("abc")));
	}
}


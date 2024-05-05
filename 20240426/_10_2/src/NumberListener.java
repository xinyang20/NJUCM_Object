import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NumberListener implements ActionListener {
    WindowNumber view;
    public NumberListener(WindowNumber view){
        this.view=view;
    }
    public void actionPerformed(ActionEvent e) {
        try {
            if(!view.input1.getText().matches("-?\\d+(\\.\\d+)?")||!view.input2.getText().matches("-?\\d+(\\.\\d+)?"))
                throw new NumberFormatException();
            double number1 = Double.parseDouble(view.input1.getText());
            double number2 = Double.parseDouble(view.input2.getText());
            double result = calculateResult(number1, number2, e.getActionCommand());
            view.output.setText("结果为：" + result);
        }catch (NumberFormatException ee){
            view.output.setText(ee.getMessage());
        }
    }

    protected double calculateResult(double number1, double number2, String action) {
        switch (action) {
            case "加":
                return number1 + number2;
            case "减":
                return number1 - number2;
            case "积":
                return number1 * number2;
            case "除":
                try {
                    return number1 / number2;
                } catch (ArithmeticException ae) {
                    view.output.setText("除数不能为0");
                    return 0;
                }
            default:
                return 0;
        }
    }
}
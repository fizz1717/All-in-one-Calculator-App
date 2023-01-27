/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc;
public class BmiCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMICalcView view = new BMICalcView();
		BMICalcModel model = new BMICalcModel();
		BMICalcController controller = new BMICalcController(model, view);

		view.registerOberver(controller);
	}

}
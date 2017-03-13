package smartmetropolis.smartPlace.controlAir;

import smartmetropolis.smartPlace.Exceptions.InvalidValueException;

import com.raspoid.PWMPin;
import com.raspoid.additionalcomponents.ir.IRSignal;
import com.raspoid.additionalcomponents.ir.IRTransmitter;

public class AirConditionerController implements AirConditionerInterface {

	private static final IRTransmitter transmitter =new IRTransmitter(PWMPin.PWM0);

	@Override
	public void turn_On(Integer targetValue) throws InvalidValueException {

		int[] irSignal = TurnOnSignal.getInstance().getIrSignalValue(targetValue);

		
		if (irSignal == null) {
			
			throw new InvalidValueException();
		}

		IRSignal signal = new IRSignal(irSignal);

		transmitter.transmitSignal(signal);
	}

	@Override
	public void turn_Off() {

		IRSignal turn_off = new IRSignal("desligar", new int[] { 0, 7980, 4020,
				520, 1600, 520, 560, 500, 540, 540, 540, 500, 1600, 540, 540,
				500, 560, 520, 540, 520, 1600, 520, 1600, 520, 560, 500, 540,
				540, 520, 520, 560, 520, 520, 540, 540, 520, 540, 500, 540,
				540, 520, 520, 560, 500, 540, 540, 1600, 500, 540, 540, 1600,
				500, 540, 540, 520, 520, 560, 520, 1600, 520 });

		transmitter.transmitSignal(turn_off);

	}

	@Override
	public void increase_Temperature(Integer targetValue)
			throws InvalidValueException {
		
		int[] irSignal = IncreaseTempSignals.getInstance().getIrSignalValue(targetValue);

		if (irSignal == null) {
			throw new InvalidValueException();
		}

		IRSignal signal = new IRSignal(irSignal);

		transmitter.transmitSignal(signal);

	}

	@Override
	public void decrease_Temperature(Integer targetValue)
			throws InvalidValueException {
		
		int[] irSignal = DecreaseTempSignal.getInstance().getIrSignalValue(targetValue);

		if (irSignal == null) {
			throw new InvalidValueException();
		}

		IRSignal signal = new IRSignal(irSignal);

		transmitter.transmitSignal(signal);

	}

}

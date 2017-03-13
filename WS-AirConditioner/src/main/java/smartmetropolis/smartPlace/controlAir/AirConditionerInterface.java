package smartmetropolis.smartPlace.controlAir;

import smartmetropolis.smartPlace.Exceptions.InvalidValueException;

public interface AirConditionerInterface {

	void turn_On(Integer targetValue) throws InvalidValueException;

	void turn_Off();

	void increase_Temperature(Integer targetValue)throws InvalidValueException;;

	void decrease_Temperature(Integer targetValue)throws InvalidValueException;;

}

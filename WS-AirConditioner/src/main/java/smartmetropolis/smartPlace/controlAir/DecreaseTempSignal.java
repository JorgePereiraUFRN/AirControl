package smartmetropolis.smartPlace.controlAir;

import java.util.HashMap;
import java.util.Map;

public class DecreaseTempSignal {
	
	private static  DecreaseTempSignal DECREASE_TEMP_SIGNAL = null;
	
	private static final int[] irSignal_29 = {0, 9100, 4260, 540, 1600, 500, 560, 500, 560, 500, 560, 500, 1620, 500, 560, 480, 580, 480, 580, 480, 580, 480, 560, 500, 560, 500, 560, 500, 1620, 480, 560, 500, 580, 480, 560, 500, 1620, 500, 1620, 500, 1620, 480, 580, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 1600, 500, 560, 500, 1620, 500, 560, 480};

	private static final int[] irSignal_28 = {0, 9120, 4240, 520, 1640, 480, 560, 500, 560, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 560, 500, 560, 480, 580, 480, 580, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 560, 500, 1620, 500, 1620, 480, 560, 480, 1640, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 1600, 480, 580, 480, 560, 500, 1620, 500};

	private static final int[] irSignal_27 = {0, 9120, 4240, 520, 1620, 500, 560, 480, 580, 480, 580, 480, 1640, 480, 560, 500, 560, 500, 560, 500, 560, 500, 560, 480, 580, 480, 580, 480, 1620, 500, 560, 480, 580, 480, 580, 480, 1620, 500, 1620, 500, 560, 500, 560, 480, 560, 500, 1620, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 580, 480, 560, 500};

	private static final int[] irSignal_26 = {0, 9100, 4220, 500, 1640, 480, 560, 500, 560, 500, 560, 500, 1620, 500, 560, 480, 580, 480, 580, 480, 560, 500, 560, 500, 580, 480, 560, 500, 1600, 500, 560, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 1620, 500, 1620, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 560, 480, 1620, 500, 1620, 500, 1620, 480};

	private static final int[] irSignal_25 = {0, 9100, 4240, 520, 1640, 480, 580, 480, 560, 500, 560, 500, 1620, 480, 580, 500, 560, 480, 580, 480, 580, 480, 560, 500, 560, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 560, 500, 1600, 500, 560, 500, 1620, 500, 560, 480, 580, 480, 1640, 480, 580, 480, 580, 480, 580, 480, 1620, 500, 1620, 500, 560, 500};

	private static final int[] irSignal_24 = {0, 9100, 4280, 520, 1620, 480, 580, 480, 560, 500, 560, 500, 1620, 500, 560, 500, 560, 480, 560, 500, 560, 500, 560, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 580, 460, 580, 480, 1640, 480, 560, 500, 560, 500, 1620, 500, 560, 500, 1600, 500, 560, 500, 560, 500, 560, 480, 1640, 480, 580, 480, 1620, 500};

	private static final int[] irSignal_23 = {0, 9100, 4240, 520, 1620, 500, 560, 500, 560, 500, 560, 500, 1620, 500, 560, 500, 560, 480, 580, 480, 580, 480, 580, 480, 560, 500, 560, 500, 1620, 500, 540, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 580, 480, 580, 500, 560, 480, 1620, 480, 580, 480, 560, 500, 560, 500, 1620, 500, 560, 500, 560, 480};

	private static final int[] irSignal_22 = {0, 9120, 4260, 500, 1620, 500, 560, 480, 580, 480, 580, 480, 1640, 480, 560, 500, 560, 500, 560, 500, 560, 500, 560, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 580, 480, 560, 500, 560, 500, 1620, 500, 1620, 480, 1640, 500, 560, 480, 1620, 480, 580, 480, 580, 480, 580, 480, 580, 480, 1620, 500, 1620, 500};

	private static final int[] irSignal_21 = {0, 9140, 4240, 520, 1620, 500, 560, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 560, 500, 560, 500, 560, 480, 560, 500, 560, 500, 560, 500, 1620, 500, 560, 500, 560, 500, 560, 480, 560, 500, 1620, 480, 1640, 480, 580, 480, 560, 500, 1620, 500, 560, 500, 560, 500, 560, 500, 560, 500, 1620, 500, 560, 480};

	private static final int[] irSignal_20 = {0, 9060, 4260, 520, 1620, 480, 580, 480, 580, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 560, 500, 540, 500, 560, 500, 560, 500, 560, 500, 1620, 500, 560, 480, 580, 480, 580, 480, 560, 480, 1620, 500, 560, 500, 1620, 500, 560, 500, 1620, 500, 560, 480, 580, 480, 580, 480, 580, 480, 560, 500, 1620, 500};

	private static final int[] irSignal_19 = {0, 9140, 4240, 520, 1620, 500, 560, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 580, 480, 580, 480, 560, 500, 560, 500, 560, 500, 560, 500, 1600, 500, 560, 500, 560, 500, 560, 500, 560, 500, 1620, 480, 580, 480, 560, 480, 580, 480, 1640, 480, 560, 500, 560, 500, 560, 500, 560, 500, 560, 500, 560, 500};

	private static final int[] irSignal_18 = {0, 8840, 4180, 520, 1580, 480, 520, 440, 560, 500, 560, 500, 1580, 500, 520, 480, 580, 480, 560, 460, 580, 480, 560, 440, 580, 480, 560, 460, 1620, 500, 520, 480, 580, 480, 540, 480, 560, 500, 560, 460, 1620, 460, 1620, 480, 520, 500, 1580, 480, 580, 500, 500, 480, 1620, 440, 1620, 460, 1620, 500, 1580, 480};

	private static final int[] irSignal_17 = {0, 9120, 4260, 500, 1640, 480, 580, 480, 580, 480, 580, 480, 1620, 500, 560, 500, 560, 500, 560, 480, 580, 500, 560, 480, 560, 500, 560, 500, 1620, 500, 560, 500, 560, 480, 580, 480, 580, 480, 580, 480, 1620, 500, 1620, 500, 560, 500, 1620, 500, 560, 480, 580, 480, 1620, 500, 1620, 480, 1640, 480, 1620, 500};

	
	private static  Map<Integer, int[]> signals = new HashMap<Integer, int[]>();

	
	private DecreaseTempSignal(){
		
		signals.put(17, irSignal_17);
		signals.put(18, irSignal_18);
		signals.put(19, irSignal_19);
		signals.put(20, irSignal_20);
		signals.put(21, irSignal_21);
		signals.put(22, irSignal_22);
		signals.put(23, irSignal_23);
		signals.put(24, irSignal_24);
		signals.put(25, irSignal_25);
		signals.put(26, irSignal_26);
		signals.put(27, irSignal_27);
		signals.put(28, irSignal_28);
		signals.put(29, irSignal_29);
		
	}
	
	public static synchronized DecreaseTempSignal getInstance(){
		
		if(DECREASE_TEMP_SIGNAL == null){
			DECREASE_TEMP_SIGNAL = new DecreaseTempSignal();
		}
		
		return DECREASE_TEMP_SIGNAL;
	}
	
	
	public int[] getIrSignalValue(Integer temperature){
		
		return signals.get(temperature);
	}
	
}

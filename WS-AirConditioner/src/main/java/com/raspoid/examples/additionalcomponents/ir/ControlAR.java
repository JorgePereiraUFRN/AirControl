package com.raspoid.examples.additionalcomponents.ir;

import java.util.Scanner;

import com.raspoid.PWMPin;
import com.raspoid.additionalcomponents.ir.IRSignal;
import com.raspoid.additionalcomponents.ir.IRTransmitter;

public class ControlAR {

	private static IRTransmitter transmitter = new IRTransmitter(PWMPin.PWM0);

	private static IRSignal diminuirTemp = new IRSignal("diminuir temp",
			new int[] { 0, 7880, 4040, 520, 1600, 500, 540, 540, 520, 520, 560,
					520, 1580, 520, 540, 520, 520, 540, 520, 520, 560, 500,
					540, 540, 540, 500, 560, 520, 1600, 500, 560, 520, 520,
					540, 520, 520, 560, 500, 540, 540, 1600, 500, 1600, 520,
					560, 500, 540, 520, 540, 500, 560, 520, 1600, 520, 540,
					520, 1600, 520, 1600, 520 });

	private static IRSignal aumentarTemp = new IRSignal("aumnetar temp",
			new int[] { 0, 7980, 4040, 500, 1600, 520, 560, 500, 540, 540, 540,
					500, 1600, 540, 540, 500, 560, 500, 540, 540, 540, 500,
					560, 500, 540, 540, 520, 520, 1600, 540, 540, 500, 540,
					520, 520, 560, 520, 520, 1600, 540, 520, 520, 560, 520,
					520, 540, 540, 500, 560, 520, 520, 540, 1600, 520, 1600,
					520, 540, 520, 540, 540 });

	private static IRSignal Desligar = new IRSignal("desligar", new int[] { 0,
			7980, 4020, 520, 1600, 520, 560, 500, 540, 540, 540, 500, 1600,
			540, 540, 500, 560, 520, 540, 520, 1600, 520, 1600, 520, 560, 500,
			540, 540, 520, 520, 560, 520, 520, 540, 540, 520, 540, 500, 540,
			540, 520, 520, 560, 500, 540, 540, 1600, 500, 540, 540, 1600, 500,
			540, 540, 520, 520, 560, 520, 1600, 520 });

	private static IRSignal ligar = new IRSignal("ligar", new int[] { 0, 8000,
			4040, 540, 1600, 520, 520, 540, 540, 500, 580, 500, 1600, 500, 560,
			520, 520, 540, 540, 500, 560, 500, 540, 540, 520, 500, 560, 520,
			540, 520, 540, 520, 540, 520, 540, 540, 520, 520, 540, 520, 1600,
			500, 1600, 540, 540, 520, 560, 500, 540, 540, 540, 480, 560, 520,
			520, 540, 1600, 520, 1600, 520 });

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out
					.println("0 - desligar --- 1 - aumentar temperatura --- 2 - diminuir temperatura --- 3 - ligar");
			int op = s.nextInt();

			switch (op) {
			case 0:
				transmitter.transmitSignal(Desligar);
				break;
			case 1:
				transmitter.transmitSignal(aumentarTemp);
				break;
			case 2:
				transmitter.transmitSignal(diminuirTemp);
				break;
			case 3:
				transmitter.transmitSignal(ligar);
				break;
			default:
				System.out.println("opcção invalida");
				break;
			}

		}

	}

}

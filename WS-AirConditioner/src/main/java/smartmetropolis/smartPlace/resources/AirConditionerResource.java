package smartmetropolis.smartPlace.resources;

import javax.smartcardio.ATR;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import smartmetropolis.smartPlace.Exceptions.InvalidValueException;
import smartmetropolis.smartPlace.controlAir.AirConditionerController;
import smartmetropolis.smartPlace.controlAir.AirConditionerInterface;

@Path("air-conditioner")
public class AirConditionerResource {

	private static final AirConditionerInterface AIR_CONDITIONER = new AirConditionerController();

	@PUT
	@Path("turn-on/{target-temperature}")
	public Response turn_On(
			@PathParam("target-temperature") int targetTemperature) {
		
		try {
			AIR_CONDITIONER.turn_On(targetTemperature);
		} catch (InvalidValueException e) {
			return Response.status(Status.BAD_REQUEST)
					.entity("invalid target temperature value").build();

		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage()).build();
		}

		return Response.ok("ok").build();
	}

	@PUT
	@Path("turn-off")
	public Response turn_Off() {
		try {
			AIR_CONDITIONER.turn_Off();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage()).build();
		}

		return Response.ok("ok").build();
	}

	@PUT
	@Path("increase-temp/{target-temperature}")
	public Response increase_Temperature(
			@PathParam("target-temperature") int targetTemperature) {
		try {
			AIR_CONDITIONER.increase_Temperature(targetTemperature);
		} catch (InvalidValueException e) {
			return Response.status(Status.BAD_REQUEST)
					.entity("invalid target temperature value").build();

		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage()).build();
		}

		return Response.ok("ok").build();
	}

	@PUT
	@Path("decrease-temp/{target-temperature}")
	public Response decrease_Temperature(
			@PathParam("target-temperature") int targetTemperature) {
		try {
			AIR_CONDITIONER.decrease_Temperature(targetTemperature);

		} catch (InvalidValueException e) {
			return Response.status(Status.BAD_REQUEST)
					.entity("invalid target temperature value").build();

		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage()).build();
		}

		return Response.ok("ok").build();
	}

}

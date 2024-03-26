package com.example.Progetto3Prova;

import com.example.Progetto3Prova.Users.UsersController;
import com.example.Progetto3Prova.Vehicles.EntitiesOfVehicles.Cars;
import com.example.Progetto3Prova.Vehicles.EntitiesOfVehicles.Status;
import com.example.Progetto3Prova.Vehicles.EntitiesOfVehicles.Vehicles;
import com.example.Progetto3Prova.Orders.OrdersController;
import com.example.Progetto3Prova.Purchase.PurchaseController;
import com.example.Progetto3Prova.Rents.RentController;
import com.example.Progetto3Prova.Users.UsersRepository;
import com.example.Progetto3Prova.Vehicles.VehiclesRepository;
import com.example.Progetto3Prova.Vehicles.VehiclesController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static com.example.Progetto3Prova.Vehicles.EntitiesOfVehicles.Status.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class VehiclesControllerTest {

	@Autowired
	private PurchaseController purchaseController;
	@Autowired
	private OrdersController ordersController;
	@Autowired
	private RentController rentController;
	@Autowired
	private UsersController usersController;
	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private VehiclesController vehiclesController;
	@Mock
	private VehiclesRepository vehiclesRepository;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testCreateUser() throws Exception {
		Vehicles car = new Cars(1L, "Audi", "Q7", 2967, "Red", "171 kW", "Mechanical",
				LocalDate.parse("2001-01-03"), "Diesel", 59700.00, 55900.00, "No", "Used", DISPONIBILE);
		mockMvc.perform(post("/vehicles/create")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(car)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").exists())
				.andExpect(jsonPath("$.brand").value("Audi"))
				.andExpect(jsonPath("$.model").value("Q7"))
				.andExpect(jsonPath("$.displacement").value(2967))
				.andExpect(jsonPath("$.color").value("Red"))
				.andExpect(jsonPath("$.power").value("171 kW"))
				.andExpect(jsonPath("$.transmissionType").value("Mechanical"))
				.andExpect(jsonPath("$.LocalDate").value(LocalDate.parse("2001-01-03")))
				.andExpect(jsonPath("$.fuelType").value("Diesel"))
				.andExpect(jsonPath("$.price").value(59700.00))
				.andExpect(jsonPath("$.discountPrice").value(55900.00))
				.andExpect(jsonPath("$.accessories").value("No"))
				.andExpect(jsonPath("$.condition").value("Used"))
				.andExpect(jsonPath("$.Status").value(Status.valueOf("Disponibile")));
	}
}
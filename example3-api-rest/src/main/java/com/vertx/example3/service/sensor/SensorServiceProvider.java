package com.vertx.example3.service.sensor;

import com.vertx.example3.service.sensor.impl.SensorServiceImpl;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/**
 * Provider para realizar el singleton de la implementación de los sensores
 * 
 * @author manuel
 *
 */
public final class SensorServiceProvider {

	//C A M P O S   D E   C L A S E
	private SensorService sensorService;

	/* Singleton */
	private static SensorServiceProvider instance = new SensorServiceProvider();
	
	
	//C O N S T R U C T O R
	private SensorServiceProvider() {
	}
	
	
	// P R O P I E D A D E S   D E   C L A S E
	public SensorService getSensorService() {
		return sensorService;
	}

	private void setSensorService(SensorService SensorService) {
		this.sensorService = SensorService;
	}
	
	

	// M E T O D O S   D E   C L A S E   
	public synchronized SensorService init(Vertx vertx, JsonObject config) {
		setSensorService(new SensorServiceImpl(vertx, config));
		return getSensorService();
	}

	public static SensorServiceProvider getInstance() {
		return instance;
	}

}

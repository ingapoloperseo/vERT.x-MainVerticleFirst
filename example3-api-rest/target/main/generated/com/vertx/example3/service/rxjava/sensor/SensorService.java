/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.vertx.example3.service.rxjava.sensor;

import java.util.Map;
import rx.Observable;
import rx.Single;
import com.vertx.example3.service.sensor.dto.SensorDTO;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * Definición de la comunicación con el BUS de Vert.x en cuanto a las operaciones que podremos realizar con nuestro sensor
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link com.vertx.example3.service.sensor.SensorService original} non RX-ified interface using Vert.x codegen.
 */

@io.vertx.lang.rxjava.RxGen(com.vertx.example3.service.sensor.SensorService.class)
public class SensorService {

  public static final io.vertx.lang.rxjava.TypeArg<SensorService> __TYPE_ARG = new io.vertx.lang.rxjava.TypeArg<>(
    obj -> new SensorService((com.vertx.example3.service.sensor.SensorService) obj),
    SensorService::getDelegate
  );

  private final com.vertx.example3.service.sensor.SensorService delegate;
  
  public SensorService(com.vertx.example3.service.sensor.SensorService delegate) {
    this.delegate = delegate;
  }

  public com.vertx.example3.service.sensor.SensorService getDelegate() {
    return delegate;
  }

  public void saveSensor(SensorDTO dto, Handler<AsyncResult<SensorDTO>> resultHandler) { 
    delegate.saveSensor(dto, resultHandler);
  }

  public Single<SensorDTO> rxSaveSensor(SensorDTO dto) { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      saveSensor(dto, fut);
    }));
  }

  public void getSensor(String id, Handler<AsyncResult<SensorDTO>> resultHandler) { 
    delegate.getSensor(id, resultHandler);
  }

  public Single<SensorDTO> rxGetSensor(String id) { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      getSensor(id, fut);
    }));
  }

  public void removeSensor(String id, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.removeSensor(id, resultHandler);
  }

  public Single<Void> rxRemoveSensor(String id) { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      removeSensor(id, fut);
    }));
  }


  public static SensorService newInstance(com.vertx.example3.service.sensor.SensorService arg) {
    return arg != null ? new SensorService(arg) : null;
  }
}

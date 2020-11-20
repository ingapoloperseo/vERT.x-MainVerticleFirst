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

/** @module example3-api-rest-js/sensor_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JSensorService = Java.type('com.vertx.example3.service.sensor.SensorService');
var SensorDTO = Java.type('com.vertx.example3.service.sensor.dto.SensorDTO');

/**
 Definición de la comunicación con el BUS de Vert.x en cuanto a las operaciones que podremos realizar con nuestro sensor
 
 @class
*/
var SensorService = function(j_val) {

  var j_sensorService = j_val;
  var that = this;

  /**

   @public
   @param dto {Object} 
   @param resultHandler {function} 
   */
  this.saveSensor = function(dto, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_sensorService["saveSensor(com.vertx.example3.service.sensor.dto.SensorDTO,io.vertx.core.Handler)"](dto != null ? new SensorDTO(new JsonObject(Java.asJSONCompatible(dto))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param id {string} 
   @param resultHandler {function} 
   */
  this.getSensor = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sensorService["getSensor(java.lang.String,io.vertx.core.Handler)"](id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param id {string} 
   @param resultHandler {function} 
   */
  this.removeSensor = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sensorService["removeSensor(java.lang.String,io.vertx.core.Handler)"](id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_sensorService;
};

SensorService._jclass = utils.getJavaClass("com.vertx.example3.service.sensor.SensorService");
SensorService._jtype = {
  accept: function(obj) {
    return SensorService._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SensorService.prototype, {});
    SensorService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SensorService._create = function(jdel) {
  var obj = Object.create(SensorService.prototype, {});
  SensorService.apply(obj, arguments);
  return obj;
}
module.exports = SensorService;
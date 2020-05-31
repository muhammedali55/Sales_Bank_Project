package com.muhammet.sales.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * Json to String converter String to Json converter Object Mapper Common Class
 */
@Slf4j
public class JsonUtils {

  public static String convertToJson(Object jsonObject) {
    String json;
    if (jsonObject == null) {
      json = "Null Object";
    } else {
      ObjectMapper mapper = new ObjectMapper();
      try {
        json = mapper.writeValueAsString(jsonObject);
      } catch (Exception e) {
        json = "Object could not be converted to Json Format";
        log.error(e.getMessage());
      }
    }
    return json;
  }
}

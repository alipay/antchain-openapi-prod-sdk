// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class WeatherActualVariable extends TeaModel {
    // 实测数据时间点，格式 yyyy-MM-dd HH:mm:ss，对应 Java Date variableDate。
    /**
     * <strong>example:</strong>
     * <p>2026-10-01 09:00:00</p>
     */
    @NameInMap("variable_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String variableDate;

    // 地面 2 米处空气温度，单位 °C；对应 Java temperature2m。
    /**
     * <strong>example:</strong>
     * <p>25.3</p>
     */
    @NameInMap("temperature_2m")
    public String temperature2m;

    // 地面 2 米处相对湿度，单位 %；对应 Java relativeHumidity2m。
    /**
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("relative_humidity_2m")
    public String relativeHumidity2m;

    // 地表气压，单位 hPa；对应 Java surfacePressure。
    /**
     * <strong>example:</strong>
     * <p>1008.6</p>
     */
    @NameInMap("surface_pressure")
    public String surfacePressure;

    // 降水量，单位 mm；对应 Java precipitation。
    /**
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("precipitation")
    public String precipitation;

    // 地面 10 米处风速，单位 m/s；对应 Java windSpeed10m。
    /**
     * <strong>example:</strong>
     * <p>3.2</p>
     */
    @NameInMap("wind_speed_10m")
    public String windSpeed10m;

    // 地面 10 米处风向，单位 °；对应 Java windDirection10m。
    /**
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("wind_direction_10m")
    public String windDirection10m;

    // 地面 10 米处 U 风速分量，单位 m/s，保留正负号；对应 Java uWind10m。
    /**
     * <strong>example:</strong>
     * <p>-2.1</p>
     */
    @NameInMap("u_wind_10m")
    public String uWind10m;

    // 地面 10 米处 V 风速分量，单位 m/s，保留正负号；对应 Java vWind10m。
    /**
     * <strong>example:</strong>
     * <p>1.8</p>
     */
    @NameInMap("v_wind_10m")
    public String vWind10m;

    // 总云量，单位 %；对应 Java cloudCover。
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("cloud_cover")
    public String cloudCover;

    // 短波辐照，单位 W/m²；对应 Java shortwaveRadiation。
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("shortwave_radiation")
    public String shortwaveRadiation;

    // 0～10cm 深度土壤水分含量，单位 m³/m³；对应 Java soilMoisture0To10，源 DTO JSON 字段 soil_moisture_0_10。
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("soil_moisture_0_to_10")
    public String soilMoisture0To10;

    // 10～40cm 深度土壤水分含量，单位 m³/m³；对应 Java soilMoisture10To40，源 DTO JSON 字段 soil_moisture_10_40。
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("soil_moisture_10_to_40")
    public String soilMoisture10To40;

    // 0～5cm 深度土壤水分含量，单位 m³/m³；对应 Java soilMoisture0To5，源 DTO JSON 字段 soil_moisture_0_5。
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("soil_moisture_0_to_5")
    public String soilMoisture0To5;

    // 40～100cm 深度土壤水分含量，单位 m³/m³；对应 Java soilMoisture40To100，源 DTO JSON 字段 soil_moisture_40_100。
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("soil_moisture_40_to_100")
    public String soilMoisture40To100;

    // 100～200cm 深度土壤水分含量，单位 m³/m³；对应 Java soilMoisture100To200，源 DTO JSON 字段 soil_moisture_100_200。
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("soil_moisture_100_to_200")
    public String soilMoisture100To200;

    // 5cm 深度土壤温度，单位 °C；对应 Java soilTemperature5。
    /**
     * <strong>example:</strong>
     * <p>18.5</p>
     */
    @NameInMap("soil_temperature_5")
    public String soilTemperature5;

    // 10cm 深度土壤温度，单位 °C；对应 Java soilTemperature10。
    /**
     * <strong>example:</strong>
     * <p>18.5</p>
     */
    @NameInMap("soil_temperature_10")
    public String soilTemperature10;

    // 40cm 深度土壤温度，单位 °C；对应 Java soilTemperature40。
    /**
     * <strong>example:</strong>
     * <p>18.5</p>
     */
    @NameInMap("soil_temperature_40")
    public String soilTemperature40;

    // 100cm 深度土壤温度，单位 °C；对应 Java soilTemperature100。
    /**
     * <strong>example:</strong>
     * <p>18.5</p>
     */
    @NameInMap("soil_temperature_100")
    public String soilTemperature100;

    // 200cm 深度土壤温度，单位 °C；对应 Java soilTemperature200。
    /**
     * <strong>example:</strong>
     * <p>18.5</p>
     */
    @NameInMap("soil_temperature_200")
    public String soilTemperature200;

    public static WeatherActualVariable build(java.util.Map<String, ?> map) throws Exception {
        WeatherActualVariable self = new WeatherActualVariable();
        return TeaModel.build(map, self);
    }

    public WeatherActualVariable setVariableDate(String variableDate) {
        this.variableDate = variableDate;
        return this;
    }
    public String getVariableDate() {
        return this.variableDate;
    }

    public WeatherActualVariable setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
        return this;
    }
    public String getTemperature2m() {
        return this.temperature2m;
    }

    public WeatherActualVariable setRelativeHumidity2m(String relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
        return this;
    }
    public String getRelativeHumidity2m() {
        return this.relativeHumidity2m;
    }

    public WeatherActualVariable setSurfacePressure(String surfacePressure) {
        this.surfacePressure = surfacePressure;
        return this;
    }
    public String getSurfacePressure() {
        return this.surfacePressure;
    }

    public WeatherActualVariable setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
        return this;
    }
    public String getPrecipitation() {
        return this.precipitation;
    }

    public WeatherActualVariable setWindSpeed10m(String windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
        return this;
    }
    public String getWindSpeed10m() {
        return this.windSpeed10m;
    }

    public WeatherActualVariable setWindDirection10m(String windDirection10m) {
        this.windDirection10m = windDirection10m;
        return this;
    }
    public String getWindDirection10m() {
        return this.windDirection10m;
    }

    public WeatherActualVariable setUWind10m(String uWind10m) {
        this.uWind10m = uWind10m;
        return this;
    }
    public String getUWind10m() {
        return this.uWind10m;
    }

    public WeatherActualVariable setVWind10m(String vWind10m) {
        this.vWind10m = vWind10m;
        return this;
    }
    public String getVWind10m() {
        return this.vWind10m;
    }

    public WeatherActualVariable setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
        return this;
    }
    public String getCloudCover() {
        return this.cloudCover;
    }

    public WeatherActualVariable setShortwaveRadiation(String shortwaveRadiation) {
        this.shortwaveRadiation = shortwaveRadiation;
        return this;
    }
    public String getShortwaveRadiation() {
        return this.shortwaveRadiation;
    }

    public WeatherActualVariable setSoilMoisture0To10(String soilMoisture0To10) {
        this.soilMoisture0To10 = soilMoisture0To10;
        return this;
    }
    public String getSoilMoisture0To10() {
        return this.soilMoisture0To10;
    }

    public WeatherActualVariable setSoilMoisture10To40(String soilMoisture10To40) {
        this.soilMoisture10To40 = soilMoisture10To40;
        return this;
    }
    public String getSoilMoisture10To40() {
        return this.soilMoisture10To40;
    }

    public WeatherActualVariable setSoilMoisture0To5(String soilMoisture0To5) {
        this.soilMoisture0To5 = soilMoisture0To5;
        return this;
    }
    public String getSoilMoisture0To5() {
        return this.soilMoisture0To5;
    }

    public WeatherActualVariable setSoilMoisture40To100(String soilMoisture40To100) {
        this.soilMoisture40To100 = soilMoisture40To100;
        return this;
    }
    public String getSoilMoisture40To100() {
        return this.soilMoisture40To100;
    }

    public WeatherActualVariable setSoilMoisture100To200(String soilMoisture100To200) {
        this.soilMoisture100To200 = soilMoisture100To200;
        return this;
    }
    public String getSoilMoisture100To200() {
        return this.soilMoisture100To200;
    }

    public WeatherActualVariable setSoilTemperature5(String soilTemperature5) {
        this.soilTemperature5 = soilTemperature5;
        return this;
    }
    public String getSoilTemperature5() {
        return this.soilTemperature5;
    }

    public WeatherActualVariable setSoilTemperature10(String soilTemperature10) {
        this.soilTemperature10 = soilTemperature10;
        return this;
    }
    public String getSoilTemperature10() {
        return this.soilTemperature10;
    }

    public WeatherActualVariable setSoilTemperature40(String soilTemperature40) {
        this.soilTemperature40 = soilTemperature40;
        return this;
    }
    public String getSoilTemperature40() {
        return this.soilTemperature40;
    }

    public WeatherActualVariable setSoilTemperature100(String soilTemperature100) {
        this.soilTemperature100 = soilTemperature100;
        return this;
    }
    public String getSoilTemperature100() {
        return this.soilTemperature100;
    }

    public WeatherActualVariable setSoilTemperature200(String soilTemperature200) {
        this.soilTemperature200 = soilTemperature200;
        return this;
    }
    public String getSoilTemperature200() {
        return this.soilTemperature200;
    }

}

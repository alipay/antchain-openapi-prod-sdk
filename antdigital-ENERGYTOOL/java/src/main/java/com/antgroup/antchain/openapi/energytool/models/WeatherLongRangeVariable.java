// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class WeatherLongRangeVariable extends TeaModel {
    // 预测数据时刻，格式 yyyy-MM-dd HH:mm:ss，对应 variableDate。
    /**
     * <strong>example:</strong>
     * <p>2026-10-07 00:00:00</p>
     */
    @NameInMap("variable_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String variableDate;

    // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss，对应 forecastBatchTime。
    /**
     * <strong>example:</strong>
     * <p>2026-09-21 08:00:00</p>
     */
    @NameInMap("forecast_batch_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String forecastBatchTime;

    // 2 米气温，单位 ℃；对应 temperature2m。
    /**
     * <strong>example:</strong>
     * <p>25.3</p>
     */
    @NameInMap("temperature_2m")
    public String temperature2m;

    // 2 米露点温度，单位 ℃；对应 dewPoint2m。
    /**
     * <strong>example:</strong>
     * <p>18.2</p>
     */
    @NameInMap("dew_point_2m")
    public String dewPoint2m;

    // 体感温度，单位 ℃；对应 apparentTemperature。
    /**
     * <strong>example:</strong>
     * <p>27.1</p>
     */
    @NameInMap("apparent_temperature")
    public String apparentTemperature;

    // 2 米相对湿度，单位 %；对应 relativeHumidity2m。
    /**
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("relative_humidity_2m")
    public String relativeHumidity2m;

    // 海平面气压，单位 hPa；对应 pressureMsl。
    /**
     * <strong>example:</strong>
     * <p>1013.2</p>
     */
    @NameInMap("pressure_msl")
    public String pressureMsl;

    // 地表气压，单位 hPa；对应 surfacePressure。
    /**
     * <strong>example:</strong>
     * <p>1008.6</p>
     */
    @NameInMap("surface_pressure")
    public String surfacePressure;

    // 平台天气编码，由源天气编码转换；对应 weatherCode。
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("weather_code")
    public String weatherCode;

    // 降水量，单位 mm；对应 precipitation。
    /**
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("precipitation")
    public String precipitation;

    // 云量，单位 %；对应 cloudCover。
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("cloud_cover")
    public String cloudCover;

    // 10 米风速，单位 m/s；对应 windSpeed10m。
    /**
     * <strong>example:</strong>
     * <p>3.2</p>
     */
    @NameInMap("wind_speed_10m")
    public String windSpeed10m;

    // 100 米风速，单位 m/s；对应 windSpeed100m。
    /**
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("wind_speed_100m")
    public String windSpeed100m;

    // 200 米风速，单位 m/s；对应 windSpeed200m。
    /**
     * <strong>example:</strong>
     * <p>7.0</p>
     */
    @NameInMap("wind_speed_200m")
    public String windSpeed200m;

    // 10 米风向，单位 °；对应 windDirection10m。
    /**
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("wind_direction_10m")
    public String windDirection10m;

    // 100 米风向，单位 °；对应 windDirection100m。
    /**
     * <strong>example:</strong>
     * <p>185</p>
     */
    @NameInMap("wind_direction_100m")
    public String windDirection100m;

    // 200 米风向，单位 °；对应 windDirection200m。
    /**
     * <strong>example:</strong>
     * <p>190</p>
     */
    @NameInMap("wind_direction_200m")
    public String windDirection200m;

    // 瞬时短波辐射，单位 W/m²；对应 shortwaveRadiationInstant。
    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("shortwave_radiation_instant")
    public String shortwaveRadiationInstant;

    // 瞬时直接辐射，单位 W/m²；对应 directRadiationInstant。
    /**
     * <strong>example:</strong>
     * <p>450</p>
     */
    @NameInMap("direct_radiation_instant")
    public String directRadiationInstant;

    // 瞬时散射辐射，单位 W/m²；对应 diffuseRadiationInstant。
    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("diffuse_radiation_instant")
    public String diffuseRadiationInstant;

    // 短波辐射，单位 W/m²；对应 shortwaveRadiation。
    /**
     * <strong>example:</strong>
     * <p>550</p>
     */
    @NameInMap("shortwave_radiation")
    public String shortwaveRadiation;

    // 直接辐射，单位 W/m²；对应 directRadiation。
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("direct_radiation")
    public String directRadiation;

    // 散射辐射，单位 W/m²；对应 diffuseRadiation。
    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("diffuse_radiation")
    public String diffuseRadiation;

    // 10 米阵风风速，单位 m/s；对应 windGusts10m。
    /**
     * <strong>example:</strong>
     * <p>6.2</p>
     */
    @NameInMap("wind_gusts_10m")
    public String windGusts10m;

    // 2 米最高气温，单位 ℃；对应 temperatureMax2m。
    /**
     * <strong>example:</strong>
     * <p>30.2</p>
     */
    @NameInMap("temperature_2m_max")
    public String temperature2mMax;

    // 2 米最低气温，单位 ℃；对应 temperatureMin2m。
    /**
     * <strong>example:</strong>
     * <p>19.1</p>
     */
    @NameInMap("temperature_2m_min")
    public String temperature2mMin;

    public static WeatherLongRangeVariable build(java.util.Map<String, ?> map) throws Exception {
        WeatherLongRangeVariable self = new WeatherLongRangeVariable();
        return TeaModel.build(map, self);
    }

    public WeatherLongRangeVariable setVariableDate(String variableDate) {
        this.variableDate = variableDate;
        return this;
    }
    public String getVariableDate() {
        return this.variableDate;
    }

    public WeatherLongRangeVariable setForecastBatchTime(String forecastBatchTime) {
        this.forecastBatchTime = forecastBatchTime;
        return this;
    }
    public String getForecastBatchTime() {
        return this.forecastBatchTime;
    }

    public WeatherLongRangeVariable setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
        return this;
    }
    public String getTemperature2m() {
        return this.temperature2m;
    }

    public WeatherLongRangeVariable setDewPoint2m(String dewPoint2m) {
        this.dewPoint2m = dewPoint2m;
        return this;
    }
    public String getDewPoint2m() {
        return this.dewPoint2m;
    }

    public WeatherLongRangeVariable setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
        return this;
    }
    public String getApparentTemperature() {
        return this.apparentTemperature;
    }

    public WeatherLongRangeVariable setRelativeHumidity2m(String relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
        return this;
    }
    public String getRelativeHumidity2m() {
        return this.relativeHumidity2m;
    }

    public WeatherLongRangeVariable setPressureMsl(String pressureMsl) {
        this.pressureMsl = pressureMsl;
        return this;
    }
    public String getPressureMsl() {
        return this.pressureMsl;
    }

    public WeatherLongRangeVariable setSurfacePressure(String surfacePressure) {
        this.surfacePressure = surfacePressure;
        return this;
    }
    public String getSurfacePressure() {
        return this.surfacePressure;
    }

    public WeatherLongRangeVariable setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
        return this;
    }
    public String getWeatherCode() {
        return this.weatherCode;
    }

    public WeatherLongRangeVariable setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
        return this;
    }
    public String getPrecipitation() {
        return this.precipitation;
    }

    public WeatherLongRangeVariable setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
        return this;
    }
    public String getCloudCover() {
        return this.cloudCover;
    }

    public WeatherLongRangeVariable setWindSpeed10m(String windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
        return this;
    }
    public String getWindSpeed10m() {
        return this.windSpeed10m;
    }

    public WeatherLongRangeVariable setWindSpeed100m(String windSpeed100m) {
        this.windSpeed100m = windSpeed100m;
        return this;
    }
    public String getWindSpeed100m() {
        return this.windSpeed100m;
    }

    public WeatherLongRangeVariable setWindSpeed200m(String windSpeed200m) {
        this.windSpeed200m = windSpeed200m;
        return this;
    }
    public String getWindSpeed200m() {
        return this.windSpeed200m;
    }

    public WeatherLongRangeVariable setWindDirection10m(String windDirection10m) {
        this.windDirection10m = windDirection10m;
        return this;
    }
    public String getWindDirection10m() {
        return this.windDirection10m;
    }

    public WeatherLongRangeVariable setWindDirection100m(String windDirection100m) {
        this.windDirection100m = windDirection100m;
        return this;
    }
    public String getWindDirection100m() {
        return this.windDirection100m;
    }

    public WeatherLongRangeVariable setWindDirection200m(String windDirection200m) {
        this.windDirection200m = windDirection200m;
        return this;
    }
    public String getWindDirection200m() {
        return this.windDirection200m;
    }

    public WeatherLongRangeVariable setShortwaveRadiationInstant(String shortwaveRadiationInstant) {
        this.shortwaveRadiationInstant = shortwaveRadiationInstant;
        return this;
    }
    public String getShortwaveRadiationInstant() {
        return this.shortwaveRadiationInstant;
    }

    public WeatherLongRangeVariable setDirectRadiationInstant(String directRadiationInstant) {
        this.directRadiationInstant = directRadiationInstant;
        return this;
    }
    public String getDirectRadiationInstant() {
        return this.directRadiationInstant;
    }

    public WeatherLongRangeVariable setDiffuseRadiationInstant(String diffuseRadiationInstant) {
        this.diffuseRadiationInstant = diffuseRadiationInstant;
        return this;
    }
    public String getDiffuseRadiationInstant() {
        return this.diffuseRadiationInstant;
    }

    public WeatherLongRangeVariable setShortwaveRadiation(String shortwaveRadiation) {
        this.shortwaveRadiation = shortwaveRadiation;
        return this;
    }
    public String getShortwaveRadiation() {
        return this.shortwaveRadiation;
    }

    public WeatherLongRangeVariable setDirectRadiation(String directRadiation) {
        this.directRadiation = directRadiation;
        return this;
    }
    public String getDirectRadiation() {
        return this.directRadiation;
    }

    public WeatherLongRangeVariable setDiffuseRadiation(String diffuseRadiation) {
        this.diffuseRadiation = diffuseRadiation;
        return this;
    }
    public String getDiffuseRadiation() {
        return this.diffuseRadiation;
    }

    public WeatherLongRangeVariable setWindGusts10m(String windGusts10m) {
        this.windGusts10m = windGusts10m;
        return this;
    }
    public String getWindGusts10m() {
        return this.windGusts10m;
    }

    public WeatherLongRangeVariable setTemperature2mMax(String temperature2mMax) {
        this.temperature2mMax = temperature2mMax;
        return this;
    }
    public String getTemperature2mMax() {
        return this.temperature2mMax;
    }

    public WeatherLongRangeVariable setTemperature2mMin(String temperature2mMin) {
        this.temperature2mMin = temperature2mMin;
        return this;
    }
    public String getTemperature2mMin() {
        return this.temperature2mMin;
    }

}

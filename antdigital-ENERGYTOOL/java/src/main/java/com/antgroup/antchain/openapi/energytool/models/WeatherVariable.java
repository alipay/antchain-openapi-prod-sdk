// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class WeatherVariable extends TeaModel {
    // 气象数据对应的时间点，Java 类型 Date。
    /**
     * <strong>example:</strong>
     * <p>2026-09-20 09:00:00</p>
     */
    @NameInMap("variable_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String variableDate;

    // 该条气象数据的预测批次时间，Java 类型 Date，可能为空。
    /**
     * <strong>example:</strong>
     * <p>2026-09-20 08:00:00</p>
     */
    @NameInMap("forecast_batch_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String forecastBatchTime;

    // 地面 2 米处空气温度，单位 °C。
    /**
     * <strong>example:</strong>
     * <p>25.3</p>
     */
    @NameInMap("temperature_2m")
    public String temperature2m;

    // 地面 2 米处相对空气湿度，单位 %。
    /**
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("relative_humidity_2m")
    public String relativeHumidity2m;

    // 地面 2 米处露点温度，单位 °C。
    /**
     * <strong>example:</strong>
     * <p>18.2</p>
     */
    @NameInMap("dew_point_2m")
    public String dewPoint2m;

    // 海平面大气压，单位 hPa。
    /**
     * <strong>example:</strong>
     * <p>1013.2</p>
     */
    @NameInMap("pressure_msl")
    public String pressureMsl;

    // 地表大气压，单位 hPa。
    /**
     * <strong>example:</strong>
     * <p>1008.6</p>
     */
    @NameInMap("surface_pressure")
    public String surfacePressure;

    // 未来一小时降水量大于 0.1mm 的概率，单位 %。
    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("precipitation_probability")
    public String precipitationProbability;

    // 总云量，单位 %。
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("cloud_cover")
    public String cloudCover;

    // 低云量，单位 %。
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("cloud_cover_low")
    public String cloudCoverLow;

    // 中云量，单位 %。
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("cloud_cover_mid")
    public String cloudCoverMid;

    // 高云量，单位 %。
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cloud_cover_high")
    public String cloudCoverHigh;

    // 短波辐照，未来一小时平均，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("shortwave_radiation")
    public String shortwaveRadiation;

    // 直接辐照，代码注释定义为未来一小时累计，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>350</p>
     */
    @NameInMap("direct_radiation")
    public String directRadiation;

    // 直接法向辐照，未来一小时平均，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>420</p>
     */
    @NameInMap("direct_normal_irradiance")
    public String directNormalIrradiance;

    // 散射辐照，未来一小时平均，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("diffuse_radiation")
    public String diffuseRadiation;

    // 地面 10 米处风速，单位 m/s。
    /**
     * <strong>example:</strong>
     * <p>3.2</p>
     */
    @NameInMap("wind_speed_10m")
    public String windSpeed10m;

    // 地面 80 米处风速，单位 m/s。
    /**
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("wind_speed_80m")
    public String windSpeed80m;

    // 地面 120 米处风速，单位 m/s。
    /**
     * <strong>example:</strong>
     * <p>6.1</p>
     */
    @NameInMap("wind_speed_120m")
    public String windSpeed120m;

    // 地面 10 米处风向，单位 °。
    /**
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("wind_direction_10m")
    public String windDirection10m;

    // 地面 80 米处风向，单位 °。
    /**
     * <strong>example:</strong>
     * <p>185</p>
     */
    @NameInMap("wind_direction_80m")
    public String windDirection80m;

    // 地面 120 米处风向，单位 °。
    /**
     * <strong>example:</strong>
     * <p>190</p>
     */
    @NameInMap("wind_direction_120m")
    public String windDirection120m;

    // 天气代码，采用 WMO 天气编码。
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("weather_code")
    public String weatherCode;

    // 体感温度，单位 °C。
    /**
     * <strong>example:</strong>
     * <p>27.1</p>
     */
    @NameInMap("apparent_temperature")
    public String apparentTemperature;

    // 降雨量，单位 mm。
    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("rain")
    public String rain;

    // 降水量，包含所有降水形式，单位 mm。
    /**
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("precipitation")
    public String precipitation;

    // 降雪量，单位 cm。
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("snowfall")
    public String snowfall;

    // 短波辐照瞬时值，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>510</p>
     */
    @NameInMap("shortwave_radiation_instant")
    public String shortwaveRadiationInstant;

    // 直接辐照瞬时值，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("direct_radiation_instant")
    public String directRadiationInstant;

    // 散射辐照瞬时值，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("diffuse_radiation_instant")
    public String diffuseRadiationInstant;

    // 直接法向辐照瞬时值，单位 W/m²。
    /**
     * <strong>example:</strong>
     * <p>430</p>
     */
    @NameInMap("direct_normal_irradiance_instant")
    public String directNormalIrradianceInstant;

    // 地面 180 米处风速，单位 m/s。
    /**
     * <strong>example:</strong>
     * <p>7.0</p>
     */
    @NameInMap("wind_speed_180m")
    public String windSpeed180m;

    // 地面 180 米处风向，单位 °。
    /**
     * <strong>example:</strong>
     * <p>195</p>
     */
    @NameInMap("wind_direction_180m")
    public String windDirection180m;

    // DTO 保留的短时降雨量字段，单位 mm。本 queryWeather 接口拒绝查询 short_term_rain，须调用独立 queryShortTermRain 接口。
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("short_term_rain")
    public String shortTermRain;

    public static WeatherVariable build(java.util.Map<String, ?> map) throws Exception {
        WeatherVariable self = new WeatherVariable();
        return TeaModel.build(map, self);
    }

    public WeatherVariable setVariableDate(String variableDate) {
        this.variableDate = variableDate;
        return this;
    }
    public String getVariableDate() {
        return this.variableDate;
    }

    public WeatherVariable setForecastBatchTime(String forecastBatchTime) {
        this.forecastBatchTime = forecastBatchTime;
        return this;
    }
    public String getForecastBatchTime() {
        return this.forecastBatchTime;
    }

    public WeatherVariable setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
        return this;
    }
    public String getTemperature2m() {
        return this.temperature2m;
    }

    public WeatherVariable setRelativeHumidity2m(String relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
        return this;
    }
    public String getRelativeHumidity2m() {
        return this.relativeHumidity2m;
    }

    public WeatherVariable setDewPoint2m(String dewPoint2m) {
        this.dewPoint2m = dewPoint2m;
        return this;
    }
    public String getDewPoint2m() {
        return this.dewPoint2m;
    }

    public WeatherVariable setPressureMsl(String pressureMsl) {
        this.pressureMsl = pressureMsl;
        return this;
    }
    public String getPressureMsl() {
        return this.pressureMsl;
    }

    public WeatherVariable setSurfacePressure(String surfacePressure) {
        this.surfacePressure = surfacePressure;
        return this;
    }
    public String getSurfacePressure() {
        return this.surfacePressure;
    }

    public WeatherVariable setPrecipitationProbability(String precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
        return this;
    }
    public String getPrecipitationProbability() {
        return this.precipitationProbability;
    }

    public WeatherVariable setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
        return this;
    }
    public String getCloudCover() {
        return this.cloudCover;
    }

    public WeatherVariable setCloudCoverLow(String cloudCoverLow) {
        this.cloudCoverLow = cloudCoverLow;
        return this;
    }
    public String getCloudCoverLow() {
        return this.cloudCoverLow;
    }

    public WeatherVariable setCloudCoverMid(String cloudCoverMid) {
        this.cloudCoverMid = cloudCoverMid;
        return this;
    }
    public String getCloudCoverMid() {
        return this.cloudCoverMid;
    }

    public WeatherVariable setCloudCoverHigh(String cloudCoverHigh) {
        this.cloudCoverHigh = cloudCoverHigh;
        return this;
    }
    public String getCloudCoverHigh() {
        return this.cloudCoverHigh;
    }

    public WeatherVariable setShortwaveRadiation(String shortwaveRadiation) {
        this.shortwaveRadiation = shortwaveRadiation;
        return this;
    }
    public String getShortwaveRadiation() {
        return this.shortwaveRadiation;
    }

    public WeatherVariable setDirectRadiation(String directRadiation) {
        this.directRadiation = directRadiation;
        return this;
    }
    public String getDirectRadiation() {
        return this.directRadiation;
    }

    public WeatherVariable setDirectNormalIrradiance(String directNormalIrradiance) {
        this.directNormalIrradiance = directNormalIrradiance;
        return this;
    }
    public String getDirectNormalIrradiance() {
        return this.directNormalIrradiance;
    }

    public WeatherVariable setDiffuseRadiation(String diffuseRadiation) {
        this.diffuseRadiation = diffuseRadiation;
        return this;
    }
    public String getDiffuseRadiation() {
        return this.diffuseRadiation;
    }

    public WeatherVariable setWindSpeed10m(String windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
        return this;
    }
    public String getWindSpeed10m() {
        return this.windSpeed10m;
    }

    public WeatherVariable setWindSpeed80m(String windSpeed80m) {
        this.windSpeed80m = windSpeed80m;
        return this;
    }
    public String getWindSpeed80m() {
        return this.windSpeed80m;
    }

    public WeatherVariable setWindSpeed120m(String windSpeed120m) {
        this.windSpeed120m = windSpeed120m;
        return this;
    }
    public String getWindSpeed120m() {
        return this.windSpeed120m;
    }

    public WeatherVariable setWindDirection10m(String windDirection10m) {
        this.windDirection10m = windDirection10m;
        return this;
    }
    public String getWindDirection10m() {
        return this.windDirection10m;
    }

    public WeatherVariable setWindDirection80m(String windDirection80m) {
        this.windDirection80m = windDirection80m;
        return this;
    }
    public String getWindDirection80m() {
        return this.windDirection80m;
    }

    public WeatherVariable setWindDirection120m(String windDirection120m) {
        this.windDirection120m = windDirection120m;
        return this;
    }
    public String getWindDirection120m() {
        return this.windDirection120m;
    }

    public WeatherVariable setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
        return this;
    }
    public String getWeatherCode() {
        return this.weatherCode;
    }

    public WeatherVariable setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
        return this;
    }
    public String getApparentTemperature() {
        return this.apparentTemperature;
    }

    public WeatherVariable setRain(String rain) {
        this.rain = rain;
        return this;
    }
    public String getRain() {
        return this.rain;
    }

    public WeatherVariable setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
        return this;
    }
    public String getPrecipitation() {
        return this.precipitation;
    }

    public WeatherVariable setSnowfall(String snowfall) {
        this.snowfall = snowfall;
        return this;
    }
    public String getSnowfall() {
        return this.snowfall;
    }

    public WeatherVariable setShortwaveRadiationInstant(String shortwaveRadiationInstant) {
        this.shortwaveRadiationInstant = shortwaveRadiationInstant;
        return this;
    }
    public String getShortwaveRadiationInstant() {
        return this.shortwaveRadiationInstant;
    }

    public WeatherVariable setDirectRadiationInstant(String directRadiationInstant) {
        this.directRadiationInstant = directRadiationInstant;
        return this;
    }
    public String getDirectRadiationInstant() {
        return this.directRadiationInstant;
    }

    public WeatherVariable setDiffuseRadiationInstant(String diffuseRadiationInstant) {
        this.diffuseRadiationInstant = diffuseRadiationInstant;
        return this;
    }
    public String getDiffuseRadiationInstant() {
        return this.diffuseRadiationInstant;
    }

    public WeatherVariable setDirectNormalIrradianceInstant(String directNormalIrradianceInstant) {
        this.directNormalIrradianceInstant = directNormalIrradianceInstant;
        return this;
    }
    public String getDirectNormalIrradianceInstant() {
        return this.directNormalIrradianceInstant;
    }

    public WeatherVariable setWindSpeed180m(String windSpeed180m) {
        this.windSpeed180m = windSpeed180m;
        return this;
    }
    public String getWindSpeed180m() {
        return this.windSpeed180m;
    }

    public WeatherVariable setWindDirection180m(String windDirection180m) {
        this.windDirection180m = windDirection180m;
        return this;
    }
    public String getWindDirection180m() {
        return this.windDirection180m;
    }

    public WeatherVariable setShortTermRain(String shortTermRain) {
        this.shortTermRain = shortTermRain;
        return this;
    }
    public String getShortTermRain() {
        return this.shortTermRain;
    }

}

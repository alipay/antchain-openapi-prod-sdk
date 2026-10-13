<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class WeatherVariable extends Model {
    protected $_name = [
        'variableDate' => 'variable_date',
        'forecastBatchTime' => 'forecast_batch_time',
        'temperature2m' => 'temperature_2m',
        'relativeHumidity2m' => 'relative_humidity_2m',
        'dewPoint2m' => 'dew_point_2m',
        'pressureMsl' => 'pressure_msl',
        'surfacePressure' => 'surface_pressure',
        'precipitationProbability' => 'precipitation_probability',
        'cloudCover' => 'cloud_cover',
        'cloudCoverLow' => 'cloud_cover_low',
        'cloudCoverMid' => 'cloud_cover_mid',
        'cloudCoverHigh' => 'cloud_cover_high',
        'shortwaveRadiation' => 'shortwave_radiation',
        'directRadiation' => 'direct_radiation',
        'directNormalIrradiance' => 'direct_normal_irradiance',
        'diffuseRadiation' => 'diffuse_radiation',
        'windSpeed10m' => 'wind_speed_10m',
        'windSpeed80m' => 'wind_speed_80m',
        'windSpeed120m' => 'wind_speed_120m',
        'windDirection10m' => 'wind_direction_10m',
        'windDirection80m' => 'wind_direction_80m',
        'windDirection120m' => 'wind_direction_120m',
        'weatherCode' => 'weather_code',
        'apparentTemperature' => 'apparent_temperature',
        'rain' => 'rain',
        'precipitation' => 'precipitation',
        'snowfall' => 'snowfall',
        'shortwaveRadiationInstant' => 'shortwave_radiation_instant',
        'directRadiationInstant' => 'direct_radiation_instant',
        'diffuseRadiationInstant' => 'diffuse_radiation_instant',
        'directNormalIrradianceInstant' => 'direct_normal_irradiance_instant',
        'windSpeed180m' => 'wind_speed_180m',
        'windDirection180m' => 'wind_direction_180m',
        'shortTermRain' => 'short_term_rain',
    ];
    public function validate() {
        Model::validatePattern('variableDate', $this->variableDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('forecastBatchTime', $this->forecastBatchTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->variableDate) {
            $res['variable_date'] = $this->variableDate;
        }
        if (null !== $this->forecastBatchTime) {
            $res['forecast_batch_time'] = $this->forecastBatchTime;
        }
        if (null !== $this->temperature2m) {
            $res['temperature_2m'] = $this->temperature2m;
        }
        if (null !== $this->relativeHumidity2m) {
            $res['relative_humidity_2m'] = $this->relativeHumidity2m;
        }
        if (null !== $this->dewPoint2m) {
            $res['dew_point_2m'] = $this->dewPoint2m;
        }
        if (null !== $this->pressureMsl) {
            $res['pressure_msl'] = $this->pressureMsl;
        }
        if (null !== $this->surfacePressure) {
            $res['surface_pressure'] = $this->surfacePressure;
        }
        if (null !== $this->precipitationProbability) {
            $res['precipitation_probability'] = $this->precipitationProbability;
        }
        if (null !== $this->cloudCover) {
            $res['cloud_cover'] = $this->cloudCover;
        }
        if (null !== $this->cloudCoverLow) {
            $res['cloud_cover_low'] = $this->cloudCoverLow;
        }
        if (null !== $this->cloudCoverMid) {
            $res['cloud_cover_mid'] = $this->cloudCoverMid;
        }
        if (null !== $this->cloudCoverHigh) {
            $res['cloud_cover_high'] = $this->cloudCoverHigh;
        }
        if (null !== $this->shortwaveRadiation) {
            $res['shortwave_radiation'] = $this->shortwaveRadiation;
        }
        if (null !== $this->directRadiation) {
            $res['direct_radiation'] = $this->directRadiation;
        }
        if (null !== $this->directNormalIrradiance) {
            $res['direct_normal_irradiance'] = $this->directNormalIrradiance;
        }
        if (null !== $this->diffuseRadiation) {
            $res['diffuse_radiation'] = $this->diffuseRadiation;
        }
        if (null !== $this->windSpeed10m) {
            $res['wind_speed_10m'] = $this->windSpeed10m;
        }
        if (null !== $this->windSpeed80m) {
            $res['wind_speed_80m'] = $this->windSpeed80m;
        }
        if (null !== $this->windSpeed120m) {
            $res['wind_speed_120m'] = $this->windSpeed120m;
        }
        if (null !== $this->windDirection10m) {
            $res['wind_direction_10m'] = $this->windDirection10m;
        }
        if (null !== $this->windDirection80m) {
            $res['wind_direction_80m'] = $this->windDirection80m;
        }
        if (null !== $this->windDirection120m) {
            $res['wind_direction_120m'] = $this->windDirection120m;
        }
        if (null !== $this->weatherCode) {
            $res['weather_code'] = $this->weatherCode;
        }
        if (null !== $this->apparentTemperature) {
            $res['apparent_temperature'] = $this->apparentTemperature;
        }
        if (null !== $this->rain) {
            $res['rain'] = $this->rain;
        }
        if (null !== $this->precipitation) {
            $res['precipitation'] = $this->precipitation;
        }
        if (null !== $this->snowfall) {
            $res['snowfall'] = $this->snowfall;
        }
        if (null !== $this->shortwaveRadiationInstant) {
            $res['shortwave_radiation_instant'] = $this->shortwaveRadiationInstant;
        }
        if (null !== $this->directRadiationInstant) {
            $res['direct_radiation_instant'] = $this->directRadiationInstant;
        }
        if (null !== $this->diffuseRadiationInstant) {
            $res['diffuse_radiation_instant'] = $this->diffuseRadiationInstant;
        }
        if (null !== $this->directNormalIrradianceInstant) {
            $res['direct_normal_irradiance_instant'] = $this->directNormalIrradianceInstant;
        }
        if (null !== $this->windSpeed180m) {
            $res['wind_speed_180m'] = $this->windSpeed180m;
        }
        if (null !== $this->windDirection180m) {
            $res['wind_direction_180m'] = $this->windDirection180m;
        }
        if (null !== $this->shortTermRain) {
            $res['short_term_rain'] = $this->shortTermRain;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WeatherVariable
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['variable_date'])){
            $model->variableDate = $map['variable_date'];
        }
        if(isset($map['forecast_batch_time'])){
            $model->forecastBatchTime = $map['forecast_batch_time'];
        }
        if(isset($map['temperature_2m'])){
            $model->temperature2m = $map['temperature_2m'];
        }
        if(isset($map['relative_humidity_2m'])){
            $model->relativeHumidity2m = $map['relative_humidity_2m'];
        }
        if(isset($map['dew_point_2m'])){
            $model->dewPoint2m = $map['dew_point_2m'];
        }
        if(isset($map['pressure_msl'])){
            $model->pressureMsl = $map['pressure_msl'];
        }
        if(isset($map['surface_pressure'])){
            $model->surfacePressure = $map['surface_pressure'];
        }
        if(isset($map['precipitation_probability'])){
            $model->precipitationProbability = $map['precipitation_probability'];
        }
        if(isset($map['cloud_cover'])){
            $model->cloudCover = $map['cloud_cover'];
        }
        if(isset($map['cloud_cover_low'])){
            $model->cloudCoverLow = $map['cloud_cover_low'];
        }
        if(isset($map['cloud_cover_mid'])){
            $model->cloudCoverMid = $map['cloud_cover_mid'];
        }
        if(isset($map['cloud_cover_high'])){
            $model->cloudCoverHigh = $map['cloud_cover_high'];
        }
        if(isset($map['shortwave_radiation'])){
            $model->shortwaveRadiation = $map['shortwave_radiation'];
        }
        if(isset($map['direct_radiation'])){
            $model->directRadiation = $map['direct_radiation'];
        }
        if(isset($map['direct_normal_irradiance'])){
            $model->directNormalIrradiance = $map['direct_normal_irradiance'];
        }
        if(isset($map['diffuse_radiation'])){
            $model->diffuseRadiation = $map['diffuse_radiation'];
        }
        if(isset($map['wind_speed_10m'])){
            $model->windSpeed10m = $map['wind_speed_10m'];
        }
        if(isset($map['wind_speed_80m'])){
            $model->windSpeed80m = $map['wind_speed_80m'];
        }
        if(isset($map['wind_speed_120m'])){
            $model->windSpeed120m = $map['wind_speed_120m'];
        }
        if(isset($map['wind_direction_10m'])){
            $model->windDirection10m = $map['wind_direction_10m'];
        }
        if(isset($map['wind_direction_80m'])){
            $model->windDirection80m = $map['wind_direction_80m'];
        }
        if(isset($map['wind_direction_120m'])){
            $model->windDirection120m = $map['wind_direction_120m'];
        }
        if(isset($map['weather_code'])){
            $model->weatherCode = $map['weather_code'];
        }
        if(isset($map['apparent_temperature'])){
            $model->apparentTemperature = $map['apparent_temperature'];
        }
        if(isset($map['rain'])){
            $model->rain = $map['rain'];
        }
        if(isset($map['precipitation'])){
            $model->precipitation = $map['precipitation'];
        }
        if(isset($map['snowfall'])){
            $model->snowfall = $map['snowfall'];
        }
        if(isset($map['shortwave_radiation_instant'])){
            $model->shortwaveRadiationInstant = $map['shortwave_radiation_instant'];
        }
        if(isset($map['direct_radiation_instant'])){
            $model->directRadiationInstant = $map['direct_radiation_instant'];
        }
        if(isset($map['diffuse_radiation_instant'])){
            $model->diffuseRadiationInstant = $map['diffuse_radiation_instant'];
        }
        if(isset($map['direct_normal_irradiance_instant'])){
            $model->directNormalIrradianceInstant = $map['direct_normal_irradiance_instant'];
        }
        if(isset($map['wind_speed_180m'])){
            $model->windSpeed180m = $map['wind_speed_180m'];
        }
        if(isset($map['wind_direction_180m'])){
            $model->windDirection180m = $map['wind_direction_180m'];
        }
        if(isset($map['short_term_rain'])){
            $model->shortTermRain = $map['short_term_rain'];
        }
        return $model;
    }
    // 气象数据对应的时间点，Java 类型 Date。
    /**
     * @example 2026-09-20 09:00:00
     * @var string
     */
    public $variableDate;

    // 该条气象数据的预测批次时间，Java 类型 Date，可能为空。
    /**
     * @example 2026-09-20 08:00:00
     * @var string
     */
    public $forecastBatchTime;

    // 地面 2 米处空气温度，单位 °C。
    /**
     * @example 25.3
     * @var string
     */
    public $temperature2m;

    // 地面 2 米处相对空气湿度，单位 %。
    /**
     * @example 65
     * @var string
     */
    public $relativeHumidity2m;

    // 地面 2 米处露点温度，单位 °C。
    /**
     * @example 18.2
     * @var string
     */
    public $dewPoint2m;

    // 海平面大气压，单位 hPa。
    /**
     * @example 1013.2
     * @var string
     */
    public $pressureMsl;

    // 地表大气压，单位 hPa。
    /**
     * @example 1008.6
     * @var string
     */
    public $surfacePressure;

    // 未来一小时降水量大于 0.1mm 的概率，单位 %。
    /**
     * @example 40
     * @var string
     */
    public $precipitationProbability;

    // 总云量，单位 %。
    /**
     * @example 60
     * @var string
     */
    public $cloudCover;

    // 低云量，单位 %。
    /**
     * @example 20
     * @var string
     */
    public $cloudCoverLow;

    // 中云量，单位 %。
    /**
     * @example 30
     * @var string
     */
    public $cloudCoverMid;

    // 高云量，单位 %。
    /**
     * @example 10
     * @var string
     */
    public $cloudCoverHigh;

    // 短波辐照，未来一小时平均，单位 W/m²。
    /**
     * @example 500
     * @var string
     */
    public $shortwaveRadiation;

    // 直接辐照，代码注释定义为未来一小时累计，单位 W/m²。
    /**
     * @example 350
     * @var string
     */
    public $directRadiation;

    // 直接法向辐照，未来一小时平均，单位 W/m²。
    /**
     * @example 420
     * @var string
     */
    public $directNormalIrradiance;

    // 散射辐照，未来一小时平均，单位 W/m²。
    /**
     * @example 150
     * @var string
     */
    public $diffuseRadiation;

    // 地面 10 米处风速，单位 m/s。
    /**
     * @example 3.2
     * @var string
     */
    public $windSpeed10m;

    // 地面 80 米处风速，单位 m/s。
    /**
     * @example 5.6
     * @var string
     */
    public $windSpeed80m;

    // 地面 120 米处风速，单位 m/s。
    /**
     * @example 6.1
     * @var string
     */
    public $windSpeed120m;

    // 地面 10 米处风向，单位 °。
    /**
     * @example 180
     * @var string
     */
    public $windDirection10m;

    // 地面 80 米处风向，单位 °。
    /**
     * @example 185
     * @var string
     */
    public $windDirection80m;

    // 地面 120 米处风向，单位 °。
    /**
     * @example 190
     * @var string
     */
    public $windDirection120m;

    // 天气代码，采用 WMO 天气编码。
    /**
     * @example 3
     * @var string
     */
    public $weatherCode;

    // 体感温度，单位 °C。
    /**
     * @example 27.1
     * @var string
     */
    public $apparentTemperature;

    // 降雨量，单位 mm。
    /**
     * @example 0.2
     * @var string
     */
    public $rain;

    // 降水量，包含所有降水形式，单位 mm。
    /**
     * @example 0.3
     * @var string
     */
    public $precipitation;

    // 降雪量，单位 cm。
    /**
     * @example 0
     * @var string
     */
    public $snowfall;

    // 短波辐照瞬时值，单位 W/m²。
    /**
     * @example 510
     * @var string
     */
    public $shortwaveRadiationInstant;

    // 直接辐照瞬时值，单位 W/m²。
    /**
     * @example 360
     * @var string
     */
    public $directRadiationInstant;

    // 散射辐照瞬时值，单位 W/m²。
    /**
     * @example 150
     * @var string
     */
    public $diffuseRadiationInstant;

    // 直接法向辐照瞬时值，单位 W/m²。
    /**
     * @example 430
     * @var string
     */
    public $directNormalIrradianceInstant;

    // 地面 180 米处风速，单位 m/s。
    /**
     * @example 7.0
     * @var string
     */
    public $windSpeed180m;

    // 地面 180 米处风向，单位 °。
    /**
     * @example 195
     * @var string
     */
    public $windDirection180m;

    // DTO 保留的短时降雨量字段，单位 mm。本 queryWeather 接口拒绝查询 short_term_rain，须调用独立 queryShortTermRain 接口。
    /**
     * @example 0
     * @var string
     */
    public $shortTermRain;

}

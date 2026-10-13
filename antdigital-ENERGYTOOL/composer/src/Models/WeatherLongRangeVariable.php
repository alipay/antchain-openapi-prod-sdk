<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class WeatherLongRangeVariable extends Model {
    protected $_name = [
        'variableDate' => 'variable_date',
        'forecastBatchTime' => 'forecast_batch_time',
        'temperature2m' => 'temperature_2m',
        'dewPoint2m' => 'dew_point_2m',
        'apparentTemperature' => 'apparent_temperature',
        'relativeHumidity2m' => 'relative_humidity_2m',
        'pressureMsl' => 'pressure_msl',
        'surfacePressure' => 'surface_pressure',
        'weatherCode' => 'weather_code',
        'precipitation' => 'precipitation',
        'cloudCover' => 'cloud_cover',
        'windSpeed10m' => 'wind_speed_10m',
        'windSpeed100m' => 'wind_speed_100m',
        'windSpeed200m' => 'wind_speed_200m',
        'windDirection10m' => 'wind_direction_10m',
        'windDirection100m' => 'wind_direction_100m',
        'windDirection200m' => 'wind_direction_200m',
        'shortwaveRadiationInstant' => 'shortwave_radiation_instant',
        'directRadiationInstant' => 'direct_radiation_instant',
        'diffuseRadiationInstant' => 'diffuse_radiation_instant',
        'shortwaveRadiation' => 'shortwave_radiation',
        'directRadiation' => 'direct_radiation',
        'diffuseRadiation' => 'diffuse_radiation',
        'windGusts10m' => 'wind_gusts_10m',
        'temperature2mMax' => 'temperature_2m_max',
        'temperature2mMin' => 'temperature_2m_min',
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
        if (null !== $this->dewPoint2m) {
            $res['dew_point_2m'] = $this->dewPoint2m;
        }
        if (null !== $this->apparentTemperature) {
            $res['apparent_temperature'] = $this->apparentTemperature;
        }
        if (null !== $this->relativeHumidity2m) {
            $res['relative_humidity_2m'] = $this->relativeHumidity2m;
        }
        if (null !== $this->pressureMsl) {
            $res['pressure_msl'] = $this->pressureMsl;
        }
        if (null !== $this->surfacePressure) {
            $res['surface_pressure'] = $this->surfacePressure;
        }
        if (null !== $this->weatherCode) {
            $res['weather_code'] = $this->weatherCode;
        }
        if (null !== $this->precipitation) {
            $res['precipitation'] = $this->precipitation;
        }
        if (null !== $this->cloudCover) {
            $res['cloud_cover'] = $this->cloudCover;
        }
        if (null !== $this->windSpeed10m) {
            $res['wind_speed_10m'] = $this->windSpeed10m;
        }
        if (null !== $this->windSpeed100m) {
            $res['wind_speed_100m'] = $this->windSpeed100m;
        }
        if (null !== $this->windSpeed200m) {
            $res['wind_speed_200m'] = $this->windSpeed200m;
        }
        if (null !== $this->windDirection10m) {
            $res['wind_direction_10m'] = $this->windDirection10m;
        }
        if (null !== $this->windDirection100m) {
            $res['wind_direction_100m'] = $this->windDirection100m;
        }
        if (null !== $this->windDirection200m) {
            $res['wind_direction_200m'] = $this->windDirection200m;
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
        if (null !== $this->shortwaveRadiation) {
            $res['shortwave_radiation'] = $this->shortwaveRadiation;
        }
        if (null !== $this->directRadiation) {
            $res['direct_radiation'] = $this->directRadiation;
        }
        if (null !== $this->diffuseRadiation) {
            $res['diffuse_radiation'] = $this->diffuseRadiation;
        }
        if (null !== $this->windGusts10m) {
            $res['wind_gusts_10m'] = $this->windGusts10m;
        }
        if (null !== $this->temperature2mMax) {
            $res['temperature_2m_max'] = $this->temperature2mMax;
        }
        if (null !== $this->temperature2mMin) {
            $res['temperature_2m_min'] = $this->temperature2mMin;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WeatherLongRangeVariable
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
        if(isset($map['dew_point_2m'])){
            $model->dewPoint2m = $map['dew_point_2m'];
        }
        if(isset($map['apparent_temperature'])){
            $model->apparentTemperature = $map['apparent_temperature'];
        }
        if(isset($map['relative_humidity_2m'])){
            $model->relativeHumidity2m = $map['relative_humidity_2m'];
        }
        if(isset($map['pressure_msl'])){
            $model->pressureMsl = $map['pressure_msl'];
        }
        if(isset($map['surface_pressure'])){
            $model->surfacePressure = $map['surface_pressure'];
        }
        if(isset($map['weather_code'])){
            $model->weatherCode = $map['weather_code'];
        }
        if(isset($map['precipitation'])){
            $model->precipitation = $map['precipitation'];
        }
        if(isset($map['cloud_cover'])){
            $model->cloudCover = $map['cloud_cover'];
        }
        if(isset($map['wind_speed_10m'])){
            $model->windSpeed10m = $map['wind_speed_10m'];
        }
        if(isset($map['wind_speed_100m'])){
            $model->windSpeed100m = $map['wind_speed_100m'];
        }
        if(isset($map['wind_speed_200m'])){
            $model->windSpeed200m = $map['wind_speed_200m'];
        }
        if(isset($map['wind_direction_10m'])){
            $model->windDirection10m = $map['wind_direction_10m'];
        }
        if(isset($map['wind_direction_100m'])){
            $model->windDirection100m = $map['wind_direction_100m'];
        }
        if(isset($map['wind_direction_200m'])){
            $model->windDirection200m = $map['wind_direction_200m'];
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
        if(isset($map['shortwave_radiation'])){
            $model->shortwaveRadiation = $map['shortwave_radiation'];
        }
        if(isset($map['direct_radiation'])){
            $model->directRadiation = $map['direct_radiation'];
        }
        if(isset($map['diffuse_radiation'])){
            $model->diffuseRadiation = $map['diffuse_radiation'];
        }
        if(isset($map['wind_gusts_10m'])){
            $model->windGusts10m = $map['wind_gusts_10m'];
        }
        if(isset($map['temperature_2m_max'])){
            $model->temperature2mMax = $map['temperature_2m_max'];
        }
        if(isset($map['temperature_2m_min'])){
            $model->temperature2mMin = $map['temperature_2m_min'];
        }
        return $model;
    }
    // 预测数据时刻，格式 yyyy-MM-dd HH:mm:ss，对应 variableDate。
    /**
     * @example 2026-10-07 00:00:00
     * @var string
     */
    public $variableDate;

    // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss，对应 forecastBatchTime。
    /**
     * @example 2026-09-21 08:00:00
     * @var string
     */
    public $forecastBatchTime;

    // 2 米气温，单位 ℃；对应 temperature2m。
    /**
     * @example 25.3
     * @var string
     */
    public $temperature2m;

    // 2 米露点温度，单位 ℃；对应 dewPoint2m。
    /**
     * @example 18.2
     * @var string
     */
    public $dewPoint2m;

    // 体感温度，单位 ℃；对应 apparentTemperature。
    /**
     * @example 27.1
     * @var string
     */
    public $apparentTemperature;

    // 2 米相对湿度，单位 %；对应 relativeHumidity2m。
    /**
     * @example 65
     * @var string
     */
    public $relativeHumidity2m;

    // 海平面气压，单位 hPa；对应 pressureMsl。
    /**
     * @example 1013.2
     * @var string
     */
    public $pressureMsl;

    // 地表气压，单位 hPa；对应 surfacePressure。
    /**
     * @example 1008.6
     * @var string
     */
    public $surfacePressure;

    // 平台天气编码，由源天气编码转换；对应 weatherCode。
    /**
     * @example 3
     * @var string
     */
    public $weatherCode;

    // 降水量，单位 mm；对应 precipitation。
    /**
     * @example 0.3
     * @var string
     */
    public $precipitation;

    // 云量，单位 %；对应 cloudCover。
    /**
     * @example 60
     * @var string
     */
    public $cloudCover;

    // 10 米风速，单位 m/s；对应 windSpeed10m。
    /**
     * @example 3.2
     * @var string
     */
    public $windSpeed10m;

    // 100 米风速，单位 m/s；对应 windSpeed100m。
    /**
     * @example 5.6
     * @var string
     */
    public $windSpeed100m;

    // 200 米风速，单位 m/s；对应 windSpeed200m。
    /**
     * @example 7.0
     * @var string
     */
    public $windSpeed200m;

    // 10 米风向，单位 °；对应 windDirection10m。
    /**
     * @example 180
     * @var string
     */
    public $windDirection10m;

    // 100 米风向，单位 °；对应 windDirection100m。
    /**
     * @example 185
     * @var string
     */
    public $windDirection100m;

    // 200 米风向，单位 °；对应 windDirection200m。
    /**
     * @example 190
     * @var string
     */
    public $windDirection200m;

    // 瞬时短波辐射，单位 W/m²；对应 shortwaveRadiationInstant。
    /**
     * @example 600
     * @var string
     */
    public $shortwaveRadiationInstant;

    // 瞬时直接辐射，单位 W/m²；对应 directRadiationInstant。
    /**
     * @example 450
     * @var string
     */
    public $directRadiationInstant;

    // 瞬时散射辐射，单位 W/m²；对应 diffuseRadiationInstant。
    /**
     * @example 150
     * @var string
     */
    public $diffuseRadiationInstant;

    // 短波辐射，单位 W/m²；对应 shortwaveRadiation。
    /**
     * @example 550
     * @var string
     */
    public $shortwaveRadiation;

    // 直接辐射，单位 W/m²；对应 directRadiation。
    /**
     * @example 400
     * @var string
     */
    public $directRadiation;

    // 散射辐射，单位 W/m²；对应 diffuseRadiation。
    /**
     * @example 150
     * @var string
     */
    public $diffuseRadiation;

    // 10 米阵风风速，单位 m/s；对应 windGusts10m。
    /**
     * @example 6.2
     * @var string
     */
    public $windGusts10m;

    // 2 米最高气温，单位 ℃；对应 temperatureMax2m。
    /**
     * @example 30.2
     * @var string
     */
    public $temperature2mMax;

    // 2 米最低气温，单位 ℃；对应 temperatureMin2m。
    /**
     * @example 19.1
     * @var string
     */
    public $temperature2mMin;

}

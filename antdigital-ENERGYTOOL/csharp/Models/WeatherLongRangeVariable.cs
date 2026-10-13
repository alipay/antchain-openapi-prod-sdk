// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 中长期预测单时刻数据，6 小时间隔。字段按网关要求使用下划线命名，描述注明对应 WeatherLongRangeVariableDTO 属性；未请求或缺失的要素可为空。
    public class WeatherLongRangeVariable : TeaModel {
        // 预测数据时刻，格式 yyyy-MM-dd HH:mm:ss，对应 variableDate。
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-10-07 00:00:00</para>
        /// </summary>
        [NameInMap("variable_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string VariableDate { get; set; }

        // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss，对应 forecastBatchTime。
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-09-21 08:00:00</para>
        /// </summary>
        [NameInMap("forecast_batch_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ForecastBatchTime { get; set; }

        // 2 米气温，单位 ℃；对应 temperature2m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>25.3</para>
        /// </summary>
        [NameInMap("temperature_2m")]
        [Validation(Required=false)]
        public string Temperature2m { get; set; }

        // 2 米露点温度，单位 ℃；对应 dewPoint2m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>18.2</para>
        /// </summary>
        [NameInMap("dew_point_2m")]
        [Validation(Required=false)]
        public string DewPoint2m { get; set; }

        // 体感温度，单位 ℃；对应 apparentTemperature。
        /// <summary>
        /// <b>Example:</b>
        /// <para>27.1</para>
        /// </summary>
        [NameInMap("apparent_temperature")]
        [Validation(Required=false)]
        public string ApparentTemperature { get; set; }

        // 2 米相对湿度，单位 %；对应 relativeHumidity2m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>65</para>
        /// </summary>
        [NameInMap("relative_humidity_2m")]
        [Validation(Required=false)]
        public string RelativeHumidity2m { get; set; }

        // 海平面气压，单位 hPa；对应 pressureMsl。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1013.2</para>
        /// </summary>
        [NameInMap("pressure_msl")]
        [Validation(Required=false)]
        public string PressureMsl { get; set; }

        // 地表气压，单位 hPa；对应 surfacePressure。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1008.6</para>
        /// </summary>
        [NameInMap("surface_pressure")]
        [Validation(Required=false)]
        public string SurfacePressure { get; set; }

        // 平台天气编码，由源天气编码转换；对应 weatherCode。
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("weather_code")]
        [Validation(Required=false)]
        public string WeatherCode { get; set; }

        // 降水量，单位 mm；对应 precipitation。
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.3</para>
        /// </summary>
        [NameInMap("precipitation")]
        [Validation(Required=false)]
        public string Precipitation { get; set; }

        // 云量，单位 %；对应 cloudCover。
        /// <summary>
        /// <b>Example:</b>
        /// <para>60</para>
        /// </summary>
        [NameInMap("cloud_cover")]
        [Validation(Required=false)]
        public string CloudCover { get; set; }

        // 10 米风速，单位 m/s；对应 windSpeed10m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.2</para>
        /// </summary>
        [NameInMap("wind_speed_10m")]
        [Validation(Required=false)]
        public string WindSpeed10m { get; set; }

        // 100 米风速，单位 m/s；对应 windSpeed100m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>5.6</para>
        /// </summary>
        [NameInMap("wind_speed_100m")]
        [Validation(Required=false)]
        public string WindSpeed100m { get; set; }

        // 200 米风速，单位 m/s；对应 windSpeed200m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>7.0</para>
        /// </summary>
        [NameInMap("wind_speed_200m")]
        [Validation(Required=false)]
        public string WindSpeed200m { get; set; }

        // 10 米风向，单位 °；对应 windDirection10m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>180</para>
        /// </summary>
        [NameInMap("wind_direction_10m")]
        [Validation(Required=false)]
        public string WindDirection10m { get; set; }

        // 100 米风向，单位 °；对应 windDirection100m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>185</para>
        /// </summary>
        [NameInMap("wind_direction_100m")]
        [Validation(Required=false)]
        public string WindDirection100m { get; set; }

        // 200 米风向，单位 °；对应 windDirection200m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>190</para>
        /// </summary>
        [NameInMap("wind_direction_200m")]
        [Validation(Required=false)]
        public string WindDirection200m { get; set; }

        // 瞬时短波辐射，单位 W/m²；对应 shortwaveRadiationInstant。
        /// <summary>
        /// <b>Example:</b>
        /// <para>600</para>
        /// </summary>
        [NameInMap("shortwave_radiation_instant")]
        [Validation(Required=false)]
        public string ShortwaveRadiationInstant { get; set; }

        // 瞬时直接辐射，单位 W/m²；对应 directRadiationInstant。
        /// <summary>
        /// <b>Example:</b>
        /// <para>450</para>
        /// </summary>
        [NameInMap("direct_radiation_instant")]
        [Validation(Required=false)]
        public string DirectRadiationInstant { get; set; }

        // 瞬时散射辐射，单位 W/m²；对应 diffuseRadiationInstant。
        /// <summary>
        /// <b>Example:</b>
        /// <para>150</para>
        /// </summary>
        [NameInMap("diffuse_radiation_instant")]
        [Validation(Required=false)]
        public string DiffuseRadiationInstant { get; set; }

        // 短波辐射，单位 W/m²；对应 shortwaveRadiation。
        /// <summary>
        /// <b>Example:</b>
        /// <para>550</para>
        /// </summary>
        [NameInMap("shortwave_radiation")]
        [Validation(Required=false)]
        public string ShortwaveRadiation { get; set; }

        // 直接辐射，单位 W/m²；对应 directRadiation。
        /// <summary>
        /// <b>Example:</b>
        /// <para>400</para>
        /// </summary>
        [NameInMap("direct_radiation")]
        [Validation(Required=false)]
        public string DirectRadiation { get; set; }

        // 散射辐射，单位 W/m²；对应 diffuseRadiation。
        /// <summary>
        /// <b>Example:</b>
        /// <para>150</para>
        /// </summary>
        [NameInMap("diffuse_radiation")]
        [Validation(Required=false)]
        public string DiffuseRadiation { get; set; }

        // 10 米阵风风速，单位 m/s；对应 windGusts10m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>6.2</para>
        /// </summary>
        [NameInMap("wind_gusts_10m")]
        [Validation(Required=false)]
        public string WindGusts10m { get; set; }

        // 2 米最高气温，单位 ℃；对应 temperatureMax2m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>30.2</para>
        /// </summary>
        [NameInMap("temperature_2m_max")]
        [Validation(Required=false)]
        public string Temperature2mMax { get; set; }

        // 2 米最低气温，单位 ℃；对应 temperatureMin2m。
        /// <summary>
        /// <b>Example:</b>
        /// <para>19.1</para>
        /// </summary>
        [NameInMap("temperature_2m_min")]
        [Validation(Required=false)]
        public string Temperature2mMin { get; set; }

    }

}

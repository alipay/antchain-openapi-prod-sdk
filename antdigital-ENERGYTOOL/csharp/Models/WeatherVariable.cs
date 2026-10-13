// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 单个时间点的天气数据，对应 WeatherVariableDTO；气象要素值为字符串，按请求要素及数据可用性返回。
    public class WeatherVariable : TeaModel {
        // 气象数据对应的时间点，Java 类型 Date。
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-09-20 09:00:00</para>
        /// </summary>
        [NameInMap("variable_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string VariableDate { get; set; }

        // 该条气象数据的预测批次时间，Java 类型 Date，可能为空。
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-09-20 08:00:00</para>
        /// </summary>
        [NameInMap("forecast_batch_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ForecastBatchTime { get; set; }

        // 地面 2 米处空气温度，单位 °C。
        /// <summary>
        /// <b>Example:</b>
        /// <para>25.3</para>
        /// </summary>
        [NameInMap("temperature_2m")]
        [Validation(Required=false)]
        public string Temperature2m { get; set; }

        // 地面 2 米处相对空气湿度，单位 %。
        /// <summary>
        /// <b>Example:</b>
        /// <para>65</para>
        /// </summary>
        [NameInMap("relative_humidity_2m")]
        [Validation(Required=false)]
        public string RelativeHumidity2m { get; set; }

        // 地面 2 米处露点温度，单位 °C。
        /// <summary>
        /// <b>Example:</b>
        /// <para>18.2</para>
        /// </summary>
        [NameInMap("dew_point_2m")]
        [Validation(Required=false)]
        public string DewPoint2m { get; set; }

        // 海平面大气压，单位 hPa。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1013.2</para>
        /// </summary>
        [NameInMap("pressure_msl")]
        [Validation(Required=false)]
        public string PressureMsl { get; set; }

        // 地表大气压，单位 hPa。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1008.6</para>
        /// </summary>
        [NameInMap("surface_pressure")]
        [Validation(Required=false)]
        public string SurfacePressure { get; set; }

        // 未来一小时降水量大于 0.1mm 的概率，单位 %。
        /// <summary>
        /// <b>Example:</b>
        /// <para>40</para>
        /// </summary>
        [NameInMap("precipitation_probability")]
        [Validation(Required=false)]
        public string PrecipitationProbability { get; set; }

        // 总云量，单位 %。
        /// <summary>
        /// <b>Example:</b>
        /// <para>60</para>
        /// </summary>
        [NameInMap("cloud_cover")]
        [Validation(Required=false)]
        public string CloudCover { get; set; }

        // 低云量，单位 %。
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("cloud_cover_low")]
        [Validation(Required=false)]
        public string CloudCoverLow { get; set; }

        // 中云量，单位 %。
        /// <summary>
        /// <b>Example:</b>
        /// <para>30</para>
        /// </summary>
        [NameInMap("cloud_cover_mid")]
        [Validation(Required=false)]
        public string CloudCoverMid { get; set; }

        // 高云量，单位 %。
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("cloud_cover_high")]
        [Validation(Required=false)]
        public string CloudCoverHigh { get; set; }

        // 短波辐照，未来一小时平均，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>500</para>
        /// </summary>
        [NameInMap("shortwave_radiation")]
        [Validation(Required=false)]
        public string ShortwaveRadiation { get; set; }

        // 直接辐照，代码注释定义为未来一小时累计，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>350</para>
        /// </summary>
        [NameInMap("direct_radiation")]
        [Validation(Required=false)]
        public string DirectRadiation { get; set; }

        // 直接法向辐照，未来一小时平均，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>420</para>
        /// </summary>
        [NameInMap("direct_normal_irradiance")]
        [Validation(Required=false)]
        public string DirectNormalIrradiance { get; set; }

        // 散射辐照，未来一小时平均，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>150</para>
        /// </summary>
        [NameInMap("diffuse_radiation")]
        [Validation(Required=false)]
        public string DiffuseRadiation { get; set; }

        // 地面 10 米处风速，单位 m/s。
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.2</para>
        /// </summary>
        [NameInMap("wind_speed_10m")]
        [Validation(Required=false)]
        public string WindSpeed10m { get; set; }

        // 地面 80 米处风速，单位 m/s。
        /// <summary>
        /// <b>Example:</b>
        /// <para>5.6</para>
        /// </summary>
        [NameInMap("wind_speed_80m")]
        [Validation(Required=false)]
        public string WindSpeed80m { get; set; }

        // 地面 120 米处风速，单位 m/s。
        /// <summary>
        /// <b>Example:</b>
        /// <para>6.1</para>
        /// </summary>
        [NameInMap("wind_speed_120m")]
        [Validation(Required=false)]
        public string WindSpeed120m { get; set; }

        // 地面 10 米处风向，单位 °。
        /// <summary>
        /// <b>Example:</b>
        /// <para>180</para>
        /// </summary>
        [NameInMap("wind_direction_10m")]
        [Validation(Required=false)]
        public string WindDirection10m { get; set; }

        // 地面 80 米处风向，单位 °。
        /// <summary>
        /// <b>Example:</b>
        /// <para>185</para>
        /// </summary>
        [NameInMap("wind_direction_80m")]
        [Validation(Required=false)]
        public string WindDirection80m { get; set; }

        // 地面 120 米处风向，单位 °。
        /// <summary>
        /// <b>Example:</b>
        /// <para>190</para>
        /// </summary>
        [NameInMap("wind_direction_120m")]
        [Validation(Required=false)]
        public string WindDirection120m { get; set; }

        // 天气代码，采用 WMO 天气编码。
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("weather_code")]
        [Validation(Required=false)]
        public string WeatherCode { get; set; }

        // 体感温度，单位 °C。
        /// <summary>
        /// <b>Example:</b>
        /// <para>27.1</para>
        /// </summary>
        [NameInMap("apparent_temperature")]
        [Validation(Required=false)]
        public string ApparentTemperature { get; set; }

        // 降雨量，单位 mm。
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.2</para>
        /// </summary>
        [NameInMap("rain")]
        [Validation(Required=false)]
        public string Rain { get; set; }

        // 降水量，包含所有降水形式，单位 mm。
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.3</para>
        /// </summary>
        [NameInMap("precipitation")]
        [Validation(Required=false)]
        public string Precipitation { get; set; }

        // 降雪量，单位 cm。
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("snowfall")]
        [Validation(Required=false)]
        public string Snowfall { get; set; }

        // 短波辐照瞬时值，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>510</para>
        /// </summary>
        [NameInMap("shortwave_radiation_instant")]
        [Validation(Required=false)]
        public string ShortwaveRadiationInstant { get; set; }

        // 直接辐照瞬时值，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>360</para>
        /// </summary>
        [NameInMap("direct_radiation_instant")]
        [Validation(Required=false)]
        public string DirectRadiationInstant { get; set; }

        // 散射辐照瞬时值，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>150</para>
        /// </summary>
        [NameInMap("diffuse_radiation_instant")]
        [Validation(Required=false)]
        public string DiffuseRadiationInstant { get; set; }

        // 直接法向辐照瞬时值，单位 W/m²。
        /// <summary>
        /// <b>Example:</b>
        /// <para>430</para>
        /// </summary>
        [NameInMap("direct_normal_irradiance_instant")]
        [Validation(Required=false)]
        public string DirectNormalIrradianceInstant { get; set; }

        // 地面 180 米处风速，单位 m/s。
        /// <summary>
        /// <b>Example:</b>
        /// <para>7.0</para>
        /// </summary>
        [NameInMap("wind_speed_180m")]
        [Validation(Required=false)]
        public string WindSpeed180m { get; set; }

        // 地面 180 米处风向，单位 °。
        /// <summary>
        /// <b>Example:</b>
        /// <para>195</para>
        /// </summary>
        [NameInMap("wind_direction_180m")]
        [Validation(Required=false)]
        public string WindDirection180m { get; set; }

        // DTO 保留的短时降雨量字段，单位 mm。本 queryWeather 接口拒绝查询 short_term_rain，须调用独立 queryShortTermRain 接口。
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("short_term_rain")]
        [Validation(Required=false)]
        public string ShortTermRain { get; set; }

    }

}

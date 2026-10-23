// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class WeatherShortTermRain extends TeaModel {
    // 预报时间，对应 Java Date forecastTime，示例格式 yyyy-MM-dd HH:mm:ss。
    /**
     * <strong>example:</strong>
     * <p>2026-10-22 15:05:00</p>
     */
    @NameInMap("forecast_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String forecastTime;

    // 该预报时间点的降水量，单位 mm，字符串保留原数值；对应 Java precip。
    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("precip")
    public String precip;

    // 平台降水类型枚举：RAIN（雨）、SNOW（雪）、UNKNOWN（未知）；对应 Java type。
    /**
     * <strong>example:</strong>
     * <p>RAIN</p>
     */
    @NameInMap("type")
    public String type;

    public static WeatherShortTermRain build(java.util.Map<String, ?> map) throws Exception {
        WeatherShortTermRain self = new WeatherShortTermRain();
        return TeaModel.build(map, self);
    }

    public WeatherShortTermRain setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
        return this;
    }
    public String getForecastTime() {
        return this.forecastTime;
    }

    public WeatherShortTermRain setPrecip(String precip) {
        this.precip = precip;
        return this;
    }
    public String getPrecip() {
        return this.precip;
    }

    public WeatherShortTermRain setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

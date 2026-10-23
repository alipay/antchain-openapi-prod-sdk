// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class WeatherAlert extends TeaModel {
    // 预警唯一 ID，对应 Java alertId。
    /**
     * <strong>example:</strong>
     * <p>alert_example_001</p>
     */
    @NameInMap("alert_id")
    public String alertId;

    // 预警类型名称，对应 Java alertName。
    /**
     * <strong>example:</strong>
     * <p>暴雨</p>
     */
    @NameInMap("alert_name")
    public String alertName;

    // 平台极端天气预警编码，对应 Java alertCode，与外部源事件类型一对一映射，未知值为 UNKNOWN。
    /**
     * <strong>example:</strong>
     * <p>UNKNOWN</p>
     */
    @NameInMap("alert_code")
    public String alertCode;

    // 发生确定性：OBSERVED、LIKELY、POSSIBLE、UNLIKELY、UNKNOWN；对应 Java certainty。
    /**
     * <strong>example:</strong>
     * <p>LIKELY</p>
     */
    @NameInMap("certainty")
    public String certainty;

    // 预警生效时间，带时区的 ISO-8601 字符串，对应 Java effectiveTime。
    /**
     * <strong>example:</strong>
     * <p>2026-10-22T08:00:00+08:00</p>
     */
    @NameInMap("effective_time")
    public String effectiveTime;

    // 事件预计开始时间，带时区的 ISO-8601 字符串，对应 Java onsetTime。
    /**
     * <strong>example:</strong>
     * <p>2026-10-22T09:00:00+08:00</p>
     */
    @NameInMap("onset_time")
    public String onsetTime;

    // 预警失效时间，带时区的 ISO-8601 字符串，对应 Java expireTime。
    /**
     * <strong>example:</strong>
     * <p>2026-10-22T20:00:00+08:00</p>
     */
    @NameInMap("expire_time")
    public String expireTime;

    // 预警标题，对应 Java headline。
    /**
     * <strong>example:</strong>
     * <p>暴雨预警</p>
     */
    @NameInMap("headline")
    public String headline;

    // 预警详情，对应 Java description。
    /**
     * <strong>example:</strong>
     * <p>预计本地区将出现较强降水，请关注天气变化。</p>
     */
    @NameInMap("description")
    public String description;

    // 预警触发标准，对应 Java criteria，源未提供时可为空。
    /**
     * <strong>example:</strong>
     * <p>达到相应降水预警触发标准</p>
     */
    @NameInMap("criteria")
    public String criteria;

    public static WeatherAlert build(java.util.Map<String, ?> map) throws Exception {
        WeatherAlert self = new WeatherAlert();
        return TeaModel.build(map, self);
    }

    public WeatherAlert setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public WeatherAlert setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public WeatherAlert setAlertCode(String alertCode) {
        this.alertCode = alertCode;
        return this;
    }
    public String getAlertCode() {
        return this.alertCode;
    }

    public WeatherAlert setCertainty(String certainty) {
        this.certainty = certainty;
        return this;
    }
    public String getCertainty() {
        return this.certainty;
    }

    public WeatherAlert setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public WeatherAlert setOnsetTime(String onsetTime) {
        this.onsetTime = onsetTime;
        return this;
    }
    public String getOnsetTime() {
        return this.onsetTime;
    }

    public WeatherAlert setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public WeatherAlert setHeadline(String headline) {
        this.headline = headline;
        return this;
    }
    public String getHeadline() {
        return this.headline;
    }

    public WeatherAlert setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public WeatherAlert setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

}

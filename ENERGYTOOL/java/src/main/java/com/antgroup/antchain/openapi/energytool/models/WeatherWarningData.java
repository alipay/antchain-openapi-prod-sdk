// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class WeatherWarningData extends TeaModel {
    // 区县名
    /**
     * <strong>example:</strong>
     * <p>宜兴市</p>
     */
    @NameInMap("district")
    @Validation(required = true)
    public String district;

    // 预警级别
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("level")
    public String level;

    // 预警等级
    /**
     * <strong>example:</strong>
     * <p>Yellow</p>
     */
    @NameInMap("severity_color")
    public String severityColor;

    // 预警类型
    /**
     * <strong>example:</strong>
     * <p>other</p>
     */
    @NameInMap("type")
    public String type;

    // 发布时间
    /**
     * <strong>example:</strong>
     * <p>2026-01-01T01:54:00.000+00:00</p>
     */
    @NameInMap("pub_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String pubTime;

    // 预警开始时间
    /**
     * <strong>example:</strong>
     * <p>2026-01-01T01:54:00.000+00:00</p>
     */
    @NameInMap("warning_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String warningStartTime;

    // 预警结束时间
    /**
     * <strong>example:</strong>
     * <p>2026-01-01T01:54:00.000+00:00</p>
     */
    @NameInMap("warning_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String warningEndTime;

    // 标题
    /**
     * <strong>example:</strong>
     * <p>如东县气象台发布海区大风黄色预警</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 预警内容
    /**
     * <strong>example:</strong>
     * <p>受较强冷空气影响，预计1日夜里到2日白天我县海区将出现9级左右的偏北大风</p>
     */
    @NameInMap("content")
    public String content;

    public static WeatherWarningData build(java.util.Map<String, ?> map) throws Exception {
        WeatherWarningData self = new WeatherWarningData();
        return TeaModel.build(map, self);
    }

    public WeatherWarningData setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public WeatherWarningData setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public WeatherWarningData setSeverityColor(String severityColor) {
        this.severityColor = severityColor;
        return this;
    }
    public String getSeverityColor() {
        return this.severityColor;
    }

    public WeatherWarningData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WeatherWarningData setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public String getPubTime() {
        return this.pubTime;
    }

    public WeatherWarningData setWarningStartTime(String warningStartTime) {
        this.warningStartTime = warningStartTime;
        return this;
    }
    public String getWarningStartTime() {
        return this.warningStartTime;
    }

    public WeatherWarningData setWarningEndTime(String warningEndTime) {
        this.warningEndTime = warningEndTime;
        return this;
    }
    public String getWarningEndTime() {
        return this.warningEndTime;
    }

    public WeatherWarningData setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public WeatherWarningData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}

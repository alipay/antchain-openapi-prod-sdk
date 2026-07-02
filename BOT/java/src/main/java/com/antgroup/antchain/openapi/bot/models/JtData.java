// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtData extends TeaModel {
    // 数据的可信平台唯一ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("trustiot_id")
    @Validation(required = true)
    public Long trustiotId;

    // IoT可信平台设备唯一ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("trustiot_entity_id")
    @Validation(required = true)
    public Long trustiotEntityId;

    // 上报原文解析处理之后的数据
    /**
     * <strong>example:</strong>
     * <p>processed_content</p>
     */
    @NameInMap("processed_content")
    @Validation(required = true)
    public String processedContent;

    // 和上一次上报数据里程对比，新增的里程数
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("delta_mileage")
    public Long deltaMileage;

    // 正常位置信息：LOCATION
    // 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
    /**
     * <strong>example:</strong>
     * <p>数据标识</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 告警子类型
    // //ADAS
    // 10001: 前向碰撞报警
    // 10002: 车辆偏离报警
    // 10003: 车距过近报警
    // 10004: 行人碰撞报警
    // 10005: 频繁变道报警
    // 10006: 道路标识超限报警
    // 10007: 障碍物报警 //10008~10015 保留
    // 10016: 道路标志识别事件
    // 10017: 主动抓拍事件 //10018~10031 保留
    // //DSM
    // 10101: 疲劳驾驶报警
    // 10102: 接打电话报警
    // 10103: 抽烟报警报警
    // 10104: 分神驾驶报警
    // 10105: 驾驶员异常报警 //10106~10115 保留
    // 10116: 自动抓拍事件
    // 10117: 驾驶员变更事件 //10118~10031 保留
    // //加速度
    // 11701: 急加速
    // 11702: 急减速
    // 11703: 急转弯
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("alarm_sub_type")
    public Long alarmSubType;

    // 关联设备唯一ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("related_trust_entity_id")
    public String relatedTrustEntityId;

    // 日报日期
    /**
     * <strong>example:</strong>
     * <p>2023-12-01</p>
     */
    @NameInMap("report_date")
    public String reportDate;

    public static JtData build(java.util.Map<String, ?> map) throws Exception {
        JtData self = new JtData();
        return TeaModel.build(map, self);
    }

    public JtData setTrustiotId(Long trustiotId) {
        this.trustiotId = trustiotId;
        return this;
    }
    public Long getTrustiotId() {
        return this.trustiotId;
    }

    public JtData setTrustiotEntityId(Long trustiotEntityId) {
        this.trustiotEntityId = trustiotEntityId;
        return this;
    }
    public Long getTrustiotEntityId() {
        return this.trustiotEntityId;
    }

    public JtData setProcessedContent(String processedContent) {
        this.processedContent = processedContent;
        return this;
    }
    public String getProcessedContent() {
        return this.processedContent;
    }

    public JtData setDeltaMileage(Long deltaMileage) {
        this.deltaMileage = deltaMileage;
        return this;
    }
    public Long getDeltaMileage() {
        return this.deltaMileage;
    }

    public JtData setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public JtData setAlarmSubType(Long alarmSubType) {
        this.alarmSubType = alarmSubType;
        return this;
    }
    public Long getAlarmSubType() {
        return this.alarmSubType;
    }

    public JtData setRelatedTrustEntityId(String relatedTrustEntityId) {
        this.relatedTrustEntityId = relatedTrustEntityId;
        return this;
    }
    public String getRelatedTrustEntityId() {
        return this.relatedTrustEntityId;
    }

    public JtData setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

}

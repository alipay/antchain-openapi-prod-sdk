// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAlertList extends TeaModel {
    // 标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 告警事件ID
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 告警级别
    @NameInMap("severity")
    @Validation(required = true)
    public String severity;

    // 告警内容
    @NameInMap("alert_content")
    @Validation(required = true)
    public String alertContent;

    // 告警时间
    @NameInMap("gmt_occur_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtOccurTimestamp;

    // 相关链接
    @NameInMap("alarm_url")
    @Validation(required = true)
    public String alarmUrl;

    //      * HEALTHY(0), // 健康
    //      * PENDING(1), // 触发中
    //      * FIRING(2), // 告警中
    //      * SUSPENDED(3), // 已暂停
    //      * SILENCED(4), // 已静默
    //      * RECOVERED(5), // 已恢复
    // 
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static AppPortraitAlertList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAlertList self = new AppPortraitAlertList();
        return TeaModel.build(map, self);
    }

    public AppPortraitAlertList setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AppPortraitAlertList setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public AppPortraitAlertList setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppPortraitAlertList setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public AppPortraitAlertList setAlertContent(String alertContent) {
        this.alertContent = alertContent;
        return this;
    }
    public String getAlertContent() {
        return this.alertContent;
    }

    public AppPortraitAlertList setGmtOccurTimestamp(String gmtOccurTimestamp) {
        this.gmtOccurTimestamp = gmtOccurTimestamp;
        return this;
    }
    public String getGmtOccurTimestamp() {
        return this.gmtOccurTimestamp;
    }

    public AppPortraitAlertList setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
        return this;
    }
    public String getAlarmUrl() {
        return this.alarmUrl;
    }

    public AppPortraitAlertList setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}

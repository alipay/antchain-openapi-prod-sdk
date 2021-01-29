// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class NotificationConfig extends TeaModel {
    // 接收人列表
    @NameInMap("receivers")
    @Validation(required = true)
    public java.util.List<NotificationReceiver> receivers;

    // 类型
    @NameInMap("notification_type")
    @Validation(required = true)
    public String notificationType;

    // 是否开启，默认不开启
    @NameInMap("enabled")
    public Boolean enabled;

    // cloud_web_url
    @NameInMap("cloud_web_url")
    @Validation(required = true)
    public String cloudWebUrl;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static NotificationConfig build(java.util.Map<String, ?> map) throws Exception {
        NotificationConfig self = new NotificationConfig();
        return TeaModel.build(map, self);
    }

    public NotificationConfig setReceivers(java.util.List<NotificationReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<NotificationReceiver> getReceivers() {
        return this.receivers;
    }

    public NotificationConfig setNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }
    public String getNotificationType() {
        return this.notificationType;
    }

    public NotificationConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public NotificationConfig setCloudWebUrl(String cloudWebUrl) {
        this.cloudWebUrl = cloudWebUrl;
        return this;
    }
    public String getCloudWebUrl() {
        return this.cloudWebUrl;
    }

    public NotificationConfig setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

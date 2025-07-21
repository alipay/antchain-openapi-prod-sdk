// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RefuseInfo extends TeaModel {
    // 拒绝理由/终止备注
    /**
     * <strong>example:</strong>
     * <p>拒绝理由/终止备注</p>
     */
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 不予办理决定书路径/终止决定书路径
    /**
     * <strong>example:</strong>
     * <p>不予办理决定书路径/终止决定书路径</p>
     */
    @NameInMap("notification_path")
    @Validation(required = true)
    public String notificationPath;

    public static RefuseInfo build(java.util.Map<String, ?> map) throws Exception {
        RefuseInfo self = new RefuseInfo();
        return TeaModel.build(map, self);
    }

    public RefuseInfo setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RefuseInfo setNotificationPath(String notificationPath) {
        this.notificationPath = notificationPath;
        return this;
    }
    public String getNotificationPath() {
        return this.notificationPath;
    }

}

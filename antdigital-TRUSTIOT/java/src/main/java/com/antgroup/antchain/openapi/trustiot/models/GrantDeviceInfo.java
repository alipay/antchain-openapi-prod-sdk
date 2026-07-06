// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class GrantDeviceInfo extends TeaModel {
    // 授权ID
    /**
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 授权ID
    /**
     * <strong>example:</strong>
     * <p>m6XFxJeTpllXZQ3BEZCyhovWZjoiCqqW</p>
     */
    @NameInMap("auth_record_id")
    @Validation(required = true)
    public String authRecordId;

    public static GrantDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
        GrantDeviceInfo self = new GrantDeviceInfo();
        return TeaModel.build(map, self);
    }

    public GrantDeviceInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GrantDeviceInfo setAuthRecordId(String authRecordId) {
        this.authRecordId = authRecordId;
        return this;
    }
    public String getAuthRecordId() {
        return this.authRecordId;
    }

}

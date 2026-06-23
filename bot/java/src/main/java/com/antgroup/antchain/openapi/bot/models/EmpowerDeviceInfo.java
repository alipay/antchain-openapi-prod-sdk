// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EmpowerDeviceInfo extends TeaModel {
    // 设备ID
    /**
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // ACCEPTED(接受)/REVOKED(撤销)
    /**
     * <strong>example:</strong>
     * <p>ACCEPTED</p>
     */
    @NameInMap("auth_status")
    @Validation(required = true)
    public String authStatus;

    // 移除授权时间，毫秒级时间戳
    /**
     * <strong>example:</strong>
     * <p>1781690409</p>
     */
    @NameInMap("remove_time")
    public Long removeTime;

    public static EmpowerDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
        EmpowerDeviceInfo self = new EmpowerDeviceInfo();
        return TeaModel.build(map, self);
    }

    public EmpowerDeviceInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public EmpowerDeviceInfo setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public EmpowerDeviceInfo setRemoveTime(Long removeTime) {
        this.removeTime = removeTime;
        return this;
    }
    public Long getRemoveTime() {
        return this.removeTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OpenApiDeviceImportStatusItem extends TeaModel {
    // MAC输入
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // 现有设备记录业务ID
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // NOT_FOUND是查询未找到记录；其他三态原样映射AiDeviceStatusEnum；枚举:NOT_FOUND,REGISTERING,REGISTERED,REGISTER_FAILED
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static OpenApiDeviceImportStatusItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiDeviceImportStatusItem self = new OpenApiDeviceImportStatusItem();
        return TeaModel.build(map, self);
    }

    public OpenApiDeviceImportStatusItem setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public OpenApiDeviceImportStatusItem setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public OpenApiDeviceImportStatusItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

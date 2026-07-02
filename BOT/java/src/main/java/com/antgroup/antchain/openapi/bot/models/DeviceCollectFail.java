// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceCollectFail extends TeaModel {
    // 上链数据采集ID
    /**
     * <strong>example:</strong>
     * <p>81htq898</p>
     */
    @NameInMap("collect_id")
    @Validation(required = true)
    public String collectId;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>bad_param</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>参数错误</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static DeviceCollectFail build(java.util.Map<String, ?> map) throws Exception {
        DeviceCollectFail self = new DeviceCollectFail();
        return TeaModel.build(map, self);
    }

    public DeviceCollectFail setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

    public DeviceCollectFail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeviceCollectFail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

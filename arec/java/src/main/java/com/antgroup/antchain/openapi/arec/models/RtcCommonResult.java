// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class RtcCommonResult extends TeaModel {
    // 响应状态，包括值：S-成功，F-失败，已知的异常，U-未知，未知的异常或状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 结果码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回消息
    @NameInMap("message")
    public String message;

    public static RtcCommonResult build(java.util.Map<String, ?> map) throws Exception {
        RtcCommonResult self = new RtcCommonResult();
        return TeaModel.build(map, self);
    }

    public RtcCommonResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RtcCommonResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RtcCommonResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ResponseHead extends TeaModel {
    // 请求唯一标识
    /**
     * <strong>example:</strong>
     * <p>91440300892305861T</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static ResponseHead build(java.util.Map<String, ?> map) throws Exception {
        ResponseHead self = new ResponseHead();
        return TeaModel.build(map, self);
    }

    public ResponseHead setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

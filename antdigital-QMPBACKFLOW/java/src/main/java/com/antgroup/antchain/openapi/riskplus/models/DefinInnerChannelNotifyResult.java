// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DefinInnerChannelNotifyResult extends TeaModel {
    // 请求编号
    /**
     * <strong>example:</strong>
     * <p>aaaa</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务响应Json
    /**
     * <strong>example:</strong>
     * <p>{&quot;a&quot;:&quot;b&quot;}</p>
     */
    @NameInMap("biz_response")
    @Validation(required = true)
    public String bizResponse;

    public static DefinInnerChannelNotifyResult build(java.util.Map<String, ?> map) throws Exception {
        DefinInnerChannelNotifyResult self = new DefinInnerChannelNotifyResult();
        return TeaModel.build(map, self);
    }

    public DefinInnerChannelNotifyResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DefinInnerChannelNotifyResult setBizResponse(String bizResponse) {
        this.bizResponse = bizResponse;
        return this;
    }
    public String getBizResponse() {
        return this.bizResponse;
    }

}

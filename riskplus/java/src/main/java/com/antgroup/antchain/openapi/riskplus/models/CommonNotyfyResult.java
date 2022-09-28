// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CommonNotyfyResult extends TeaModel {
    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务响应Json
    @NameInMap("biz_response")
    @Validation(required = true)
    public String bizResponse;

    public static CommonNotyfyResult build(java.util.Map<String, ?> map) throws Exception {
        CommonNotyfyResult self = new CommonNotyfyResult();
        return TeaModel.build(map, self);
    }

    public CommonNotyfyResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommonNotyfyResult setBizResponse(String bizResponse) {
        this.bizResponse = bizResponse;
        return this;
    }
    public String getBizResponse() {
        return this.bizResponse;
    }

}

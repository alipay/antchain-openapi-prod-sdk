// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DescribeRmsTracetreeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // trace_id
    @NameInMap("trace_id")
    public String traceId;

    public static DescribeRmsTracetreeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRmsTracetreeRequest self = new DescribeRmsTracetreeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRmsTracetreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeRmsTracetreeRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}

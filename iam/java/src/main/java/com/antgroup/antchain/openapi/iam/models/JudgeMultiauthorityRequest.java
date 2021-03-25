// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeMultiauthorityRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 批量鉴权对象
    @NameInMap("batch_event")
    @Validation(required = true)
    public AuthenticateBatchEvent batchEvent;

    // 上下文信息
    @NameInMap("context")
    public String context;

    public static JudgeMultiauthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeMultiauthorityRequest self = new JudgeMultiauthorityRequest();
        return TeaModel.build(map, self);
    }

    public JudgeMultiauthorityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeMultiauthorityRequest setBatchEvent(AuthenticateBatchEvent batchEvent) {
        this.batchEvent = batchEvent;
        return this;
    }
    public AuthenticateBatchEvent getBatchEvent() {
        return this.batchEvent;
    }

    public JudgeMultiauthorityRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}

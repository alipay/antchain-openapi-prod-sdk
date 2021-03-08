// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeAliyunMultiauthorityRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 阿里云批量鉴权
    @NameInMap("batch_event")
    @Validation(required = true)
    public AliyunAuthenticateBatchEvent batchEvent;

    // 上下文信息
    @NameInMap("context")
    public String context;

    public static JudgeAliyunMultiauthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAliyunMultiauthorityRequest self = new JudgeAliyunMultiauthorityRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAliyunMultiauthorityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeAliyunMultiauthorityRequest setBatchEvent(AliyunAuthenticateBatchEvent batchEvent) {
        this.batchEvent = batchEvent;
        return this;
    }
    public AliyunAuthenticateBatchEvent getBatchEvent() {
        return this.batchEvent;
    }

    public JudgeAliyunMultiauthorityRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}

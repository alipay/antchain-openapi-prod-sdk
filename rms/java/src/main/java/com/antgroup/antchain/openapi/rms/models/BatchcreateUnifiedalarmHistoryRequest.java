// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateUnifiedalarmHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // json格式上下文信息
    @NameInMap("context")
    @Validation(required = true)
    public String context;

    public static BatchcreateUnifiedalarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateUnifiedalarmHistoryRequest self = new BatchcreateUnifiedalarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateUnifiedalarmHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateUnifiedalarmHistoryRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}

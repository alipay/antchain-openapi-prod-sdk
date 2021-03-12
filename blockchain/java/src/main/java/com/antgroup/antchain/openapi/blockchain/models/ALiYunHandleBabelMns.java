// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunHandleBabelMns extends TeaModel {
    // message
    @NameInMap("message")
    public String message;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    public static ALiYunHandleBabelMns build(java.util.Map<String, ?> map) throws Exception {
        ALiYunHandleBabelMns self = new ALiYunHandleBabelMns();
        return TeaModel.build(map, self);
    }

    public ALiYunHandleBabelMns setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ALiYunHandleBabelMns setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ALiYunHandleBabelMns setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

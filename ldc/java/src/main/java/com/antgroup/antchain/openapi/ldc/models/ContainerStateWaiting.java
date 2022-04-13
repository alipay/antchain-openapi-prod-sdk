// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerStateWaiting extends TeaModel {
    // message
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // reason
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    public static ContainerStateWaiting build(java.util.Map<String, ?> map) throws Exception {
        ContainerStateWaiting self = new ContainerStateWaiting();
        return TeaModel.build(map, self);
    }

    public ContainerStateWaiting setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContainerStateWaiting setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}

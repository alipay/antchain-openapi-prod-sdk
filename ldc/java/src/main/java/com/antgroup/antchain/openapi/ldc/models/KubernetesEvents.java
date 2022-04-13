// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class KubernetesEvents extends TeaModel {
    // 事件发生时间
    @NameInMap("creation_timestamp")
    @Validation(required = true)
    public String creationTimestamp;

    // 事件数目
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 事件内容
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static KubernetesEvents build(java.util.Map<String, ?> map) throws Exception {
        KubernetesEvents self = new KubernetesEvents();
        return TeaModel.build(map, self);
    }

    public KubernetesEvents setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public KubernetesEvents setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public KubernetesEvents setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

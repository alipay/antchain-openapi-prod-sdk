// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class KubeEvent extends TeaModel {
    // 事件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 发布次数
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 事件原因
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 事件内容
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 更新时间
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    public static KubeEvent build(java.util.Map<String, ?> map) throws Exception {
        KubeEvent self = new KubeEvent();
        return TeaModel.build(map, self);
    }

    public KubeEvent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public KubeEvent setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public KubeEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public KubeEvent setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public KubeEvent setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

}

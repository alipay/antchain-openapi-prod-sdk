// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class OrderResult extends TeaModel {
    // 实例Id
    @NameInMap("instance_id")
    @Validation(required = true, maxLength = 10)
    public String instanceId;

    // 是否生成成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static OrderResult build(java.util.Map<String, ?> map) throws Exception {
        OrderResult self = new OrderResult();
        return TeaModel.build(map, self);
    }

    public OrderResult setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OrderResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

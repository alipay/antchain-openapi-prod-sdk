// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OrderResult extends TeaModel {
    // 事例id
    /**
     * <strong>example:</strong>
     * <p>事例id</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
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

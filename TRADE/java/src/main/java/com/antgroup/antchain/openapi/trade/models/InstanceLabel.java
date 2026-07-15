// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class InstanceLabel extends TeaModel {
    // 标签名。
    // 传递isvId
    /**
     * <strong>example:</strong>
     * <p>isvId</p>
     */
    @NameInMap("instance_key")
    @Validation(required = true)
    public String instanceKey;

    // 标签值
    /**
     * <strong>example:</strong>
     * <p>邀请码</p>
     */
    @NameInMap("instance_value")
    @Validation(required = true)
    public String instanceValue;

    public static InstanceLabel build(java.util.Map<String, ?> map) throws Exception {
        InstanceLabel self = new InstanceLabel();
        return TeaModel.build(map, self);
    }

    public InstanceLabel setInstanceKey(String instanceKey) {
        this.instanceKey = instanceKey;
        return this;
    }
    public String getInstanceKey() {
        return this.instanceKey;
    }

    public InstanceLabel setInstanceValue(String instanceValue) {
        this.instanceValue = instanceValue;
        return this;
    }
    public String getInstanceValue() {
        return this.instanceValue;
    }

}

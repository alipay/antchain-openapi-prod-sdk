// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RobotCallCustomerParam extends TeaModel {
    // 手机号/手机号md5
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 用户维度透传字段
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("customer_out_info")
    public String customerOutInfo;

    // 外呼话术变量字段
    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("properties")
    public String properties;

    public static RobotCallCustomerParam build(java.util.Map<String, ?> map) throws Exception {
        RobotCallCustomerParam self = new RobotCallCustomerParam();
        return TeaModel.build(map, self);
    }

    public RobotCallCustomerParam setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public RobotCallCustomerParam setCustomerOutInfo(String customerOutInfo) {
        this.customerOutInfo = customerOutInfo;
        return this;
    }
    public String getCustomerOutInfo() {
        return this.customerOutInfo;
    }

    public RobotCallCustomerParam setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}

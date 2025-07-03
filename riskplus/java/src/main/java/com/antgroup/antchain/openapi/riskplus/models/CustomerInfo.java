// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomerInfo extends TeaModel {
    // 查询的用户凭证列表
    /**
     * <strong>example:</strong>
     * <p>15022321363</p>
     */
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 客户属性的额外信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;test_score&quot;: 22.0}</p>
     */
    @NameInMap("properties")
    public String properties;

    public static CustomerInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomerInfo self = new CustomerInfo();
        return TeaModel.build(map, self);
    }

    public CustomerInfo setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public CustomerInfo setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}

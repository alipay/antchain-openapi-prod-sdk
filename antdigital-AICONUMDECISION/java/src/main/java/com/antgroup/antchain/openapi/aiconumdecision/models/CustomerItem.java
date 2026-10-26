// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class CustomerItem extends TeaModel {
    // 客户业务键
    /**
     * <strong>example:</strong>
     * <p>客户业务键</p>
     */
    @NameInMap("biz_id")
    public String bizId;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>12233332222</p>
     */
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 业务属性
    /**
     * <strong>example:</strong>
     * <p>{&quot;姓名&quot;:&quot;张&quot;,&quot;customerId&quot;:&quot;Z3gnNptlEf7FyNGsD3o1mg&quot;,&quot;性别&quot;:&quot;1&quot;,&quot;issue&quot;:&quot;1&quot;,&quot;effectTime&quot;:&quot;1&quot;,&quot;price&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("biz_properties")
    public String bizProperties;

    public static CustomerItem build(java.util.Map<String, ?> map) throws Exception {
        CustomerItem self = new CustomerItem();
        return TeaModel.build(map, self);
    }

    public CustomerItem setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CustomerItem setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CustomerItem setBizProperties(String bizProperties) {
        this.bizProperties = bizProperties;
        return this;
    }
    public String getBizProperties() {
        return this.bizProperties;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcall.models;

import com.aliyun.tea.*;

public class Customer extends TeaModel {
    // 用户手机号
    /**
     * <strong>example:</strong>
     * <p>0571****5678</p>
     */
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 用户业务 ID，回执中透出，需保证唯一
    /**
     * <strong>example:</strong>
     * <p>12313156789654</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 扩展业务字段，可用于变量参数和回执透出 json格式字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;张三&quot;}</p>
     */
    @NameInMap("biz_properties")
    public String bizProperties;

    public static Customer build(java.util.Map<String, ?> map) throws Exception {
        Customer self = new Customer();
        return TeaModel.build(map, self);
    }

    public Customer setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Customer setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public Customer setBizProperties(String bizProperties) {
        this.bizProperties = bizProperties;
        return this;
    }
    public String getBizProperties() {
        return this.bizProperties;
    }

}

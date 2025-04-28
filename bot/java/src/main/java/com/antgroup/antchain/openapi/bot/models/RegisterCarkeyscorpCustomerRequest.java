// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterCarkeyscorpCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对应客户企业名称缩写
    @NameInMap("corp_value")
    @Validation(required = true)
    public String corpValue;

    // 企业全称
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 接入场景码 内部分配给客户
    @NameInMap("access_scene")
    @Validation(required = true)
    public String accessScene;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static RegisterCarkeyscorpCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCarkeyscorpCustomerRequest self = new RegisterCarkeyscorpCustomerRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCarkeyscorpCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterCarkeyscorpCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterCarkeyscorpCustomerRequest setCorpValue(String corpValue) {
        this.corpValue = corpValue;
        return this;
    }
    public String getCorpValue() {
        return this.corpValue;
    }

    public RegisterCarkeyscorpCustomerRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public RegisterCarkeyscorpCustomerRequest setAccessScene(String accessScene) {
        this.accessScene = accessScene;
        return this;
    }
    public String getAccessScene() {
        return this.accessScene;
    }

    public RegisterCarkeyscorpCustomerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

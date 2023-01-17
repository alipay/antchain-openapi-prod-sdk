// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateDataflowTransRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证主体信息，使用存证公钥加密
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 子业务ID，选填
    @NameInMap("sub_biz_id")
    public String subBizId;

    // 扩展属性信息，使用存证公钥加密，选填
    @NameInMap("properties")
    public String properties;

    public static CreateDataflowTransRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataflowTransRequest self = new CreateDataflowTransRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataflowTransRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataflowTransRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataflowTransRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public CreateDataflowTransRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public CreateDataflowTransRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}

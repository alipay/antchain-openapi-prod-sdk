// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateNotaryTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份识别信息
    @NameInMap("customer")
    @Validation(required = true)
    public Identity customer;

    // 接口调用者身份信息
    @NameInMap("entity")
    public Identity entity;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 业务子类型标识
    @NameInMap("sub_biz_id")
    public String subBizId;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    public static CreateNotaryTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotaryTokenRequest self = new CreateNotaryTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotaryTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNotaryTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNotaryTokenRequest setCustomer(Identity customer) {
        this.customer = customer;
        return this;
    }
    public Identity getCustomer() {
        return this.customer;
    }

    public CreateNotaryTokenRequest setEntity(Identity entity) {
        this.entity = entity;
        return this;
    }
    public Identity getEntity() {
        return this.entity;
    }

    public CreateNotaryTokenRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateNotaryTokenRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public CreateNotaryTokenRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInternalTransRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证关联实体（个人/企业）的身份识别信息
    @NameInMap("customer")
    @Validation(required = true)
    public Identity customer;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 业务子类型标识
    @NameInMap("sub_biz_id")
    public String subBizId;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    // 代理客户存证时，实际用户的租户ID
    @NameInMap("real_tenant")
    public String realTenant;

    public static CreateInternalTransRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInternalTransRequest self = new CreateInternalTransRequest();
        return TeaModel.build(map, self);
    }

    public CreateInternalTransRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInternalTransRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInternalTransRequest setCustomer(Identity customer) {
        this.customer = customer;
        return this;
    }
    public Identity getCustomer() {
        return this.customer;
    }

    public CreateInternalTransRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateInternalTransRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public CreateInternalTransRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateInternalTransRequest setRealTenant(String realTenant) {
        this.realTenant = realTenant;
        return this;
    }
    public String getRealTenant() {
        return this.realTenant;
    }

}

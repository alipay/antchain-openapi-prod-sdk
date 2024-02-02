// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class UpdateMeteringItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商业产品码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 计量域
    @NameInMap("metering_domain_code")
    @Validation(required = true)
    public String meteringDomainCode;

    // 计量项列表
    @NameInMap("item_rules")
    @Validation(required = true)
    public java.util.List<ItemRule> itemRules;

    public static UpdateMeteringItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeteringItemRequest self = new UpdateMeteringItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeteringItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeteringItemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeteringItemRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public UpdateMeteringItemRequest setMeteringDomainCode(String meteringDomainCode) {
        this.meteringDomainCode = meteringDomainCode;
        return this;
    }
    public String getMeteringDomainCode() {
        return this.meteringDomainCode;
    }

    public UpdateMeteringItemRequest setItemRules(java.util.List<ItemRule> itemRules) {
        this.itemRules = itemRules;
        return this;
    }
    public java.util.List<ItemRule> getItemRules() {
        return this.itemRules;
    }

}

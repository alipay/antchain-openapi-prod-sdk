// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PolicyCommodity extends TeaModel {
    // 政策id
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 商品名称
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 商品描述
    @NameInMap("commodity_desc")
    public String commodityDesc;

    public static PolicyCommodity build(java.util.Map<String, ?> map) throws Exception {
        PolicyCommodity self = new PolicyCommodity();
        return TeaModel.build(map, self);
    }

    public PolicyCommodity setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public PolicyCommodity setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PolicyCommodity setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public PolicyCommodity setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
        return this;
    }
    public String getCommodityDesc() {
        return this.commodityDesc;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class CommodityPolicyRelation extends TeaModel {
    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 政策ID
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    public static CommodityPolicyRelation build(java.util.Map<String, ?> map) throws Exception {
        CommodityPolicyRelation self = new CommodityPolicyRelation();
        return TeaModel.build(map, self);
    }

    public CommodityPolicyRelation setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CommodityPolicyRelation setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}

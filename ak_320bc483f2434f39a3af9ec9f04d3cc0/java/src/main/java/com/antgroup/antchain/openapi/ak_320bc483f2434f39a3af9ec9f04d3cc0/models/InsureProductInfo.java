// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class InsureProductInfo extends TeaModel {
    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 险种编码: 
    // ACCIDENT: 意外险
    // EMPLOYER: 雇主险
    @NameInMap("insurance_type_code")
    @Validation(required = true)
    public String insuranceTypeCode;

    // 推荐编码
    @NameInMap("recom_flow_no")
    public String recomFlowNo;

    // 最低价格（分）
    @NameInMap("premium")
    public Long premium;

    // 保额（分）
    @NameInMap("sum_insured")
    public Long sumInsured;

    public static InsureProductInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureProductInfo self = new InsureProductInfo();
        return TeaModel.build(map, self);
    }

    public InsureProductInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InsureProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public InsureProductInfo setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

    public InsureProductInfo setRecomFlowNo(String recomFlowNo) {
        this.recomFlowNo = recomFlowNo;
        return this;
    }
    public String getRecomFlowNo() {
        return this.recomFlowNo;
    }

    public InsureProductInfo setPremium(Long premium) {
        this.premium = premium;
        return this;
    }
    public Long getPremium() {
        return this.premium;
    }

    public InsureProductInfo setSumInsured(Long sumInsured) {
        this.sumInsured = sumInsured;
        return this;
    }
    public Long getSumInsured() {
        return this.sumInsured;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AddCommercialcoreSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 规格code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 售卖模式
    @NameInMap("sales_mode")
    @Validation(required = true)
    public String salesMode;

    // 主要付款方式
    @NameInMap("main_pay_method")
    @Validation(required = true)
    public String mainPayMethod;

    // 规格描述
    @NameInMap("spec_desc")
    public String specDesc;

    // 规格名称
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    // 定价计划
    @NameInMap("price_plan")
    @Validation(required = true)
    public PricePlanVO pricePlan;

    public static AddCommercialcoreSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCommercialcoreSpecRequest self = new AddCommercialcoreSpecRequest();
        return TeaModel.build(map, self);
    }

    public AddCommercialcoreSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddCommercialcoreSpecRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public AddCommercialcoreSpecRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddCommercialcoreSpecRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public AddCommercialcoreSpecRequest setSalesMode(String salesMode) {
        this.salesMode = salesMode;
        return this;
    }
    public String getSalesMode() {
        return this.salesMode;
    }

    public AddCommercialcoreSpecRequest setMainPayMethod(String mainPayMethod) {
        this.mainPayMethod = mainPayMethod;
        return this;
    }
    public String getMainPayMethod() {
        return this.mainPayMethod;
    }

    public AddCommercialcoreSpecRequest setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
        return this;
    }
    public String getSpecDesc() {
        return this.specDesc;
    }

    public AddCommercialcoreSpecRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public AddCommercialcoreSpecRequest setPricePlan(PricePlanVO pricePlan) {
        this.pricePlan = pricePlan;
        return this;
    }
    public PricePlanVO getPricePlan() {
        return this.pricePlan;
    }

}

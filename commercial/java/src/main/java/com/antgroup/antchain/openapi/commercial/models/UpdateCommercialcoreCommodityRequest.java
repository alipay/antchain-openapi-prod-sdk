// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class UpdateCommercialcoreCommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 商品名称
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 商品服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 商品来源
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 商品描述
    @NameInMap("desc")
    public String desc;

    public static UpdateCommercialcoreCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommercialcoreCommodityRequest self = new UpdateCommercialcoreCommodityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommercialcoreCommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCommercialcoreCommodityRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public UpdateCommercialcoreCommodityRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdateCommercialcoreCommodityRequest setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public UpdateCommercialcoreCommodityRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateCommercialcoreCommodityRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateCommercialcoreCommodityRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}

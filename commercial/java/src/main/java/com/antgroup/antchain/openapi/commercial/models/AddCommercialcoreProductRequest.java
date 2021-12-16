// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AddCommercialcoreProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品oxm类型
    @NameInMap("oxm_type")
    @Validation(required = true)
    public String oxmType;

    // 产品一级类目
    @NameInMap("l1_catalog_id")
    @Validation(required = true)
    public Long l1CatalogId;

    // 产品二级类目
    @NameInMap("l2_catalog_id")
    @Validation(required = true)
    public Long l2CatalogId;

    // 产品描述
    @NameInMap("desc")
    public String desc;

    public static AddCommercialcoreProductRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCommercialcoreProductRequest self = new AddCommercialcoreProductRequest();
        return TeaModel.build(map, self);
    }

    public AddCommercialcoreProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddCommercialcoreProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddCommercialcoreProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public AddCommercialcoreProductRequest setOxmType(String oxmType) {
        this.oxmType = oxmType;
        return this;
    }
    public String getOxmType() {
        return this.oxmType;
    }

    public AddCommercialcoreProductRequest setL1CatalogId(Long l1CatalogId) {
        this.l1CatalogId = l1CatalogId;
        return this;
    }
    public Long getL1CatalogId() {
        return this.l1CatalogId;
    }

    public AddCommercialcoreProductRequest setL2CatalogId(Long l2CatalogId) {
        this.l2CatalogId = l2CatalogId;
        return this;
    }
    public Long getL2CatalogId() {
        return this.l2CatalogId;
    }

    public AddCommercialcoreProductRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}

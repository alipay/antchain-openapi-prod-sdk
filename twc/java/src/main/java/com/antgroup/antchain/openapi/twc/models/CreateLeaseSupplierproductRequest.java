// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseSupplierproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 系统来源
    @NameInMap("origin")
    @Validation(required = true)
    public String origin;

    // 采购商品信息
    @NameInMap("product_info")
    @Validation(required = true)
    public SupplierProductItem productInfo;

    // 本阶段额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    public static CreateLeaseSupplierproductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseSupplierproductRequest self = new CreateLeaseSupplierproductRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseSupplierproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseSupplierproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseSupplierproductRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateLeaseSupplierproductRequest setProductInfo(SupplierProductItem productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public SupplierProductItem getProductInfo() {
        return this.productInfo;
    }

    public CreateLeaseSupplierproductRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}

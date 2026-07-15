// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitLeaseSupplierRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 供应商来源
    @NameInMap("origin")
    @Validation(required = true)
    public String origin;

    // 供应商信息
    @NameInMap("supplier")
    @Validation(required = true)
    public SupplierInfo supplier;

    // 额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    public static InitLeaseSupplierRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLeaseSupplierRequest self = new InitLeaseSupplierRequest();
        return TeaModel.build(map, self);
    }

    public InitLeaseSupplierRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitLeaseSupplierRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitLeaseSupplierRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public InitLeaseSupplierRequest setSupplier(SupplierInfo supplier) {
        this.supplier = supplier;
        return this;
    }
    public SupplierInfo getSupplier() {
        return this.supplier;
    }

    public InitLeaseSupplierRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}

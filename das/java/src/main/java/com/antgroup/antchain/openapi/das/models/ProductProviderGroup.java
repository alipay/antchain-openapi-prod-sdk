// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ProductProviderGroup extends TeaModel {
    // 产品供应商信息
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_provider_list")
    @Validation(required = true)
    public java.util.List<ProductProviderInfo> productProviderList;

    // 数据产品入参,JSON数组
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_param")
    @Validation(required = true)
    public String productParam;

    // C端展示授权内容code
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("auth_content_code")
    @Validation(required = true)
    public String authContentCode;

    public static ProductProviderGroup build(java.util.Map<String, ?> map) throws Exception {
        ProductProviderGroup self = new ProductProviderGroup();
        return TeaModel.build(map, self);
    }

    public ProductProviderGroup setProductProviderList(java.util.List<ProductProviderInfo> productProviderList) {
        this.productProviderList = productProviderList;
        return this;
    }
    public java.util.List<ProductProviderInfo> getProductProviderList() {
        return this.productProviderList;
    }

    public ProductProviderGroup setProductParam(String productParam) {
        this.productParam = productParam;
        return this;
    }
    public String getProductParam() {
        return this.productParam;
    }

    public ProductProviderGroup setAuthContentCode(String authContentCode) {
        this.authContentCode = authContentCode;
        return this;
    }
    public String getAuthContentCode() {
        return this.authContentCode;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ProductProviderInfo extends TeaModel {
    // 数据产品标识
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_identity_id")
    @Validation(required = true)
    public String productIdentityId;

    // 数据源企业code
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("source_enterprise_code")
    @Validation(required = true)
    public String sourceEnterpriseCode;

    // 数据源企业名称
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("source_enterprise_name")
    @Validation(required = true)
    public String sourceEnterpriseName;

    public static ProductProviderInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductProviderInfo self = new ProductProviderInfo();
        return TeaModel.build(map, self);
    }

    public ProductProviderInfo setProductIdentityId(String productIdentityId) {
        this.productIdentityId = productIdentityId;
        return this;
    }
    public String getProductIdentityId() {
        return this.productIdentityId;
    }

    public ProductProviderInfo setSourceEnterpriseCode(String sourceEnterpriseCode) {
        this.sourceEnterpriseCode = sourceEnterpriseCode;
        return this;
    }
    public String getSourceEnterpriseCode() {
        return this.sourceEnterpriseCode;
    }

    public ProductProviderInfo setSourceEnterpriseName(String sourceEnterpriseName) {
        this.sourceEnterpriseName = sourceEnterpriseName;
        return this;
    }
    public String getSourceEnterpriseName() {
        return this.sourceEnterpriseName;
    }

}

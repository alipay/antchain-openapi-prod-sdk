// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ProductCodeInfo extends TeaModel {
    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 场景码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 租户映射链上账户名称
    @NameInMap("account_name")
    public String accountName;

    // 租户映射账户链上账户ID
    @NameInMap("account_id")
    public String accountId;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static ProductCodeInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductCodeInfo self = new ProductCodeInfo();
        return TeaModel.build(map, self);
    }

    public ProductCodeInfo setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ProductCodeInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ProductCodeInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductCodeInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ProductCodeInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ProductCodeInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}

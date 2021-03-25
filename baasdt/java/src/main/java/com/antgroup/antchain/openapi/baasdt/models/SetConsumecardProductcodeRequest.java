// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetConsumecardProductcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要配置的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 场景码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 账户链上名称
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 账户链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static SetConsumecardProductcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumecardProductcodeRequest self = new SetConsumecardProductcodeRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumecardProductcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumecardProductcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumecardProductcodeRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public SetConsumecardProductcodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SetConsumecardProductcodeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SetConsumecardProductcodeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SetConsumecardProductcodeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetConsumecardProductcodeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AssetExtInfo extends TeaModel {
    // 发放账户余额
    @NameInMap("dispense_balance")
    @Validation(required = true)
    public String dispenseBalance;

    // 发放账户归属租户ID
    @NameInMap("dispense_tenant_id")
    @Validation(required = true)
    public String dispenseTenantId;

    // 用户账户余额
    @NameInMap("user_credit_balance")
    @Validation(required = true)
    public String userCreditBalance;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static AssetExtInfo build(java.util.Map<String, ?> map) throws Exception {
        AssetExtInfo self = new AssetExtInfo();
        return TeaModel.build(map, self);
    }

    public AssetExtInfo setDispenseBalance(String dispenseBalance) {
        this.dispenseBalance = dispenseBalance;
        return this;
    }
    public String getDispenseBalance() {
        return this.dispenseBalance;
    }

    public AssetExtInfo setDispenseTenantId(String dispenseTenantId) {
        this.dispenseTenantId = dispenseTenantId;
        return this;
    }
    public String getDispenseTenantId() {
        return this.dispenseTenantId;
    }

    public AssetExtInfo setUserCreditBalance(String userCreditBalance) {
        this.userCreditBalance = userCreditBalance;
        return this;
    }
    public String getUserCreditBalance() {
        return this.userCreditBalance;
    }

    public AssetExtInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

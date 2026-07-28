// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class ListBillInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 账单Id
    @NameInMap("charge_bill_id")
    @Validation(required = true)
    public String chargeBillId;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    public static ListBillInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBillInstanceRequest self = new ListBillInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListBillInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBillInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListBillInstanceRequest setChargeBillId(String chargeBillId) {
        this.chargeBillId = chargeBillId;
        return this;
    }
    public String getChargeBillId() {
        return this.chargeBillId;
    }

    public ListBillInstanceRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}

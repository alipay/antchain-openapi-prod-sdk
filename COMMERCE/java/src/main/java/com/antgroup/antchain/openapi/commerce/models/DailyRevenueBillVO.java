// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class DailyRevenueBillVO extends TeaModel {
    // 账单日期
    /**
     * <strong>example:</strong>
     * <p>20250101</p>
     */
    @NameInMap("bill_date")
    @Validation(required = true)
    public String billDate;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>A0MYTCZEBMHYNN1ZXEMO6KKIJ</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 账单金额，带币种信息
    /**
     * <strong>example:</strong>
     * <p>190</p>
     */
    @NameInMap("bill_amount")
    @Validation(required = true)
    public MultiCurrencyMoney billAmount;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>208812321321312</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static DailyRevenueBillVO build(java.util.Map<String, ?> map) throws Exception {
        DailyRevenueBillVO self = new DailyRevenueBillVO();
        return TeaModel.build(map, self);
    }

    public DailyRevenueBillVO setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public DailyRevenueBillVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DailyRevenueBillVO setBillAmount(MultiCurrencyMoney billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public MultiCurrencyMoney getBillAmount() {
        return this.billAmount;
    }

    public DailyRevenueBillVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

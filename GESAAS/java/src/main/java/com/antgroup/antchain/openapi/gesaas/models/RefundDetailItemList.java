// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class RefundDetailItemList extends TeaModel {
    // 退款退分账金额，单位为分
    /**
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("amount")
    public Long amount;

    // 退款退分账支出账号
    /**
     * <strong>example:</strong>
     * <p>2088101126765726</p>
     */
    @NameInMap("trans_out_account")
    public String transOutAccount;

    // 退款退分账转入账号
    /**
     * <strong>example:</strong>
     * <p>2088101126765726</p>
     */
    @NameInMap("trans_in_account")
    public String transInAccount;

    public static RefundDetailItemList build(java.util.Map<String, ?> map) throws Exception {
        RefundDetailItemList self = new RefundDetailItemList();
        return TeaModel.build(map, self);
    }

    public RefundDetailItemList setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RefundDetailItemList setTransOutAccount(String transOutAccount) {
        this.transOutAccount = transOutAccount;
        return this;
    }
    public String getTransOutAccount() {
        return this.transOutAccount;
    }

    public RefundDetailItemList setTransInAccount(String transInAccount) {
        this.transInAccount = transInAccount;
        return this;
    }
    public String getTransInAccount() {
        return this.transInAccount;
    }

}

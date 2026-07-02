// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RentBillItem extends TeaModel {
    // 租约分期ID
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("bill_item_id")
    @Validation(required = true)
    public String billItemId;

    // 租约分期名称
    /**
     * <strong>example:</strong>
     * <p>第几期</p>
     */
    @NameInMap("bill_item_name")
    public String billItemName;

    // 租期开始日期
    /**
     * <strong>example:</strong>
     * <p>2006-01-02 15:04:05</p>
     */
    @NameInMap("bill_item_begin")
    @Validation(required = true)
    public String billItemBegin;

    // 租期结束日期 
    /**
     * <strong>example:</strong>
     * <p>2006-02-02 15:04:05</p>
     */
    @NameInMap("bill_item_end")
    @Validation(required = true)
    public String billItemEnd;

    // 租约金额
    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("bill_item_money")
    @Validation(required = true)
    public String billItemMoney;

    // 租约支付状态
    /**
     * <strong>example:</strong>
     * <p>待支付，已支付，支付失败</p>
     */
    @NameInMap("payment_state")
    public String paymentState;

    public static RentBillItem build(java.util.Map<String, ?> map) throws Exception {
        RentBillItem self = new RentBillItem();
        return TeaModel.build(map, self);
    }

    public RentBillItem setBillItemId(String billItemId) {
        this.billItemId = billItemId;
        return this;
    }
    public String getBillItemId() {
        return this.billItemId;
    }

    public RentBillItem setBillItemName(String billItemName) {
        this.billItemName = billItemName;
        return this;
    }
    public String getBillItemName() {
        return this.billItemName;
    }

    public RentBillItem setBillItemBegin(String billItemBegin) {
        this.billItemBegin = billItemBegin;
        return this;
    }
    public String getBillItemBegin() {
        return this.billItemBegin;
    }

    public RentBillItem setBillItemEnd(String billItemEnd) {
        this.billItemEnd = billItemEnd;
        return this;
    }
    public String getBillItemEnd() {
        return this.billItemEnd;
    }

    public RentBillItem setBillItemMoney(String billItemMoney) {
        this.billItemMoney = billItemMoney;
        return this;
    }
    public String getBillItemMoney() {
        return this.billItemMoney;
    }

    public RentBillItem setPaymentState(String paymentState) {
        this.paymentState = paymentState;
        return this;
    }
    public String getPaymentState() {
        return this.paymentState;
    }

}

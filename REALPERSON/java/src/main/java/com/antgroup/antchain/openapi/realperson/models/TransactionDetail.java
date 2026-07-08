// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class TransactionDetail extends TeaModel {
    // 交易类型：RECHARGE 入金，TRANSFER 划拨 ，WITHDRAW 出金
    /**
     * <strong>example:</strong>
     * <p>RECHARGE</p>
     */
    @NameInMap("trans_type")
    public String transType;

    // 余额方向：CR-贷款（收入）/ DR-借款（支出）
    /**
     * <strong>example:</strong>
     * <p>CR</p>
     */
    @NameInMap("direction")
    public String direction;

    // 币种 CNY人民币
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("ccy")
    public String ccy;

    // 交易金额，单位：元，整数部分最长10位数，保留两位小数
    /**
     * <strong>example:</strong>
     * <p>1.11</p>
     */
    @NameInMap("amount")
    public String amount;

    // 交易后余额，单位：元，整数部分最长10位数，保留两位小数
    /**
     * <strong>example:</strong>
     * <p>2.22</p>
     */
    @NameInMap("after_amount")
    public String afterAmount;

    // 创建时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-01-15 09:10:11</p>
     */
    @NameInMap("creat_time")
    public String creatTime;

    // SHARE-分账
    // OFFSET_SHARE-差额分账
    // REFUND-退款
    // TRANSFER-转账
    // WITHDRAW-提现
    // CLEAR-资金清算
    // OTHER-其他
    // WITHDRAW_CANCEL-提现退回
    /**
     * <strong>example:</strong>
     * <p>SHARE</p>
     */
    @NameInMap("business_type")
    public String businessType;

    public static TransactionDetail build(java.util.Map<String, ?> map) throws Exception {
        TransactionDetail self = new TransactionDetail();
        return TeaModel.build(map, self);
    }

    public TransactionDetail setTransType(String transType) {
        this.transType = transType;
        return this;
    }
    public String getTransType() {
        return this.transType;
    }

    public TransactionDetail setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public TransactionDetail setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public TransactionDetail setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public TransactionDetail setAfterAmount(String afterAmount) {
        this.afterAmount = afterAmount;
        return this;
    }
    public String getAfterAmount() {
        return this.afterAmount;
    }

    public TransactionDetail setCreatTime(String creatTime) {
        this.creatTime = creatTime;
        return this;
    }
    public String getCreatTime() {
        return this.creatTime;
    }

    public TransactionDetail setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}

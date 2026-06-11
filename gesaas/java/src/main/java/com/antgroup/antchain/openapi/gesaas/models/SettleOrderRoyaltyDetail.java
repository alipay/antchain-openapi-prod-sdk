// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class SettleOrderRoyaltyDetail extends TeaModel {
    // 分账金额，单位：分
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("amount")
    public Long amount;

    // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
    /**
     * <strong>example:</strong>
     * <p>FAIL</p>
     */
    @NameInMap("state")
    public String state;

    // 分账执行时间
    /**
     * <strong>example:</strong>
     * <p>2021-07-30 12:00:00</p>
     */
    @NameInMap("execute_dt")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String executeDt;

    // 分账转出账号
    /**
     * <strong>example:</strong>
     * <p>2088111111111111</p>
     */
    @NameInMap("trans_out_account")
    public String transOutAccount;

    // 分账失败错误码，只在分账失败时返回
    /**
     * <strong>example:</strong>
     * <p>TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 分账错误描述信息
    /**
     * <strong>example:</strong>
     * <p>分账余额不足</p>
     */
    @NameInMap("error_desc")
    public String errorDesc;

    // 分账转入账号
    /**
     * <strong>example:</strong>
     * <p>2088111111111111</p>
     */
    @NameInMap("trans_in_account")
    public String transInAccount;

    public static SettleOrderRoyaltyDetail build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderRoyaltyDetail self = new SettleOrderRoyaltyDetail();
        return TeaModel.build(map, self);
    }

    public SettleOrderRoyaltyDetail setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public SettleOrderRoyaltyDetail setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SettleOrderRoyaltyDetail setExecuteDt(String executeDt) {
        this.executeDt = executeDt;
        return this;
    }
    public String getExecuteDt() {
        return this.executeDt;
    }

    public SettleOrderRoyaltyDetail setTransOutAccount(String transOutAccount) {
        this.transOutAccount = transOutAccount;
        return this;
    }
    public String getTransOutAccount() {
        return this.transOutAccount;
    }

    public SettleOrderRoyaltyDetail setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SettleOrderRoyaltyDetail setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SettleOrderRoyaltyDetail setTransInAccount(String transInAccount) {
        this.transInAccount = transInAccount;
        return this;
    }
    public String getTransInAccount() {
        return this.transInAccount;
    }

}

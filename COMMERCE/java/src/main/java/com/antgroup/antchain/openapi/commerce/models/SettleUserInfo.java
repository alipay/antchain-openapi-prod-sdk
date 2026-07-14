// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class SettleUserInfo extends TeaModel {
    // 结算用户ID
    /**
     * <strong>example:</strong>
     * <p>2088341141528186</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 付款方ID
    /**
     * <strong>example:</strong>
     * <p>2088341141528186</p>
     */
    @NameInMap("payer_id")
    public String payerId;

    // 付款方主体编码
    /**
     * <strong>example:</strong>
     * <p>Z80</p>
     */
    @NameInMap("payer_inst_code")
    public String payerInstCode;

    // 收款方用户ID
    /**
     * <strong>example:</strong>
     * <p>2088341141528186</p>
     */
    @NameInMap("payee_id")
    public String payeeId;

    // 收款方主体编码
    /**
     * <strong>example:</strong>
     * <p>Z80</p>
     */
    @NameInMap("payee_inst_code")
    public String payeeInstCode;

    // 付款渠道
    /**
     * <strong>example:</strong>
     * <p>ALIPAYACCOUNT（支付宝）、BANKCARD（银行卡）等</p>
     */
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    public static SettleUserInfo build(java.util.Map<String, ?> map) throws Exception {
        SettleUserInfo self = new SettleUserInfo();
        return TeaModel.build(map, self);
    }

    public SettleUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SettleUserInfo setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public SettleUserInfo setPayerInstCode(String payerInstCode) {
        this.payerInstCode = payerInstCode;
        return this;
    }
    public String getPayerInstCode() {
        return this.payerInstCode;
    }

    public SettleUserInfo setPayeeId(String payeeId) {
        this.payeeId = payeeId;
        return this;
    }
    public String getPayeeId() {
        return this.payeeId;
    }

    public SettleUserInfo setPayeeInstCode(String payeeInstCode) {
        this.payeeInstCode = payeeInstCode;
        return this;
    }
    public String getPayeeInstCode() {
        return this.payeeInstCode;
    }

    public SettleUserInfo setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

}

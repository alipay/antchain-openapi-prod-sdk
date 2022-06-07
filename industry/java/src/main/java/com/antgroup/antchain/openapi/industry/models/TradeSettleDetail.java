// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class TradeSettleDetail extends TeaModel {
    // 类型
    // replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 结算明细序列号，即结算请求中的业务单据号
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 转入账户
    @NameInMap("trans_in")
    public String transIn;

    // 转出账号
    @NameInMap("trans_out")
    @Validation(required = true)
    public String transOut;

    // 金额，元，最小支持到分
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    public static TradeSettleDetail build(java.util.Map<String, ?> map) throws Exception {
        TradeSettleDetail self = new TradeSettleDetail();
        return TeaModel.build(map, self);
    }

    public TradeSettleDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TradeSettleDetail setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public TradeSettleDetail setTransIn(String transIn) {
        this.transIn = transIn;
        return this;
    }
    public String getTransIn() {
        return this.transIn;
    }

    public TradeSettleDetail setTransOut(String transOut) {
        this.transOut = transOut;
        return this;
    }
    public String getTransOut() {
        return this.transOut;
    }

    public TradeSettleDetail setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}

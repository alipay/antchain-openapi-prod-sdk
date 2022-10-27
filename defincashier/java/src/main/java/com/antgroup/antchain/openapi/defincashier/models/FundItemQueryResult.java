// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class FundItemQueryResult extends TeaModel {
    // 会员所属业务平台在智能科技的会员ID
    @NameInMap("platform_member_id")
    @Validation(required = true)
    public String platformMemberId;

    // 外部业务平台原始交易号
    @NameInMap("out_order_id")
    @Validation(required = true)
    public String outOrderId;

    // 外部请求ID
    // 
    @NameInMap("out_request_id")
    public String outRequestId;

    // 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
    @NameInMap("fund_type")
    @Validation(required = true)
    public String fundType;

    // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
    @NameInMap("state")
    public String state;

    // 本次请求金额，单位为元。
    @NameInMap("request_amount")
    public Long requestAmount;

    // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
    @NameInMap("request_currency")
    public String requestCurrency;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static FundItemQueryResult build(java.util.Map<String, ?> map) throws Exception {
        FundItemQueryResult self = new FundItemQueryResult();
        return TeaModel.build(map, self);
    }

    public FundItemQueryResult setPlatformMemberId(String platformMemberId) {
        this.platformMemberId = platformMemberId;
        return this;
    }
    public String getPlatformMemberId() {
        return this.platformMemberId;
    }

    public FundItemQueryResult setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FundItemQueryResult setOutRequestId(String outRequestId) {
        this.outRequestId = outRequestId;
        return this;
    }
    public String getOutRequestId() {
        return this.outRequestId;
    }

    public FundItemQueryResult setFundType(String fundType) {
        this.fundType = fundType;
        return this;
    }
    public String getFundType() {
        return this.fundType;
    }

    public FundItemQueryResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public FundItemQueryResult setRequestAmount(Long requestAmount) {
        this.requestAmount = requestAmount;
        return this;
    }
    public Long getRequestAmount() {
        return this.requestAmount;
    }

    public FundItemQueryResult setRequestCurrency(String requestCurrency) {
        this.requestCurrency = requestCurrency;
        return this;
    }
    public String getRequestCurrency() {
        return this.requestCurrency;
    }

    public FundItemQueryResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public FundItemQueryResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}

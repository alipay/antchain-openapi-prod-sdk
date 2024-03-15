// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundFinanceloanresultsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // "ERROR": 放款同步异常
    // “SUCCESS":放款同步成功
    @NameInMap("loan_result")
    public String loanResult;

    public static SyncFundFinanceloanresultsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncFundFinanceloanresultsResponse self = new SyncFundFinanceloanresultsResponse();
        return TeaModel.build(map, self);
    }

    public SyncFundFinanceloanresultsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncFundFinanceloanresultsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncFundFinanceloanresultsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncFundFinanceloanresultsResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncFundFinanceloanresultsResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncFundFinanceloanresultsResponse setLoanResult(String loanResult) {
        this.loanResult = loanResult;
        return this;
    }
    public String getLoanResult() {
        return this.loanResult;
    }

}

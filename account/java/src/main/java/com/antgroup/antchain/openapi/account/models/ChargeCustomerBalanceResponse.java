// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class ChargeCustomerBalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 收银台URI
    @NameInMap("cashier_url")
    public String cashierUrl;

    public static ChargeCustomerBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ChargeCustomerBalanceResponse self = new ChargeCustomerBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ChargeCustomerBalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ChargeCustomerBalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChargeCustomerBalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ChargeCustomerBalanceResponse setCashierUrl(String cashierUrl) {
        this.cashierUrl = cashierUrl;
        return this;
    }
    public String getCashierUrl() {
        return this.cashierUrl;
    }

}

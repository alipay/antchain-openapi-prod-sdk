// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentBindResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约协议号
    @NameInMap("protocol_no")
    public String protocolNo;

    // 银行编码
    @NameInMap("bank_code")
    public String bankCode;

    // 银行卡号
    @NameInMap("bank_card")
    public String bankCard;

    // 用户id
    @NameInMap("user_id")
    public String userId;

    public static QueryCutpaymentBindResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentBindResponse self = new QueryCutpaymentBindResponse();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentBindResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCutpaymentBindResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCutpaymentBindResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCutpaymentBindResponse setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public QueryCutpaymentBindResponse setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public QueryCutpaymentBindResponse setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public QueryCutpaymentBindResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentOneclickResponse extends TeaModel {
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

    // 银行卡识别码
    @NameInMap("sgn_acc")
    public String sgnAcc;

    // 账户信息
    @NameInMap("acc_info")
    public AccInfo accInfo;

    // 银行编号
    @NameInMap("bank_code")
    public String bankCode;

    // 银行名称
    @NameInMap("bank_name")
    public String bankName;

    public static QueryCutpaymentOneclickResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentOneclickResponse self = new QueryCutpaymentOneclickResponse();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentOneclickResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCutpaymentOneclickResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCutpaymentOneclickResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCutpaymentOneclickResponse setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public QueryCutpaymentOneclickResponse setSgnAcc(String sgnAcc) {
        this.sgnAcc = sgnAcc;
        return this;
    }
    public String getSgnAcc() {
        return this.sgnAcc;
    }

    public QueryCutpaymentOneclickResponse setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
        return this;
    }
    public AccInfo getAccInfo() {
        return this.accInfo;
    }

    public QueryCutpaymentOneclickResponse setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public QueryCutpaymentOneclickResponse setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

}

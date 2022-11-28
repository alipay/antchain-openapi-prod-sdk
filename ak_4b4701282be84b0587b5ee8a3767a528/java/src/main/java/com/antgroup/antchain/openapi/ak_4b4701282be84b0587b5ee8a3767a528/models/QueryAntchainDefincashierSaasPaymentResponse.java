// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b4701282be84b0587b5ee8a3767a528.models;

import com.aliyun.tea.*;

public class QueryAntchainDefincashierSaasPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易查询结果
    @NameInMap("data")
    public PaymentQueryResult data;

    public static QueryAntchainDefincashierSaasPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDefincashierSaasPaymentResponse self = new QueryAntchainDefincashierSaasPaymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDefincashierSaasPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDefincashierSaasPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDefincashierSaasPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDefincashierSaasPaymentResponse setData(PaymentQueryResult data) {
        this.data = data;
        return this;
    }
    public PaymentQueryResult getData() {
        return this.data;
    }

}

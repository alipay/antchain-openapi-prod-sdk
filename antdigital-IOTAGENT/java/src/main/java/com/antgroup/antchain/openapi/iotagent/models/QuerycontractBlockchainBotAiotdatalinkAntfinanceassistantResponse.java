// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否已签约
    @NameInMap("agreement_signed")
    public Boolean agreementSigned;

    public static QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse self = new QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse();
        return TeaModel.build(map, self);
    }

    public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse setAgreementSigned(Boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
        return this;
    }
    public Boolean getAgreementSigned() {
        return this.agreementSigned;
    }

}

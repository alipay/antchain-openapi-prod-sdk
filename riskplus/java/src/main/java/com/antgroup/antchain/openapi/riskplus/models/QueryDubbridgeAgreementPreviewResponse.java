// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAgreementPreviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 协议列表
    @NameInMap("agreement_info_list")
    public java.util.List<GetAgreementUrlResponseData> agreementInfoList;

    public static QueryDubbridgeAgreementPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAgreementPreviewResponse self = new QueryDubbridgeAgreementPreviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAgreementPreviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAgreementPreviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAgreementPreviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAgreementPreviewResponse setAgreementInfoList(java.util.List<GetAgreementUrlResponseData> agreementInfoList) {
        this.agreementInfoList = agreementInfoList;
        return this;
    }
    public java.util.List<GetAgreementUrlResponseData> getAgreementInfoList() {
        return this.agreementInfoList;
    }

}

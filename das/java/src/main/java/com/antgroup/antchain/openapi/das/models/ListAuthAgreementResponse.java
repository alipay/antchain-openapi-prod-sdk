// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthAgreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 默认的授权协议列表
    @NameInMap("agreement_info_list")
    public java.util.List<Agreement> agreementInfoList;

    public static ListAuthAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthAgreementResponse self = new ListAuthAgreementResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthAgreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAuthAgreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAuthAgreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAuthAgreementResponse setAgreementInfoList(java.util.List<Agreement> agreementInfoList) {
        this.agreementInfoList = agreementInfoList;
        return this;
    }
    public java.util.List<Agreement> getAgreementInfoList() {
        return this.agreementInfoList;
    }

}

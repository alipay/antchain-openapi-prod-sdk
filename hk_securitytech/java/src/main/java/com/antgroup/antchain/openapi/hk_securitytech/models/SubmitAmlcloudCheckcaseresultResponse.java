// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAmlcloudCheckcaseresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务结果详情
    @NameInMap("case_details")
    public java.util.List<ZolozAlertTaskBO> caseDetails;

    public static SubmitAmlcloudCheckcaseresultResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAmlcloudCheckcaseresultResponse self = new SubmitAmlcloudCheckcaseresultResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAmlcloudCheckcaseresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAmlcloudCheckcaseresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAmlcloudCheckcaseresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAmlcloudCheckcaseresultResponse setCaseDetails(java.util.List<ZolozAlertTaskBO> caseDetails) {
        this.caseDetails = caseDetails;
        return this;
    }
    public java.util.List<ZolozAlertTaskBO> getCaseDetails() {
        return this.caseDetails;
    }

}

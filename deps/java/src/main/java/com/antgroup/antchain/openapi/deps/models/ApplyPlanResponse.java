// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ApplyPlanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 审批状态
    @NameInMap("approval_status")
    public String approvalStatus;

    // 审批详情页面地址
    @NameInMap("approval_url")
    public String approvalUrl;

    public static ApplyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPlanResponse self = new ApplyPlanResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyPlanResponse setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public ApplyPlanResponse setApprovalUrl(String approvalUrl) {
        this.approvalUrl = approvalUrl;
        return this;
    }
    public String getApprovalUrl() {
        return this.approvalUrl;
    }

}

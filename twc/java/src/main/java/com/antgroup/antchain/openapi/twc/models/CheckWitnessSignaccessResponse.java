// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckWitnessSignaccessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 有权限的印章id列表
    @NameInMap("access_seal_ids")
    public java.util.List<String> accessSealIds;

    // 审批数据
    @NameInMap("approval_datas")
    public java.util.List<WitnessApprovalData> approvalDatas;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 错误信息
    @NameInMap("message")
    public String message;

    // 签署票证
    @NameInMap("sign_ticket")
    public String signTicket;

    public static CheckWitnessSignaccessResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckWitnessSignaccessResponse self = new CheckWitnessSignaccessResponse();
        return TeaModel.build(map, self);
    }

    public CheckWitnessSignaccessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckWitnessSignaccessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckWitnessSignaccessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckWitnessSignaccessResponse setAccessSealIds(java.util.List<String> accessSealIds) {
        this.accessSealIds = accessSealIds;
        return this;
    }
    public java.util.List<String> getAccessSealIds() {
        return this.accessSealIds;
    }

    public CheckWitnessSignaccessResponse setApprovalDatas(java.util.List<WitnessApprovalData> approvalDatas) {
        this.approvalDatas = approvalDatas;
        return this;
    }
    public java.util.List<WitnessApprovalData> getApprovalDatas() {
        return this.approvalDatas;
    }

    public CheckWitnessSignaccessResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CheckWitnessSignaccessResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckWitnessSignaccessResponse setSignTicket(String signTicket) {
        this.signTicket = signTicket;
        return this;
    }
    public String getSignTicket() {
        return this.signTicket;
    }

}

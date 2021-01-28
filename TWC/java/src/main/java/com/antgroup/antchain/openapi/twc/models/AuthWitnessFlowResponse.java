// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AuthWitnessFlowResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 错误信息
    @NameInMap("message")
    public String message;

    // 二维码内容
    @NameInMap("qrcode_content")
    public String qrcodeContent;

    // 签署日志id，外部用户签署返回
    @NameInMap("signlog_id")
    public String signlogId;

    // 签名结果，外部用户签署返回
    @NameInMap("sign_result")
    public String signResult;

    // 签署结果，批量签署返回
    @NameInMap("sign_results")
    public java.util.List<WitnessSignResult> signResults;

    // 签署方式，1-单个签署，2-批量签署
    @NameInMap("sign_way")
    public Long signWay;

    // 手机盾用户签署返回
    @NameInMap("task_id")
    public String taskId;

    public static AuthWitnessFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthWitnessFlowResponse self = new AuthWitnessFlowResponse();
        return TeaModel.build(map, self);
    }

    public AuthWitnessFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthWitnessFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthWitnessFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthWitnessFlowResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AuthWitnessFlowResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthWitnessFlowResponse setQrcodeContent(String qrcodeContent) {
        this.qrcodeContent = qrcodeContent;
        return this;
    }
    public String getQrcodeContent() {
        return this.qrcodeContent;
    }

    public AuthWitnessFlowResponse setSignlogId(String signlogId) {
        this.signlogId = signlogId;
        return this;
    }
    public String getSignlogId() {
        return this.signlogId;
    }

    public AuthWitnessFlowResponse setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

    public AuthWitnessFlowResponse setSignResults(java.util.List<WitnessSignResult> signResults) {
        this.signResults = signResults;
        return this;
    }
    public java.util.List<WitnessSignResult> getSignResults() {
        return this.signResults;
    }

    public AuthWitnessFlowResponse setSignWay(Long signWay) {
        this.signWay = signWay;
        return this;
    }
    public Long getSignWay() {
        return this.signWay;
    }

    public AuthWitnessFlowResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

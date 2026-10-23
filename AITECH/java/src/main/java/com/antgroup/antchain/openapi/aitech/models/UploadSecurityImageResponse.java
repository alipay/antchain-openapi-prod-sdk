// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // PASS/BLOCK
    @NameInMap("action_code")
    public String actionCode;

    // 黑白库命中明细（18 字段）
    @NameInMap("image_black_white_result")
    public ImageBlackWhiteResult imageBlackWhiteResult;

    // token 用量（11 字段）
    @NameInMap("token_usage")
    public TokenUsageSummary tokenUsage;

    public static UploadSecurityImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityImageResponse self = new UploadSecurityImageResponse();
        return TeaModel.build(map, self);
    }

    public UploadSecurityImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadSecurityImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadSecurityImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadSecurityImageResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public UploadSecurityImageResponse setImageBlackWhiteResult(ImageBlackWhiteResult imageBlackWhiteResult) {
        this.imageBlackWhiteResult = imageBlackWhiteResult;
        return this;
    }
    public ImageBlackWhiteResult getImageBlackWhiteResult() {
        return this.imageBlackWhiteResult;
    }

    public UploadSecurityImageResponse setTokenUsage(TokenUsageSummary tokenUsage) {
        this.tokenUsage = tokenUsage;
        return this;
    }
    public TokenUsageSummary getTokenUsage() {
        return this.tokenUsage;
    }

}

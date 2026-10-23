// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityVideoResponse extends TeaModel {
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

    // token 用量（11 字段）
    @NameInMap("token_usage")
    public TokenUsageSummary tokenUsage;

    // 黑白库命中明细（18 字段）
    @NameInMap("image_black_white_result")
    public ImageBlackWhiteResult imageBlackWhiteResult;

    public static QuerySecurityVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityVideoResponse self = new QuerySecurityVideoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityVideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecurityVideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecurityVideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecurityVideoResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public QuerySecurityVideoResponse setTokenUsage(TokenUsageSummary tokenUsage) {
        this.tokenUsage = tokenUsage;
        return this;
    }
    public TokenUsageSummary getTokenUsage() {
        return this.tokenUsage;
    }

    public QuerySecurityVideoResponse setImageBlackWhiteResult(ImageBlackWhiteResult imageBlackWhiteResult) {
        this.imageBlackWhiteResult = imageBlackWhiteResult;
        return this;
    }
    public ImageBlackWhiteResult getImageBlackWhiteResult() {
        return this.imageBlackWhiteResult;
    }

}

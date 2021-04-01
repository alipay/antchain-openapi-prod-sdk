// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthClaimUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 待认证的业务id
    @NameInMap("biz_id")
    public String bizId;

    // 授权模版跳转url
    @NameInMap("claim_url")
    public String claimUrl;

    public static CreateAuthClaimUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthClaimUrlResponse self = new CreateAuthClaimUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthClaimUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAuthClaimUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAuthClaimUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAuthClaimUrlResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAuthClaimUrlResponse setClaimUrl(String claimUrl) {
        this.claimUrl = claimUrl;
        return this;
    }
    public String getClaimUrl() {
        return this.claimUrl;
    }

}

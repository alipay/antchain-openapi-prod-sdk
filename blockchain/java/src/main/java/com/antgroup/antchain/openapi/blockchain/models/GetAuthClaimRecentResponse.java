// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthClaimRecentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 声明的 id，status 为 “1” 时候非空
    @NameInMap("vc_id")
    public String vcId;

    // 可验证声明完成内容， status 为 “1” 时候非空
    @NameInMap("vc_content")
    public String vcContent;

    // 业务类型
    @NameInMap("biz_type")
    public String bizType;

    // vc状态 0:未授权 1:已授权 2: 拒绝授权 3: 授权已撤销
    @NameInMap("status")
    public Long status;

    // 授权是否可撤销
    @NameInMap("revocable")
    public Boolean revocable;

    // 过期时间
    @NameInMap("expire")
    public Long expire;

    public static GetAuthClaimRecentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthClaimRecentResponse self = new GetAuthClaimRecentResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthClaimRecentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAuthClaimRecentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAuthClaimRecentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAuthClaimRecentResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public GetAuthClaimRecentResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

    public GetAuthClaimRecentResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetAuthClaimRecentResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GetAuthClaimRecentResponse setRevocable(Boolean revocable) {
        this.revocable = revocable;
        return this;
    }
    public Boolean getRevocable() {
        return this.revocable;
    }

    public GetAuthClaimRecentResponse setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PullAuthClaimVcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，与请求中的biz_id一致方便业务方使用。
    @NameInMap("biz_id")
    public String bizId;

    // 具体的业务类型，长度不超过32字符，具体需要对接确定新增的业务类型。
    @NameInMap("biz_type")
    public String bizType;

    // 当前声明的状态说明：
    // 0：用户未授权
    // 1：用户授权成功，此时vc_content字段会包含授权后的声明内容
    // 101：业务方发起声明claim_content中的用户三要素（姓名，电话，身份证号），与目标用户真实的三要素匹配失败
    // 
    // 其它状态码，待定义后增加。
    @NameInMap("status")
    public String status;

    // 申请授权的用户did
    @NameInMap("user_did")
    public String userDid;

    // 如果status的值是“1”，则此字段就是用户授权成功后的声明（vc）的完整内容。
    @NameInMap("vc_content")
    public String vcContent;

    public static PullAuthClaimVcResponse build(java.util.Map<String, ?> map) throws Exception {
        PullAuthClaimVcResponse self = new PullAuthClaimVcResponse();
        return TeaModel.build(map, self);
    }

    public PullAuthClaimVcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullAuthClaimVcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullAuthClaimVcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullAuthClaimVcResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PullAuthClaimVcResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PullAuthClaimVcResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PullAuthClaimVcResponse setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public PullAuthClaimVcResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PullAuthWebpageVcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // C类用户实际授权发生的时间，GMT标准时间
    @NameInMap("gmt_auth_time")
    public Long gmtAuthTime;

    // 企业B类的唯一ID，对应的did在vc_content中的subject字段
    @NameInMap("pk_id")
    public String pkId;

    // 当前声明的状态说明： 0：用户未授权 1：用户授权成功，此时vc_content字段会包含授权后的声明内容 ，101：信息校验失败，其他授权错误码情况待明确
    @NameInMap("status")
    public String status;

    // 授权的可验证声明具体类型说明，有助于未来业务区分不同授权场景。
    @NameInMap("type")
    public String type;

    // C类用户的唯一ID，当前为通过姓名+身份证号组合计算哈希得到user_id = sha256(name+certNo)，对应的did在vc_content中的issuer字段
    @NameInMap("user_id")
    public String userId;

    // 如果status的值是“1”，则此字段就是用户授权成功后的声明（vc）的完整内容。
    @NameInMap("vc_content")
    public String vcContent;

    public static PullAuthWebpageVcResponse build(java.util.Map<String, ?> map) throws Exception {
        PullAuthWebpageVcResponse self = new PullAuthWebpageVcResponse();
        return TeaModel.build(map, self);
    }

    public PullAuthWebpageVcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullAuthWebpageVcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullAuthWebpageVcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullAuthWebpageVcResponse setGmtAuthTime(Long gmtAuthTime) {
        this.gmtAuthTime = gmtAuthTime;
        return this;
    }
    public Long getGmtAuthTime() {
        return this.gmtAuthTime;
    }

    public PullAuthWebpageVcResponse setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }
    public String getPkId() {
        return this.pkId;
    }

    public PullAuthWebpageVcResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PullAuthWebpageVcResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PullAuthWebpageVcResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PullAuthWebpageVcResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

}

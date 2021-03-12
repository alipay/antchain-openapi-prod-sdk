// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcAuthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 输入参数的bizId返回
    @NameInMap("biz_id")
    public String bizId;

    // 具体业务的类型说明，来自入参。
    @NameInMap("biz_type")
    public String bizType;

    // 本次可验证声明颁发者的DID
    @NameInMap("issuer_did")
    public String issuerDid;

    // 可验证声明的颁发状态说明： 0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
    @NameInMap("status")
    public String status;

    // 本次可验证声明目标者的DID
    @NameInMap("subject_did")
    public String subjectDid;

    // 可验证声明完整内容， status 为 “1” 时候非空
    @NameInMap("vc_content")
    public String vcContent;

    // 可验证声明的唯一标识id，status 为 “1” 时候非空
    @NameInMap("vc_id")
    public String vcId;

    public static StartAuthVcAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcAuthResponse self = new StartAuthVcAuthResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthVcAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthVcAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthVcAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthVcAuthResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVcAuthResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVcAuthResponse setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public StartAuthVcAuthResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StartAuthVcAuthResponse setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public StartAuthVcAuthResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

    public StartAuthVcAuthResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}

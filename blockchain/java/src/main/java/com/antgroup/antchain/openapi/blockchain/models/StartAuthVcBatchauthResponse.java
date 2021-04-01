// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcBatchauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    // 颁发的多个可验证声明结果列表。
    @NameInMap("vc_list")
    public java.util.List<VcContent> vcList;

    public static StartAuthVcBatchauthResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcBatchauthResponse self = new StartAuthVcBatchauthResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthVcBatchauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthVcBatchauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthVcBatchauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthVcBatchauthResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVcBatchauthResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVcBatchauthResponse setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public StartAuthVcBatchauthResponse setVcList(java.util.List<VcContent> vcList) {
        this.vcList = vcList;
        return this;
    }
    public java.util.List<VcContent> getVcList() {
        return this.vcList;
    }

}

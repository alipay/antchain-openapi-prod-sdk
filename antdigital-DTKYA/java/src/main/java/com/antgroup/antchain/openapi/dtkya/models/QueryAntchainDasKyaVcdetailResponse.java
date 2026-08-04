// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaVcdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // vcId
    @NameInMap("vc_id")
    public String vcId;

    // 签发方did
    @NameInMap("issuer_did")
    public String issuerDid;

    // 主体did
    @NameInMap("subject_did")
    public String subjectDid;

    // 凭证类型列表
    @NameInMap("vc_types")
    public java.util.List<String> vcTypes;

    // vc内容规范化摘要
    @NameInMap("vc_hash")
    public String vcHash;

    // 有效期起始时间
    @NameInMap("valid_from")
    public String validFrom;

    // 有效期终止时间
    @NameInMap("valid_until")
    public String validUntil;

    // vc内容正文
    @NameInMap("vc_content")
    public String vcContent;

    // vc状态
    @NameInMap("status")
    public String status;

    public static QueryAntchainDasKyaVcdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaVcdetailResponse self = new QueryAntchainDasKyaVcdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaVcdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaVcdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaVcdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaVcdetailResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAntchainDasKyaVcdetailResponse setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public QueryAntchainDasKyaVcdetailResponse setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public QueryAntchainDasKyaVcdetailResponse setVcTypes(java.util.List<String> vcTypes) {
        this.vcTypes = vcTypes;
        return this;
    }
    public java.util.List<String> getVcTypes() {
        return this.vcTypes;
    }

    public QueryAntchainDasKyaVcdetailResponse setVcHash(String vcHash) {
        this.vcHash = vcHash;
        return this;
    }
    public String getVcHash() {
        return this.vcHash;
    }

    public QueryAntchainDasKyaVcdetailResponse setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public QueryAntchainDasKyaVcdetailResponse setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public QueryAntchainDasKyaVcdetailResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

    public QueryAntchainDasKyaVcdetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

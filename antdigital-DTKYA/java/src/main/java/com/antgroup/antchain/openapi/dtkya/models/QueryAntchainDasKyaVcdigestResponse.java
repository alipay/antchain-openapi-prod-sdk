// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaVcdigestResponse extends TeaModel {
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

    // 发行者did
    @NameInMap("issuer_did")
    public String issuerDid;

    // 接受者did
    @NameInMap("subject_did")
    public String subjectDid;

    // vc类型
    @NameInMap("vc_types")
    public java.util.List<String> vcTypes;

    // vc内容哈希
    @NameInMap("vc_hash")
    public String vcHash;

    // 有效期起始时间
    @NameInMap("valid_from")
    public String validFrom;

    // 有效期终止时间
    @NameInMap("valid_until")
    public String validUntil;

    // VC状态
    @NameInMap("status")
    public String status;

    // 哈希算法
    @NameInMap("hash_spec")
    public String hashSpec;

    public static QueryAntchainDasKyaVcdigestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaVcdigestResponse self = new QueryAntchainDasKyaVcdigestResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaVcdigestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaVcdigestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaVcdigestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaVcdigestResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAntchainDasKyaVcdigestResponse setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public QueryAntchainDasKyaVcdigestResponse setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public QueryAntchainDasKyaVcdigestResponse setVcTypes(java.util.List<String> vcTypes) {
        this.vcTypes = vcTypes;
        return this;
    }
    public java.util.List<String> getVcTypes() {
        return this.vcTypes;
    }

    public QueryAntchainDasKyaVcdigestResponse setVcHash(String vcHash) {
        this.vcHash = vcHash;
        return this;
    }
    public String getVcHash() {
        return this.vcHash;
    }

    public QueryAntchainDasKyaVcdigestResponse setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public QueryAntchainDasKyaVcdigestResponse setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public QueryAntchainDasKyaVcdigestResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainDasKyaVcdigestResponse setHashSpec(String hashSpec) {
        this.hashSpec = hashSpec;
        return this;
    }
    public String getHashSpec() {
        return this.hashSpec;
    }

}

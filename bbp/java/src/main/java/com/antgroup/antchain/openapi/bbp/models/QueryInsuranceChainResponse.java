// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryInsuranceChainResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 保司编码
    @NameInMap("merchanism_code")
    public String merchanismCode;

    // 订单来源 TIANMAO
    @NameInMap("source")
    public String source;

    // 保险类型
    @NameInMap("insurace_type")
    public String insuraceType;

    // 保单加密信息（加密数据，由保司持有密钥）
    @NameInMap("insurance_context")
    public String insuranceContext;

    // 退保保单信息（加密数据，由保司持有密钥）
    @NameInMap("insurance_claim_context")
    public String insuranceClaimContext;

    // 保单理赔信息（加密数据，由保司持有密钥）
    @NameInMap("insurance_surrender_context")
    public String insuranceSurrenderContext;

    public static QueryInsuranceChainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceChainResponse self = new QueryInsuranceChainResponse();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceChainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInsuranceChainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInsuranceChainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInsuranceChainResponse setMerchanismCode(String merchanismCode) {
        this.merchanismCode = merchanismCode;
        return this;
    }
    public String getMerchanismCode() {
        return this.merchanismCode;
    }

    public QueryInsuranceChainResponse setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryInsuranceChainResponse setInsuraceType(String insuraceType) {
        this.insuraceType = insuraceType;
        return this;
    }
    public String getInsuraceType() {
        return this.insuraceType;
    }

    public QueryInsuranceChainResponse setInsuranceContext(String insuranceContext) {
        this.insuranceContext = insuranceContext;
        return this;
    }
    public String getInsuranceContext() {
        return this.insuranceContext;
    }

    public QueryInsuranceChainResponse setInsuranceClaimContext(String insuranceClaimContext) {
        this.insuranceClaimContext = insuranceClaimContext;
        return this;
    }
    public String getInsuranceClaimContext() {
        return this.insuranceClaimContext;
    }

    public QueryInsuranceChainResponse setInsuranceSurrenderContext(String insuranceSurrenderContext) {
        this.insuranceSurrenderContext = insuranceSurrenderContext;
        return this;
    }
    public String getInsuranceSurrenderContext() {
        return this.insuranceSurrenderContext;
    }

}

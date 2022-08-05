// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryEnterpriseBusinessinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签名之后的结果
    @NameInMap("signature")
    public String signature;

    // 国民经济行业代码
    @NameInMap("industry_code")
    public String industryCode;

    // 国民经济行业名称
    @NameInMap("industry_name")
    public String industryName;

    // 行业门类代码
    @NameInMap("industry_phy_code")
    public String industryPhyCode;

    // 行业门类名称
    @NameInMap("industry_phy_name")
    public String industryPhyName;

    public static QueryEnterpriseBusinessinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseBusinessinfoResponse self = new QueryEnterpriseBusinessinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseBusinessinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseBusinessinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseBusinessinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseBusinessinfoResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public QueryEnterpriseBusinessinfoResponse setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
        return this;
    }
    public String getIndustryCode() {
        return this.industryCode;
    }

    public QueryEnterpriseBusinessinfoResponse setIndustryName(String industryName) {
        this.industryName = industryName;
        return this;
    }
    public String getIndustryName() {
        return this.industryName;
    }

    public QueryEnterpriseBusinessinfoResponse setIndustryPhyCode(String industryPhyCode) {
        this.industryPhyCode = industryPhyCode;
        return this;
    }
    public String getIndustryPhyCode() {
        return this.industryPhyCode;
    }

    public QueryEnterpriseBusinessinfoResponse setIndustryPhyName(String industryPhyName) {
        this.industryPhyName = industryPhyName;
        return this;
    }
    public String getIndustryPhyName() {
        return this.industryPhyName;
    }

}

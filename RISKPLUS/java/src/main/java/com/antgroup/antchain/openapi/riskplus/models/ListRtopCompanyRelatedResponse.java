// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListRtopCompanyRelatedResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // node
    @NameInMap("companies")
    public java.util.List<RtopRiskGeneNode> companies;

    // 返回码
    // 
    @NameInMap("response_code")
    public String responseCode;

    // 是否调用成功
    // 
    @NameInMap("success")
    public Boolean success;

    public static ListRtopCompanyRelatedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRtopCompanyRelatedResponse self = new ListRtopCompanyRelatedResponse();
        return TeaModel.build(map, self);
    }

    public ListRtopCompanyRelatedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRtopCompanyRelatedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRtopCompanyRelatedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRtopCompanyRelatedResponse setCompanies(java.util.List<RtopRiskGeneNode> companies) {
        this.companies = companies;
        return this;
    }
    public java.util.List<RtopRiskGeneNode> getCompanies() {
        return this.companies;
    }

    public ListRtopCompanyRelatedResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public ListRtopCompanyRelatedResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

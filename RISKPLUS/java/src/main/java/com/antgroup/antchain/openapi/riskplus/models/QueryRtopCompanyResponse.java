// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 企业信息列表
    @NameInMap("company_infos")
    public java.util.List<CompanyInfo> companyInfos;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    public static QueryRtopCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyResponse self = new QueryRtopCompanyResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyResponse setCompanyInfos(java.util.List<CompanyInfo> companyInfos) {
        this.companyInfos = companyInfos;
        return this;
    }
    public java.util.List<CompanyInfo> getCompanyInfos() {
        return this.companyInfos;
    }

    public QueryRtopCompanyResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopCompanyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

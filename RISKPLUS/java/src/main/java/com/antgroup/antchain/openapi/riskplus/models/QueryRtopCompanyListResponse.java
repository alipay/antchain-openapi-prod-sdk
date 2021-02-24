// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyListResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 企业id列表
    @NameInMap("company_ids")
    public java.util.List<String> companyIds;

    // 返回码
    @NameInMap("response_code")
    public String responseCode;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // 总条数
    @NameInMap("total_num")
    public Long totalNum;

    public static QueryRtopCompanyListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyListResponse self = new QueryRtopCompanyListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyListResponse setCompanyIds(java.util.List<String> companyIds) {
        this.companyIds = companyIds;
        return this;
    }
    public java.util.List<String> getCompanyIds() {
        return this.companyIds;
    }

    public QueryRtopCompanyListResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopCompanyListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopCompanyListResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}

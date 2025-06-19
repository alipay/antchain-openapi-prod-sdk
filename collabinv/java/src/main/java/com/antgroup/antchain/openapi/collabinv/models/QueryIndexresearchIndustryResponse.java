// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchIndustryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 行业列表数据
    @NameInMap("industry_data")
    public java.util.List<String> industryData;

    public static QueryIndexresearchIndustryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchIndustryResponse self = new QueryIndexresearchIndustryResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchIndustryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIndexresearchIndustryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIndexresearchIndustryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIndexresearchIndustryResponse setIndustryData(java.util.List<String> industryData) {
        this.industryData = industryData;
        return this;
    }
    public java.util.List<String> getIndustryData() {
        return this.industryData;
    }

}

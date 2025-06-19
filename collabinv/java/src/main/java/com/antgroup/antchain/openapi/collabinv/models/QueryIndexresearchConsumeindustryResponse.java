// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchConsumeindustryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // 消费行业数据
    @NameInMap("industry_data")
    public java.util.List<IndustryData> industryData;

    public static QueryIndexresearchConsumeindustryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchConsumeindustryResponse self = new QueryIndexresearchConsumeindustryResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchConsumeindustryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIndexresearchConsumeindustryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIndexresearchConsumeindustryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIndexresearchConsumeindustryResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public QueryIndexresearchConsumeindustryResponse setIndustryData(java.util.List<IndustryData> industryData) {
        this.industryData = industryData;
        return this;
    }
    public java.util.List<IndustryData> getIndustryData() {
        return this.industryData;
    }

}

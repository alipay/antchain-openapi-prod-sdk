// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryAntsearchSearchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 统一响应元信息
    @NameInMap("response_metadata")
    public ResponseMetadata responseMetadata;

    // 本次的搜索结果
    @NameInMap("result")
    public Result result;

    // 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
    @NameInMap("industry_data")
    public java.util.List<IndustryDataItem> industryData;

    public static QueryAntsearchSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsearchSearchResponse self = new QueryAntsearchSearchResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsearchSearchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsearchSearchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsearchSearchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsearchSearchResponse setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }
    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public QueryAntsearchSearchResponse setResult(Result result) {
        this.result = result;
        return this;
    }
    public Result getResult() {
        return this.result;
    }

    public QueryAntsearchSearchResponse setIndustryData(java.util.List<IndustryDataItem> industryData) {
        this.industryData = industryData;
        return this;
    }
    public java.util.List<IndustryDataItem> getIndustryData() {
        return this.industryData;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryMarketSolutionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    @NameInMap("result_data")
    public java.util.List<KeyValuePair> resultData;

    public static QueryMarketSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketSolutionResponse self = new QueryMarketSolutionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMarketSolutionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMarketSolutionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMarketSolutionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMarketSolutionResponse setResultData(java.util.List<KeyValuePair> resultData) {
        this.resultData = resultData;
        return this;
    }
    public java.util.List<KeyValuePair> getResultData() {
        return this.resultData;
    }

}

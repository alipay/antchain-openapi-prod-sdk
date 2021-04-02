// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAnalysisResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分析数据，根据不同场景的不同json串
    @NameInMap("result_list")
    public java.util.List<String> resultList;

    public static QueryAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisResponse self = new QueryAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAnalysisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAnalysisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAnalysisResponse setResultList(java.util.List<String> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<String> getResultList() {
        return this.resultList;
    }

}

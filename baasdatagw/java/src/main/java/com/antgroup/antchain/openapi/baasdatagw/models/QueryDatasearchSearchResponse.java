// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryDatasearchSearchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求下一页的Request
    @NameInMap("context")
    public DataSearchRequest context;

    // 检索的结果
    @NameInMap("logs")
    public java.util.List<DataSearchResultResponseLog> logs;

    public static QueryDatasearchSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasearchSearchResponse self = new QueryDatasearchSearchResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasearchSearchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatasearchSearchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatasearchSearchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatasearchSearchResponse setContext(DataSearchRequest context) {
        this.context = context;
        return this;
    }
    public DataSearchRequest getContext() {
        return this.context;
    }

    public QueryDatasearchSearchResponse setLogs(java.util.List<DataSearchResultResponseLog> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DataSearchResultResponseLog> getLogs() {
        return this.logs;
    }

}

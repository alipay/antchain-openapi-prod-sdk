// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码
    @NameInMap("statucode")
    public String statucode;

    // 查询返回结果
    @NameInMap("query_result")
    public String queryResult;

    public static QueryTestContentTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypeResponse self = new QueryTestContentTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTestContentTypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTestContentTypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTestContentTypeResponse setStatucode(String statucode) {
        this.statucode = statucode;
        return this;
    }
    public String getStatucode() {
        return this.statucode;
    }

    public QueryTestContentTypeResponse setQueryResult(String queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public String getQueryResult() {
        return this.queryResult;
    }

}

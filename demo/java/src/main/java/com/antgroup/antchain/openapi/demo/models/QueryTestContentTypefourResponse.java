// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypefourResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询返回结果
    @NameInMap("query_result")
    public String queryResult;

    // 结果码
    @NameInMap("statucode")
    public String statucode;

    public static QueryTestContentTypefourResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypefourResponse self = new QueryTestContentTypefourResponse();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypefourResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTestContentTypefourResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTestContentTypefourResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTestContentTypefourResponse setQueryResult(String queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public String getQueryResult() {
        return this.queryResult;
    }

    public QueryTestContentTypefourResponse setStatucode(String statucode) {
        this.statucode = statucode;
        return this;
    }
    public String getStatucode() {
        return this.statucode;
    }

}

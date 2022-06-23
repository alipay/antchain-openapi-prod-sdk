// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbObtsZsearchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // zsearch查询结果
    @NameInMap("zsearch_result")
    public String zsearchResult;

    public static QueryRbbObtsZsearchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbObtsZsearchResponse self = new QueryRbbObtsZsearchResponse();
        return TeaModel.build(map, self);
    }

    public QueryRbbObtsZsearchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRbbObtsZsearchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRbbObtsZsearchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRbbObtsZsearchResponse setZsearchResult(String zsearchResult) {
        this.zsearchResult = zsearchResult;
        return this;
    }
    public String getZsearchResult() {
        return this.zsearchResult;
    }

}

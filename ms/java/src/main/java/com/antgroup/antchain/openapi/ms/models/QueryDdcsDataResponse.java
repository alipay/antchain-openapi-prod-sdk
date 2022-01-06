// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询推送值结果，数组中每一项表示具体的单元，DEFAULT_ZONE 表示所有单元。
    @NameInMap("query_result")
    public java.util.List<PublishDataItem> queryResult;

    public static QueryDdcsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsDataResponse self = new QueryDdcsDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDdcsDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDdcsDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDdcsDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDdcsDataResponse setQueryResult(java.util.List<PublishDataItem> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<PublishDataItem> getQueryResult() {
        return this.queryResult;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackGroupbytechstackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // count
    @NameInMap("count")
    public java.util.List<TechstackBuildpackCount> count;

    public static QueryBuildpackGroupbytechstackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackGroupbytechstackResponse self = new QueryBuildpackGroupbytechstackResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackGroupbytechstackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackGroupbytechstackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackGroupbytechstackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackGroupbytechstackResponse setCount(java.util.List<TechstackBuildpackCount> count) {
        this.count = count;
        return this;
    }
    public java.util.List<TechstackBuildpackCount> getCount() {
        return this.count;
    }

}

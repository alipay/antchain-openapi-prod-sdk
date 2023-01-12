// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBgreleaseArrangementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 蓝绿发布概览列表
    @NameInMap("arrangements")
    public java.util.List<String> arrangements;

    public static QueryBgreleaseArrangementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBgreleaseArrangementResponse self = new QueryBgreleaseArrangementResponse();
        return TeaModel.build(map, self);
    }

    public QueryBgreleaseArrangementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBgreleaseArrangementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBgreleaseArrangementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBgreleaseArrangementResponse setArrangements(java.util.List<String> arrangements) {
        this.arrangements = arrangements;
        return this;
    }
    public java.util.List<String> getArrangements() {
        return this.arrangements;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRfcOdpsLindormResponse extends TeaModel {
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
    @NameInMap("json_res")
    public String jsonRes;

    public static QueryRfcOdpsLindormResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRfcOdpsLindormResponse self = new QueryRfcOdpsLindormResponse();
        return TeaModel.build(map, self);
    }

    public QueryRfcOdpsLindormResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRfcOdpsLindormResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRfcOdpsLindormResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRfcOdpsLindormResponse setJsonRes(String jsonRes) {
        this.jsonRes = jsonRes;
        return this;
    }
    public String getJsonRes() {
        return this.jsonRes;
    }

}

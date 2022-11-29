// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryCjtestCjResResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 字符串
    @NameInMap("res")
    public String res;

    public static QueryCjtestCjResResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCjtestCjResResponse self = new QueryCjtestCjResResponse();
        return TeaModel.build(map, self);
    }

    public QueryCjtestCjResResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCjtestCjResResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCjtestCjResResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCjtestCjResResponse setRes(String res) {
        this.res = res;
        return this;
    }
    public String getRes() {
        return this.res;
    }

}

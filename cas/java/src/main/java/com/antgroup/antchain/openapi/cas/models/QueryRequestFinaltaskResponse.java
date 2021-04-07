// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryRequestFinaltaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<TaskVO> data;

    public static QueryRequestFinaltaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestFinaltaskResponse self = new QueryRequestFinaltaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRequestFinaltaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRequestFinaltaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRequestFinaltaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRequestFinaltaskResponse setData(java.util.List<TaskVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TaskVO> getData() {
        return this.data;
    }

}

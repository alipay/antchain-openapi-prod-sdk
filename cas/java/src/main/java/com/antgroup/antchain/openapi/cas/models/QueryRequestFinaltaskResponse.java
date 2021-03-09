// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryRequestFinaltaskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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

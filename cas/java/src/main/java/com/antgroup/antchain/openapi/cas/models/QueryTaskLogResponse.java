// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryTaskLogResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<ResourceLog> data;

    public static QueryTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskLogResponse self = new QueryTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskLogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTaskLogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTaskLogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTaskLogResponse setData(java.util.List<ResourceLog> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourceLog> getData() {
        return this.data;
    }

}

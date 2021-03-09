// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppserviceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用服务数组
    @NameInMap("data")
    public java.util.List<AppService> data;

    public static QueryAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceResponse self = new QueryAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppserviceResponse setData(java.util.List<AppService> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppService> getData() {
        return this.data;
    }

}

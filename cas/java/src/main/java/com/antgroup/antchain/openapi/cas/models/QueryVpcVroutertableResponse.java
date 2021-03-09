// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryVpcVroutertableResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 	
    // 路由表的详细信息。
    @NameInMap("data")
    public java.util.List<RouteTable> data;

    public static QueryVpcVroutertableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVpcVroutertableResponse self = new QueryVpcVroutertableResponse();
        return TeaModel.build(map, self);
    }

    public QueryVpcVroutertableResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVpcVroutertableResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVpcVroutertableResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVpcVroutertableResponse setData(java.util.List<RouteTable> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RouteTable> getData() {
        return this.data;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryVpcResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // vpc detail info
    @NameInMap("data")
    public VpcVO data;

    public static QueryVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVpcResponse self = new QueryVpcResponse();
        return TeaModel.build(map, self);
    }

    public QueryVpcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVpcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVpcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVpcResponse setData(VpcVO data) {
        this.data = data;
        return this;
    }
    public VpcVO getData() {
        return this.data;
    }

}

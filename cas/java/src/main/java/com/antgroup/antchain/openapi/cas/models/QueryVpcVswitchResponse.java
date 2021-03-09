// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryVpcVswitchResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // vswitch detail infos
    @NameInMap("data")
    public java.util.List<VSwitchVO> data;

    public static QueryVpcVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVpcVswitchResponse self = new QueryVpcVswitchResponse();
        return TeaModel.build(map, self);
    }

    public QueryVpcVswitchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVpcVswitchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVpcVswitchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVpcVswitchResponse setData(java.util.List<VSwitchVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VSwitchVO> getData() {
        return this.data;
    }

}

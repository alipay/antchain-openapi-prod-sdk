// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigGlobalResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 获取到的全局参数
    @NameInMap("data")
    public GlobalParam data;

    public static GetConfigGlobalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigGlobalResponse self = new GetConfigGlobalResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigGlobalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConfigGlobalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConfigGlobalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConfigGlobalResponse setData(GlobalParam data) {
        this.data = data;
        return this;
    }
    public GlobalParam getData() {
        return this.data;
    }

}

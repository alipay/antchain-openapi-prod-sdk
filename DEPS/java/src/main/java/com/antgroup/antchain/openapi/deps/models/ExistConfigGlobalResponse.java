// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistConfigGlobalResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用参数是否已存在的数组，和入参顺序一一对应
    @NameInMap("data")
    public java.util.List<Boolean> data;

    public static ExistConfigGlobalResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistConfigGlobalResponse self = new ExistConfigGlobalResponse();
        return TeaModel.build(map, self);
    }

    public ExistConfigGlobalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExistConfigGlobalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExistConfigGlobalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExistConfigGlobalResponse setData(java.util.List<Boolean> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Boolean> getData() {
        return this.data;
    }

}

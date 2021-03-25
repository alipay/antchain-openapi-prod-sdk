// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistBuildpackResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public Boolean result;

    public static ExistBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistBuildpackResponse self = new ExistBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public ExistBuildpackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExistBuildpackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExistBuildpackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExistBuildpackResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateBuildpackUpdatepackagesstatusResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public Long result;

    public static UpdateBuildpackUpdatepackagesstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpackUpdatepackagesstatusResponse self = new UpdateBuildpackUpdatepackagesstatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpackUpdatepackagesstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBuildpackUpdatepackagesstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBuildpackUpdatepackagesstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBuildpackUpdatepackagesstatusResponse setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}

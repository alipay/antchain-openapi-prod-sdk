// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SaveAppbaselineSidecarResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用基线ID
    @NameInMap("appbaseline_id")
    public String appbaselineId;

    public static SaveAppbaselineSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAppbaselineSidecarResponse self = new SaveAppbaselineSidecarResponse();
        return TeaModel.build(map, self);
    }

    public SaveAppbaselineSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveAppbaselineSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveAppbaselineSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveAppbaselineSidecarResponse setAppbaselineId(String appbaselineId) {
        this.appbaselineId = appbaselineId;
        return this;
    }
    public String getAppbaselineId() {
        return this.appbaselineId;
    }

}

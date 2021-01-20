// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppbaselineSidecarResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用基线ID
    @NameInMap("appbaseline_id")
    public String appbaselineId;

    public static CreateAppbaselineSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppbaselineSidecarResponse self = new CreateAppbaselineSidecarResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppbaselineSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAppbaselineSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAppbaselineSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAppbaselineSidecarResponse setAppbaselineId(String appbaselineId) {
        this.appbaselineId = appbaselineId;
        return this;
    }
    public String getAppbaselineId() {
        return this.appbaselineId;
    }

}

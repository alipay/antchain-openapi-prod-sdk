// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckCloudconfigXdclbforbiddenResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否禁用
    @NameInMap("forbidden")
    public Boolean forbidden;

    public static CheckCloudconfigXdclbforbiddenResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudconfigXdclbforbiddenResponse self = new CheckCloudconfigXdclbforbiddenResponse();
        return TeaModel.build(map, self);
    }

    public CheckCloudconfigXdclbforbiddenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckCloudconfigXdclbforbiddenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckCloudconfigXdclbforbiddenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckCloudconfigXdclbforbiddenResponse setForbidden(Boolean forbidden) {
        this.forbidden = forbidden;
        return this;
    }
    public Boolean getForbidden() {
        return this.forbidden;
    }

}

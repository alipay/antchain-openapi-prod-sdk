// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanaceSecurityipResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static UpdateLoadbalanaceSecurityipResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanaceSecurityipResponse self = new UpdateLoadbalanaceSecurityipResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanaceSecurityipResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateLoadbalanaceSecurityipResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLoadbalanaceSecurityipResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanceAccesscontrolResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static UpdateLoadbalanceAccesscontrolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanceAccesscontrolResponse self = new UpdateLoadbalanceAccesscontrolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanceAccesscontrolResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateLoadbalanceAccesscontrolResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLoadbalanceAccesscontrolResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}

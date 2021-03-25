// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipServiceArrangementResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // service
    @NameInMap("service")
    public String service;

    public static SkipServiceArrangementResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipServiceArrangementResponse self = new SkipServiceArrangementResponse();
        return TeaModel.build(map, self);
    }

    public SkipServiceArrangementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SkipServiceArrangementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SkipServiceArrangementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SkipServiceArrangementResponse setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}

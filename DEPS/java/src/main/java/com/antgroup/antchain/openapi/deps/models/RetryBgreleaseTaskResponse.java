// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryBgreleaseTaskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 概览
    @NameInMap("arrangement")
    public String arrangement;

    public static RetryBgreleaseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryBgreleaseTaskResponse self = new RetryBgreleaseTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryBgreleaseTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetryBgreleaseTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryBgreleaseTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetryBgreleaseTaskResponse setArrangement(String arrangement) {
        this.arrangement = arrangement;
        return this;
    }
    public String getArrangement() {
        return this.arrangement;
    }

}

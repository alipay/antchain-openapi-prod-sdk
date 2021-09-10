// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class UpdateAcfeewebStateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功、失败
    @NameInMap("sync_result")
    public Boolean syncResult;

    public static UpdateAcfeewebStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcfeewebStateResponse self = new UpdateAcfeewebStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAcfeewebStateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateAcfeewebStateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateAcfeewebStateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateAcfeewebStateResponse setSyncResult(Boolean syncResult) {
        this.syncResult = syncResult;
        return this;
    }
    public Boolean getSyncResult() {
        return this.syncResult;
    }

}

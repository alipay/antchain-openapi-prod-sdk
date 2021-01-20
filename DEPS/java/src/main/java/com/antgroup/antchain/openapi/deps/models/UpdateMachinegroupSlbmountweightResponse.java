// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateMachinegroupSlbmountweightResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 请求 ID，用于追踪后续结果
    @NameInMap("request_ids")
    public java.util.List<String> requestIds;

    public static UpdateMachinegroupSlbmountweightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachinegroupSlbmountweightResponse self = new UpdateMachinegroupSlbmountweightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMachinegroupSlbmountweightResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateMachinegroupSlbmountweightResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMachinegroupSlbmountweightResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateMachinegroupSlbmountweightResponse setRequestIds(java.util.List<String> requestIds) {
        this.requestIds = requestIds;
        return this;
    }
    public java.util.List<String> getRequestIds() {
        return this.requestIds;
    }

}

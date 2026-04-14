// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcall.models;

import com.aliyun.tea.*;

public class ImportAntcloudDtcallagentDispatcherOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求唯一 ID
    @NameInMap("request_id")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static ImportAntcloudDtcallagentDispatcherOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAntcloudDtcallagentDispatcherOrderResponse self = new ImportAntcloudDtcallagentDispatcherOrderResponse();
        return TeaModel.build(map, self);
    }

    public ImportAntcloudDtcallagentDispatcherOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportAntcloudDtcallagentDispatcherOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportAntcloudDtcallagentDispatcherOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportAntcloudDtcallagentDispatcherOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportAntcloudDtcallagentDispatcherOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

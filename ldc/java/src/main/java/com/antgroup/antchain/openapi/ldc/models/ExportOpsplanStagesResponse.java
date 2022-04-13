// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExportOpsplanStagesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 计算的分批结果，包含各批次及其Pods
    @NameInMap("batches")
    public java.util.List<ReleaseBatchObj> batches;

    public static ExportOpsplanStagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportOpsplanStagesResponse self = new ExportOpsplanStagesResponse();
        return TeaModel.build(map, self);
    }

    public ExportOpsplanStagesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExportOpsplanStagesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportOpsplanStagesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExportOpsplanStagesResponse setBatches(java.util.List<ReleaseBatchObj> batches) {
        this.batches = batches;
        return this;
    }
    public java.util.List<ReleaseBatchObj> getBatches() {
        return this.batches;
    }

}

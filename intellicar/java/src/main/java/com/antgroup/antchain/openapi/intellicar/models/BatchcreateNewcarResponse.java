// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class BatchcreateNewcarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批量提交结果
    @NameInMap("batch_submit_car_result")
    public java.util.List<BatchSubmitCarResult> batchSubmitCarResult;

    public static BatchcreateNewcarResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateNewcarResponse self = new BatchcreateNewcarResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateNewcarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateNewcarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateNewcarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateNewcarResponse setBatchSubmitCarResult(java.util.List<BatchSubmitCarResult> batchSubmitCarResult) {
        this.batchSubmitCarResult = batchSubmitCarResult;
        return this;
    }
    public java.util.List<BatchSubmitCarResult> getBatchSubmitCarResult() {
        return this.batchSubmitCarResult;
    }

}

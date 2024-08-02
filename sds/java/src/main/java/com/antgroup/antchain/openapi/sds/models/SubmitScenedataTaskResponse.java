// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class SubmitScenedataTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建任务成功后，返回批次号
    @NameInMap("batch_no")
    public String batchNo;

    public static SubmitScenedataTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitScenedataTaskResponse self = new SubmitScenedataTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitScenedataTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitScenedataTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitScenedataTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitScenedataTaskResponse setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

}

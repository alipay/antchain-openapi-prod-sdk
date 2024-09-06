// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class CreateAntdigitalMediasmsBatchSendResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批量任务id
    @NameInMap("data")
    public BatchSendTaskData data;

    public static CreateAntdigitalMediasmsBatchSendResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalMediasmsBatchSendResponse self = new CreateAntdigitalMediasmsBatchSendResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalMediasmsBatchSendResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntdigitalMediasmsBatchSendResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntdigitalMediasmsBatchSendResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntdigitalMediasmsBatchSendResponse setData(BatchSendTaskData data) {
        this.data = data;
        return this;
    }
    public BatchSendTaskData getData() {
        return this.data;
    }

}

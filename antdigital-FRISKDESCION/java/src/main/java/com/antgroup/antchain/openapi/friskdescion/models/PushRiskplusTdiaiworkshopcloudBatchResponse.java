// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.friskdescion.models;

import com.aliyun.tea.*;

public class PushRiskplusTdiaiworkshopcloudBatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批量请求响应结果
    @NameInMap("sample_id_list")
    public java.util.List<ResItem> sampleIdList;

    public static PushRiskplusTdiaiworkshopcloudBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRiskplusTdiaiworkshopcloudBatchResponse self = new PushRiskplusTdiaiworkshopcloudBatchResponse();
        return TeaModel.build(map, self);
    }

    public PushRiskplusTdiaiworkshopcloudBatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushRiskplusTdiaiworkshopcloudBatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushRiskplusTdiaiworkshopcloudBatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushRiskplusTdiaiworkshopcloudBatchResponse setSampleIdList(java.util.List<ResItem> sampleIdList) {
        this.sampleIdList = sampleIdList;
        return this;
    }
    public java.util.List<ResItem> getSampleIdList() {
        return this.sampleIdList;
    }

}

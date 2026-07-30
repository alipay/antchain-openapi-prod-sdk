// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushTdiaiworkshopcloudBatchResponse extends TeaModel {
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

    public static PushTdiaiworkshopcloudBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        PushTdiaiworkshopcloudBatchResponse self = new PushTdiaiworkshopcloudBatchResponse();
        return TeaModel.build(map, self);
    }

    public PushTdiaiworkshopcloudBatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushTdiaiworkshopcloudBatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushTdiaiworkshopcloudBatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushTdiaiworkshopcloudBatchResponse setSampleIdList(java.util.List<ResItem> sampleIdList) {
        this.sampleIdList = sampleIdList;
        return this;
    }
    public java.util.List<ResItem> getSampleIdList() {
        return this.sampleIdList;
    }

}

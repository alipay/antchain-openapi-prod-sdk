// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetRmsTracespanqueryconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支持的tags列表
    @NameInMap("tag_configs")
    public java.util.List<TraceSpanSearchTagConfig> tagConfigs;

    public static GetRmsTracespanqueryconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRmsTracespanqueryconfigResponse self = new GetRmsTracespanqueryconfigResponse();
        return TeaModel.build(map, self);
    }

    public GetRmsTracespanqueryconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRmsTracespanqueryconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRmsTracespanqueryconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRmsTracespanqueryconfigResponse setTagConfigs(java.util.List<TraceSpanSearchTagConfig> tagConfigs) {
        this.tagConfigs = tagConfigs;
        return this;
    }
    public java.util.List<TraceSpanSearchTagConfig> getTagConfigs() {
        return this.tagConfigs;
    }

}

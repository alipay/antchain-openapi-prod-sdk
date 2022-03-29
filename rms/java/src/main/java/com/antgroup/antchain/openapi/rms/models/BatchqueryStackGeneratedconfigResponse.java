// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryStackGeneratedconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 技术栈配置列表
    @NameInMap("generated_configs")
    public java.util.List<StackGeneratedConfig> generatedConfigs;

    public static BatchqueryStackGeneratedconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryStackGeneratedconfigResponse self = new BatchqueryStackGeneratedconfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryStackGeneratedconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryStackGeneratedconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryStackGeneratedconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryStackGeneratedconfigResponse setGeneratedConfigs(java.util.List<StackGeneratedConfig> generatedConfigs) {
        this.generatedConfigs = generatedConfigs;
        return this;
    }
    public java.util.List<StackGeneratedConfig> getGeneratedConfigs() {
        return this.generatedConfigs;
    }

}

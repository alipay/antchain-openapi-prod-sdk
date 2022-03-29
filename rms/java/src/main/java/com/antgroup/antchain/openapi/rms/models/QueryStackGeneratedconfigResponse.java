// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryStackGeneratedconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 栈配置列表
    @NameInMap("generated_configs")
    public java.util.List<StackGeneratedConfig> generatedConfigs;

    public static QueryStackGeneratedconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStackGeneratedconfigResponse self = new QueryStackGeneratedconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryStackGeneratedconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStackGeneratedconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStackGeneratedconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStackGeneratedconfigResponse setGeneratedConfigs(java.util.List<StackGeneratedConfig> generatedConfigs) {
        this.generatedConfigs = generatedConfigs;
        return this;
    }
    public java.util.List<StackGeneratedConfig> getGeneratedConfigs() {
        return this.generatedConfigs;
    }

}

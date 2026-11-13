// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模板提示词，前端可据此回填生成输入
    @NameInMap("template_prompt")
    public String templatePrompt;

    public static QueryAntcloudMarketingagentCreativeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeTemplateResponse self = new QueryAntcloudMarketingagentCreativeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingagentCreativeTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingagentCreativeTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingagentCreativeTemplateResponse setTemplatePrompt(String templatePrompt) {
        this.templatePrompt = templatePrompt;
        return this;
    }
    public String getTemplatePrompt() {
        return this.templatePrompt;
    }

}

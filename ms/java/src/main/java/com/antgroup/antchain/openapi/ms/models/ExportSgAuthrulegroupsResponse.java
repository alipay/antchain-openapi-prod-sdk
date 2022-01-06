// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ExportSgAuthrulegroupsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 鉴权规则json串
    @NameInMap("auth_rule_json")
    public String authRuleJson;

    public static ExportSgAuthrulegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportSgAuthrulegroupsResponse self = new ExportSgAuthrulegroupsResponse();
        return TeaModel.build(map, self);
    }

    public ExportSgAuthrulegroupsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExportSgAuthrulegroupsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportSgAuthrulegroupsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExportSgAuthrulegroupsResponse setAuthRuleJson(String authRuleJson) {
        this.authRuleJson = authRuleJson;
        return this;
    }
    public String getAuthRuleJson() {
        return this.authRuleJson;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantDingtokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 钉钉企业授权token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 	钉钉企业授权应用ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 钉钉企业ID
    @NameInMap("corp_id")
    @Validation(required = true)
    public String corpId;

    // 创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 前端授权ticket
    @NameInMap("js_ticket")
    @Validation(required = true)
    public String jsTicket;

    // 最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static GetTenantDingtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantDingtokenResponse self = new GetTenantDingtokenResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantDingtokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTenantDingtokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTenantDingtokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTenantDingtokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetTenantDingtokenResponse setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetTenantDingtokenResponse setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetTenantDingtokenResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTenantDingtokenResponse setJsTicket(String jsTicket) {
        this.jsTicket = jsTicket;
        return this;
    }
    public String getJsTicket() {
        return this.jsTicket;
    }

    public GetTenantDingtokenResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}

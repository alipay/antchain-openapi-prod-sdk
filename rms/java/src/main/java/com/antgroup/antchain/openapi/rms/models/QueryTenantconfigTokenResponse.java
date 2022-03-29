// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTenantconfigTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // token_config
    @NameInMap("config_value")
    public TokenConfig configValue;

    // entity_name
    @NameInMap("entity_name")
    public String entityName;

    public static QueryTenantconfigTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantconfigTokenResponse self = new QueryTenantconfigTokenResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantconfigTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTenantconfigTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTenantconfigTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTenantconfigTokenResponse setConfigValue(TokenConfig configValue) {
        this.configValue = configValue;
        return this;
    }
    public TokenConfig getConfigValue() {
        return this.configValue;
    }

    public QueryTenantconfigTokenResponse setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}

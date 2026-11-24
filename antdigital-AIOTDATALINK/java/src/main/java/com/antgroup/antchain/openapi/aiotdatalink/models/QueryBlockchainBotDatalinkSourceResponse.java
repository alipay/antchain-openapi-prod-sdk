// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotDatalinkSourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据源类型
    @NameInMap("config_type")
    public String configType;

    // 数据源别称
    @NameInMap("alias")
    public String alias;

    public static QueryBlockchainBotDatalinkSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotDatalinkSourceResponse self = new QueryBlockchainBotDatalinkSourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotDatalinkSourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotDatalinkSourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotDatalinkSourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotDatalinkSourceResponse setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryBlockchainBotDatalinkSourceResponse setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}

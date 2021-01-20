// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCloudconfigOpenapiconfigResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 配置内容
    @NameInMap("config")
    public String config;

    public static QueryCloudconfigOpenapiconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudconfigOpenapiconfigResponse self = new QueryCloudconfigOpenapiconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryCloudconfigOpenapiconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCloudconfigOpenapiconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCloudconfigOpenapiconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCloudconfigOpenapiconfigResponse setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}

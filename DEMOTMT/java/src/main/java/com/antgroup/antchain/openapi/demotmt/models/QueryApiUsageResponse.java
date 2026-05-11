// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class QueryApiUsageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // api调用量
    @NameInMap("api_usage_json")
    public String apiUsageJson;

    public static QueryApiUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiUsageResponse self = new QueryApiUsageResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiUsageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiUsageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiUsageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiUsageResponse setApiUsageJson(String apiUsageJson) {
        this.apiUsageJson = apiUsageJson;
        return this;
    }
    public String getApiUsageJson() {
        return this.apiUsageJson;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryApiDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // json
    @NameInMap("api_detail_json")
    public String apiDetailJson;

    public static QueryApiDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDetailResponse self = new QueryApiDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiDetailResponse setApiDetailJson(String apiDetailJson) {
        this.apiDetailJson = apiDetailJson;
        return this;
    }
    public String getApiDetailJson() {
        return this.apiDetailJson;
    }

}

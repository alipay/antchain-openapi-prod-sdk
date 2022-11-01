// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseAsyncencryptedinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码，OK表示成功
    @NameInMap("code")
    public String code;

    // 结果描述
    @NameInMap("message")
    public String message;

    // 对应的加密后的具体信息（只有当query_status状态为SUCCESS时才返回此数据）
    @NameInMap("response_data")
    public String responseData;

    // 链上查询状态枚举
    // TOBE_CHAIN 待上链查询
    // CHAINING 查询中
    // SUCCESS 查询成功
    // FAIL 查询失败
    @NameInMap("query_status")
    public String queryStatus;

    public static QueryLeaseAsyncencryptedinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseAsyncencryptedinfoResponse self = new QueryLeaseAsyncencryptedinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseAsyncencryptedinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseAsyncencryptedinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseAsyncencryptedinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseAsyncencryptedinfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseAsyncencryptedinfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLeaseAsyncencryptedinfoResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

    public QueryLeaseAsyncencryptedinfoResponse setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
        return this;
    }
    public String getQueryStatus() {
        return this.queryStatus;
    }

}

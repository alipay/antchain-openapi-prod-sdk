// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryAdvisormarketDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码，"0" 表示成功，非 "0" 为失败
    @NameInMap("code")
    public String code;

    // 状态描述
    @NameInMap("message")
    public String message;

    // 请求追踪ID，用于问题排查
    @NameInMap("requestid")
    public String requestid;

    // 服务端响应时间戳（毫秒）
    @NameInMap("timestamp")
    public String timestamp;

    // 业务数据 JSON 字符串，调用方需反序列化后使用，具体结构见各 type 定义
    @NameInMap("data")
    public String data;

    public static QueryAdvisormarketDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvisormarketDataResponse self = new QueryAdvisormarketDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdvisormarketDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAdvisormarketDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAdvisormarketDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAdvisormarketDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAdvisormarketDataResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAdvisormarketDataResponse setRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }
    public String getRequestid() {
        return this.requestid;
    }

    public QueryAdvisormarketDataResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryAdvisormarketDataResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}

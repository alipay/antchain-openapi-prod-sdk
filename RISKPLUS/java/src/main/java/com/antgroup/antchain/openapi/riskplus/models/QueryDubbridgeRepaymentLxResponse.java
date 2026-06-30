// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepaymentLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务返回码，001 请求成功 002 请求失败
    @NameInMap("code")
    public String code;

    // 业务返回描述
    @NameInMap("msg")
    public String msg;

    // 业务数据
    @NameInMap("biz_content")
    public String bizContent;

    // 响应时间
    @NameInMap("timestamp")
    public String timestamp;

    // 签名数据
    @NameInMap("sign")
    public String sign;

    public static QueryDubbridgeRepaymentLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepaymentLxResponse self = new QueryDubbridgeRepaymentLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepaymentLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepaymentLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepaymentLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepaymentLxResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDubbridgeRepaymentLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeRepaymentLxResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryDubbridgeRepaymentLxResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryDubbridgeRepaymentLxResponse setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}

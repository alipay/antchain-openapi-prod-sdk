// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditstatusLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信失败必填，描述具体的失败原因，用于运营分析
    @NameInMap("msg")
    public String msg;

    // 业务返回码，001 请求成功 002 请求失败
    @NameInMap("code")
    public String code;

    // 业务数据
    @NameInMap("biz_content")
    public String bizContent;

    // 响应时间
    @NameInMap("timestamp")
    public String timestamp;

    // 签名数据
    @NameInMap("sign")
    public String sign;

    public static QueryDubbridgeCreditstatusLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditstatusLxResponse self = new QueryDubbridgeCreditstatusLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditstatusLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCreditstatusLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCreditstatusLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCreditstatusLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeCreditstatusLxResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDubbridgeCreditstatusLxResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryDubbridgeCreditstatusLxResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryDubbridgeCreditstatusLxResponse setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}

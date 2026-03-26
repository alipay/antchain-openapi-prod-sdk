// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryGdFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回消息
    @NameInMap("msg")
    public String msg;

    // 返回编码，值为10000表示成功，其余值表示失败
    @NameInMap("code")
    public Long code;

    // 随机返回id
    @NameInMap("request_link_id")
    public String requestLinkId;

    // 返回数据
    @NameInMap("data")
    public GdCustomerInfo data;

    public static QueryGdFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGdFlowResponse self = new QueryGdFlowResponse();
        return TeaModel.build(map, self);
    }

    public QueryGdFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGdFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGdFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGdFlowResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryGdFlowResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryGdFlowResponse setRequestLinkId(String requestLinkId) {
        this.requestLinkId = requestLinkId;
        return this;
    }
    public String getRequestLinkId() {
        return this.requestLinkId;
    }

    public QueryGdFlowResponse setData(GdCustomerInfo data) {
        this.data = data;
        return this;
    }
    public GdCustomerInfo getData() {
        return this.data;
    }

}

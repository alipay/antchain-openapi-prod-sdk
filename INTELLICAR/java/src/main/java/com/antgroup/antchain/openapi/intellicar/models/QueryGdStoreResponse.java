// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryGdStoreResponse extends TeaModel {
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
    public String code;

    // 随即返回ID
    @NameInMap("request_link_id")
    public String requestLinkId;

    // 返回数据
    @NameInMap("data")
    public GdStoreInfo data;

    public static QueryGdStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGdStoreResponse self = new QueryGdStoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryGdStoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGdStoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGdStoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGdStoreResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryGdStoreResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGdStoreResponse setRequestLinkId(String requestLinkId) {
        this.requestLinkId = requestLinkId;
        return this;
    }
    public String getRequestLinkId() {
        return this.requestLinkId;
    }

    public QueryGdStoreResponse setData(GdStoreInfo data) {
        this.data = data;
        return this;
    }
    public GdStoreInfo getData() {
        return this.data;
    }

}

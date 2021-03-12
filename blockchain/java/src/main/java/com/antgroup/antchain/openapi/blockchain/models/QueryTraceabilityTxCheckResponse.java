// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryTraceabilityTxCheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 溯源项列表
    @NameInMap("items")
    public java.util.List<Item> items;

    // 提示信息
    @NameInMap("message")
    public String message;

    // 展现信息的副标题
    @NameInMap("sub_title")
    public String subTitle;

    // 显示查证结果的标题
    @NameInMap("title")
    public String title;

    public static QueryTraceabilityTxCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceabilityTxCheckResponse self = new QueryTraceabilityTxCheckResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceabilityTxCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceabilityTxCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceabilityTxCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceabilityTxCheckResponse setItems(java.util.List<Item> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Item> getItems() {
        return this.items;
    }

    public QueryTraceabilityTxCheckResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceabilityTxCheckResponse setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }
    public String getSubTitle() {
        return this.subTitle;
    }

    public QueryTraceabilityTxCheckResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

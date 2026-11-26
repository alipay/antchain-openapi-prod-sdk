// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotagentModelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回的模型总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 模型目录条目列表
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<OpenApiModelItem> items;

    public static ListBlockchainBotIotagentModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotagentModelResponse self = new ListBlockchainBotIotagentModelResponse();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotagentModelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBlockchainBotIotagentModelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBlockchainBotIotagentModelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBlockchainBotIotagentModelResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListBlockchainBotIotagentModelResponse setItems(java.util.List<OpenApiModelItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OpenApiModelItem> getItems() {
        return this.items;
    }

}

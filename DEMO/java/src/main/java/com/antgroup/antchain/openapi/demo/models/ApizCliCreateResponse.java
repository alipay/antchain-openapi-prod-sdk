// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ApizCliCreateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品明细
    @NameInMap("item_list")
    public java.util.List<OrderItem> itemList;

    public static ApizCliCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApizCliCreateResponse self = new ApizCliCreateResponse();
        return TeaModel.build(map, self);
    }

    public ApizCliCreateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApizCliCreateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApizCliCreateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApizCliCreateResponse setItemList(java.util.List<OrderItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<OrderItem> getItemList() {
        return this.itemList;
    }

}

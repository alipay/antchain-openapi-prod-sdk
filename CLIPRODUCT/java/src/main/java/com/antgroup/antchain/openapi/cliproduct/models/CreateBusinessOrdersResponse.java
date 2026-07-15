// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class CreateBusinessOrdersResponse extends TeaModel {
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

    public static CreateBusinessOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOrdersResponse self = new CreateBusinessOrdersResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOrdersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessOrdersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessOrdersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessOrdersResponse setItemList(java.util.List<OrderItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<OrderItem> getItemList() {
        return this.itemList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class CreateBusinessOrderhResponse extends TeaModel {
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

    public static CreateBusinessOrderhResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOrderhResponse self = new CreateBusinessOrderhResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOrderhResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessOrderhResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessOrderhResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessOrderhResponse setItemList(java.util.List<OrderItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<OrderItem> getItemList() {
        return this.itemList;
    }

}

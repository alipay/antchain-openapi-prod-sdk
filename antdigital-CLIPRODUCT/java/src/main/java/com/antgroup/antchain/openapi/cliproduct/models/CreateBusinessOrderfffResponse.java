// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class CreateBusinessOrderfffResponse extends TeaModel {
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

    public static CreateBusinessOrderfffResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOrderfffResponse self = new CreateBusinessOrderfffResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOrderfffResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessOrderfffResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessOrderfffResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessOrderfffResponse setItemList(java.util.List<OrderItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<OrderItem> getItemList() {
        return this.itemList;
    }

}

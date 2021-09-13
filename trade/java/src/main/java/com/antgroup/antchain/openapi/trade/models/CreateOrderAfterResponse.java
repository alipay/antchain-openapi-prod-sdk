// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateOrderAfterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务流水号
    @NameInMap("biz_no")
    public String bizNo;

    // 下单返回值。里面有实例id和二级订单号等关键字段。
    @NameInMap("create_order_response_list")
    public java.util.List<CreateOrderResult> createOrderResponseList;

    public static CreateOrderAfterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderAfterResponse self = new CreateOrderAfterResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderAfterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateOrderAfterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateOrderAfterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateOrderAfterResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateOrderAfterResponse setCreateOrderResponseList(java.util.List<CreateOrderResult> createOrderResponseList) {
        this.createOrderResponseList = createOrderResponseList;
        return this;
    }
    public java.util.List<CreateOrderResult> getCreateOrderResponseList() {
        return this.createOrderResponseList;
    }

}

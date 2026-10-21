// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CreateBusinessOrderzResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单列表
    @NameInMap("order_list")
    public java.util.List<OrderDTO> orderList;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static CreateBusinessOrderzResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOrderzResponse self = new CreateBusinessOrderzResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOrderzResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessOrderzResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessOrderzResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessOrderzResponse setOrderList(java.util.List<OrderDTO> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<OrderDTO> getOrderList() {
        return this.orderList;
    }

    public CreateBusinessOrderzResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecMypointsPreorderskuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数量
    @NameInMap("count")
    public Long count;

    // 业务幂等ID
    @NameInMap("order_no")
    public String orderNo;

    // 预下单Id
    @NameInMap("pre_order_id")
    public String preOrderId;

    // 商品ID
    @NameInMap("sku_id")
    public String skuId;

    // 总集分宝数量(单位:个)
    @NameInMap("total_amount")
    public Long totalAmount;

    // 总费用
    @NameInMap("total_cost")
    public String totalCost;

    // 是否需要重试
    @NameInMap("need_retry")
    public Boolean needRetry;

    public static ExecMypointsPreorderskuResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMypointsPreorderskuResponse self = new ExecMypointsPreorderskuResponse();
        return TeaModel.build(map, self);
    }

    public ExecMypointsPreorderskuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecMypointsPreorderskuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecMypointsPreorderskuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecMypointsPreorderskuResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ExecMypointsPreorderskuResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecMypointsPreorderskuResponse setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }
    public String getPreOrderId() {
        return this.preOrderId;
    }

    public ExecMypointsPreorderskuResponse setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public ExecMypointsPreorderskuResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public ExecMypointsPreorderskuResponse setTotalCost(String totalCost) {
        this.totalCost = totalCost;
        return this;
    }
    public String getTotalCost() {
        return this.totalCost;
    }

    public ExecMypointsPreorderskuResponse setNeedRetry(Boolean needRetry) {
        this.needRetry = needRetry;
        return this;
    }
    public Boolean getNeedRetry() {
        return this.needRetry;
    }

}

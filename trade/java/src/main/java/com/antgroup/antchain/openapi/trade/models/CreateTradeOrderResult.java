// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateTradeOrderResult extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>2088123412341234</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 下单时的订单号
    /**
     * <strong>example:</strong>
     * <p>2088123412341234</p>
     */
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 实例ID列表
    @NameInMap("instance_ids")
    public java.util.List<String> instanceIds;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>PAY_SUCCESS</p>
     */
    @NameInMap("pay_status")
    @Validation(required = true)
    public String payStatus;

    // 订购错误码
    /**
     * <strong>example:</strong>
     * <p>订购错误码</p>
     */
    @NameInMap("order_error_code")
    public String orderErrorCode;

    // 订购错误描述	
    /**
     * <strong>example:</strong>
     * <p>订购错误描述 </p>
     */
    @NameInMap("order_error_description")
    public String orderErrorDescription;

    public static CreateTradeOrderResult build(java.util.Map<String, ?> map) throws Exception {
        CreateTradeOrderResult self = new CreateTradeOrderResult();
        return TeaModel.build(map, self);
    }

    public CreateTradeOrderResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateTradeOrderResult setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateTradeOrderResult setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateTradeOrderResult setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public CreateTradeOrderResult setOrderErrorCode(String orderErrorCode) {
        this.orderErrorCode = orderErrorCode;
        return this;
    }
    public String getOrderErrorCode() {
        return this.orderErrorCode;
    }

    public CreateTradeOrderResult setOrderErrorDescription(String orderErrorDescription) {
        this.orderErrorDescription = orderErrorDescription;
        return this;
    }
    public String getOrderErrorDescription() {
        return this.orderErrorDescription;
    }

}

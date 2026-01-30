// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateOrderResult extends TeaModel {
    // 下单时指定的业务流水号。二级订单号
    /**
     * <strong>example:</strong>
     * <p>2088****</p>
     */
    @NameInMap("bsn_no")
    @Validation(required = true)
    public String bsnNo;

    // 一级订单号
    /**
     * <strong>example:</strong>
     * <p>2088*****</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 二级订单号
    /**
     * <strong>example:</strong>
     * <p>2088*****</p>
     */
    @NameInMap("normal_order_line_id")
    @Validation(required = true)
    public String normalOrderLineId;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>ORDER_INIT</p>
     */
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 实例列表
    /**
     * <strong>example:</strong>
     * <p>A0****</p>
     */
    @NameInMap("instance_ids")
    @Validation(required = true)
    public String instanceIds;

    // 订购错误码
    /**
     * <strong>example:</strong>
     * <p>订购错误码</p>
     */
    @NameInMap("order_error_code")
    @Validation(required = true)
    public String orderErrorCode;

    // 订购错误描述
    /**
     * <strong>example:</strong>
     * <p>订购错误描述</p>
     */
    @NameInMap("order_error_description")
    @Validation(required = true)
    public String orderErrorDescription;

    public static CreateOrderResult build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResult self = new CreateOrderResult();
        return TeaModel.build(map, self);
    }

    public CreateOrderResult setBsnNo(String bsnNo) {
        this.bsnNo = bsnNo;
        return this;
    }
    public String getBsnNo() {
        return this.bsnNo;
    }

    public CreateOrderResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateOrderResult setNormalOrderLineId(String normalOrderLineId) {
        this.normalOrderLineId = normalOrderLineId;
        return this;
    }
    public String getNormalOrderLineId() {
        return this.normalOrderLineId;
    }

    public CreateOrderResult setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public CreateOrderResult setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public CreateOrderResult setOrderErrorCode(String orderErrorCode) {
        this.orderErrorCode = orderErrorCode;
        return this;
    }
    public String getOrderErrorCode() {
        return this.orderErrorCode;
    }

    public CreateOrderResult setOrderErrorDescription(String orderErrorDescription) {
        this.orderErrorDescription = orderErrorDescription;
        return this;
    }
    public String getOrderErrorDescription() {
        return this.orderErrorDescription;
    }

}

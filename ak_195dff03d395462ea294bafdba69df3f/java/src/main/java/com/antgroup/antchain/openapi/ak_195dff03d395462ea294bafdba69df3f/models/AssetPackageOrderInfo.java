// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class AssetPackageOrderInfo extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 出包原因
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("out_reason")
    public String outReason;

    // 订单用信额度
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("order_credit_line")
    public Long orderCreditLine;

    // 商户应还款金额
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("order_merchant_repayment_money")
    public Long orderMerchantRepaymentMoney;

    // 订单分账起始账期
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("divide_start_term_index")
    public Long divideStartTermIndex;

    public static AssetPackageOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        AssetPackageOrderInfo self = new AssetPackageOrderInfo();
        return TeaModel.build(map, self);
    }

    public AssetPackageOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AssetPackageOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AssetPackageOrderInfo setOutReason(String outReason) {
        this.outReason = outReason;
        return this;
    }
    public String getOutReason() {
        return this.outReason;
    }

    public AssetPackageOrderInfo setOrderCreditLine(Long orderCreditLine) {
        this.orderCreditLine = orderCreditLine;
        return this;
    }
    public Long getOrderCreditLine() {
        return this.orderCreditLine;
    }

    public AssetPackageOrderInfo setOrderMerchantRepaymentMoney(Long orderMerchantRepaymentMoney) {
        this.orderMerchantRepaymentMoney = orderMerchantRepaymentMoney;
        return this;
    }
    public Long getOrderMerchantRepaymentMoney() {
        return this.orderMerchantRepaymentMoney;
    }

    public AssetPackageOrderInfo setDivideStartTermIndex(Long divideStartTermIndex) {
        this.divideStartTermIndex = divideStartTermIndex;
        return this;
    }
    public Long getDivideStartTermIndex() {
        return this.divideStartTermIndex;
    }

}

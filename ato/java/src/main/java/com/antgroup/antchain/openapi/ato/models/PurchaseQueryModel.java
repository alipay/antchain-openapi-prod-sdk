// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PurchaseQueryModel extends TeaModel {
    // 支付宝外部交易号
    /**
     * <strong>example:</strong>
     * <p>202304xxxxxxxxxx</p>
     */
    @NameInMap("out_order_no")
    @Validation(maxLength = 128, minLength = 1)
    public String outOrderNo;

    // 支付宝内部生成的交易号
    /**
     * <strong>example:</strong>
     * <p>20230426xxxxxxxxxx</p>
     */
    @NameInMap("order_no")
    @Validation(maxLength = 50, minLength = 1)
    public String orderNo;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>6228xxxxxxxxxxxxx13</p>
     */
    @NameInMap("bank_card_no")
    @Validation(maxLength = 52, minLength = 1)
    public String bankCardNo;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>杭州贸易有限公司</p>
     */
    @NameInMap("company_name")
    @Validation(maxLength = 50, minLength = 1)
    public String companyName;

    // 金额，用户购买或使用服务时产生的具体金额，单位：分
    /**
     * <strong>example:</strong>
     * <p>6657</p>
     */
    @NameInMap("sales_amount")
    @Validation(maximum = 10000000, minimum = 1)
    public Long salesAmount;

    public static PurchaseQueryModel build(java.util.Map<String, ?> map) throws Exception {
        PurchaseQueryModel self = new PurchaseQueryModel();
        return TeaModel.build(map, self);
    }

    public PurchaseQueryModel setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public PurchaseQueryModel setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public PurchaseQueryModel setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public PurchaseQueryModel setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public PurchaseQueryModel setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
        return this;
    }
    public Long getSalesAmount() {
        return this.salesAmount;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ReturnInvoiceInfo extends TeaModel {
    // 发票ID
    /**
     * <strong>example:</strong>
     * <p>33445566556</p>
     */
    @NameInMap("invoice_id")
    @Validation(required = true)
    public String invoiceId;

    // 退换票类型,01:退票 02:换票
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("return_order_type")
    @Validation(required = true)
    public String returnOrderType;

    // 退换票原因类型, 01：发票介质修改  02：发票类型修改  03：发票信息修改 05：其他 06：不需要发票
    /**
     * <strong>example:</strong>
     * <p>06</p>
     */
    @NameInMap("return_reason_type")
    @Validation(required = true)
    public String returnReasonType;

    // 备注
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("memo")
    public String memo;

    // 快递单号
    /**
     * <strong>example:</strong>
     * <p>3444</p>
     */
    @NameInMap("tracking_no")
    public String trackingNo;

    // 快递公司名称
    /**
     * <strong>example:</strong>
     * <p>XX快递</p>
     */
    @NameInMap("express_company_name")
    public String expressCompanyName;

    // 是否认证，1：已认证抵扣 0：未认证抵扣
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("auth")
    public String auth;

    public static ReturnInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
        ReturnInvoiceInfo self = new ReturnInvoiceInfo();
        return TeaModel.build(map, self);
    }

    public ReturnInvoiceInfo setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public String getInvoiceId() {
        return this.invoiceId;
    }

    public ReturnInvoiceInfo setReturnOrderType(String returnOrderType) {
        this.returnOrderType = returnOrderType;
        return this;
    }
    public String getReturnOrderType() {
        return this.returnOrderType;
    }

    public ReturnInvoiceInfo setReturnReasonType(String returnReasonType) {
        this.returnReasonType = returnReasonType;
        return this;
    }
    public String getReturnReasonType() {
        return this.returnReasonType;
    }

    public ReturnInvoiceInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ReturnInvoiceInfo setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
        return this;
    }
    public String getTrackingNo() {
        return this.trackingNo;
    }

    public ReturnInvoiceInfo setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
        return this;
    }
    public String getExpressCompanyName() {
        return this.expressCompanyName;
    }

    public ReturnInvoiceInfo setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

}

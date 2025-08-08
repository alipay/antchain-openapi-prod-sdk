// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ReceiptTariffInfo extends TeaModel {
    // 托运单号 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("order_no")
    public String orderNo;

    // 应收资费项code [业务必填]
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_code")
    public String receiptTariffCode;

    // 应收资费项项目 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_project")
    public String receiptTariffProject;

    // 资费项中文描述 [业务必填]
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_desc")
    public String receiptTariffDesc;

    // 币种 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    public String currency;

    // 资费项含税价 [业务必填]
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("price_including_tax")
    public String priceIncludingTax;

    // 订舱单唯一标识 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("booking_no")
    public String bookingNo;

    // 订舱号 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("bkg_no")
    public String bkgNo;

    public static ReceiptTariffInfo build(java.util.Map<String, ?> map) throws Exception {
        ReceiptTariffInfo self = new ReceiptTariffInfo();
        return TeaModel.build(map, self);
    }

    public ReceiptTariffInfo setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ReceiptTariffInfo setReceiptTariffCode(String receiptTariffCode) {
        this.receiptTariffCode = receiptTariffCode;
        return this;
    }
    public String getReceiptTariffCode() {
        return this.receiptTariffCode;
    }

    public ReceiptTariffInfo setReceiptTariffProject(String receiptTariffProject) {
        this.receiptTariffProject = receiptTariffProject;
        return this;
    }
    public String getReceiptTariffProject() {
        return this.receiptTariffProject;
    }

    public ReceiptTariffInfo setReceiptTariffDesc(String receiptTariffDesc) {
        this.receiptTariffDesc = receiptTariffDesc;
        return this;
    }
    public String getReceiptTariffDesc() {
        return this.receiptTariffDesc;
    }

    public ReceiptTariffInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ReceiptTariffInfo setPriceIncludingTax(String priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
        return this;
    }
    public String getPriceIncludingTax() {
        return this.priceIncludingTax;
    }

    public ReceiptTariffInfo setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public ReceiptTariffInfo setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PayTariffInfo extends TeaModel {
    // 托运单号 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("order_no")
    public String orderNo;

    // 应付资费项code [业务必填]
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_code")
    public String payTariffCode;

    // 应付资费项项目 [业务必填]
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_project")
    public String payTariffProject;

    // 资费项中文描述 [业务必填]
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_desc")
    public String payTariffDesc;

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

    // 订舱单唯一性标识 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("booking_no")
    public String bookingNo;

    // 订舱单 [业务必填]
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("bkg_no")
    public String bkgNo;

    public static PayTariffInfo build(java.util.Map<String, ?> map) throws Exception {
        PayTariffInfo self = new PayTariffInfo();
        return TeaModel.build(map, self);
    }

    public PayTariffInfo setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public PayTariffInfo setPayTariffCode(String payTariffCode) {
        this.payTariffCode = payTariffCode;
        return this;
    }
    public String getPayTariffCode() {
        return this.payTariffCode;
    }

    public PayTariffInfo setPayTariffProject(String payTariffProject) {
        this.payTariffProject = payTariffProject;
        return this;
    }
    public String getPayTariffProject() {
        return this.payTariffProject;
    }

    public PayTariffInfo setPayTariffDesc(String payTariffDesc) {
        this.payTariffDesc = payTariffDesc;
        return this;
    }
    public String getPayTariffDesc() {
        return this.payTariffDesc;
    }

    public PayTariffInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PayTariffInfo setPriceIncludingTax(String priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
        return this;
    }
    public String getPriceIncludingTax() {
        return this.priceIncludingTax;
    }

    public PayTariffInfo setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public PayTariffInfo setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

}

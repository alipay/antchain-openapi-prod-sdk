// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureQuotationOffer extends TeaModel {
    // 支出配置单商品主键id
    @NameInMap("id")
    public Long id;

    // 一客一价
    @NameInMap("personal_price")
    public java.util.List<ExpenditureQuotationOfferPrice> personalPrice;

    // 外部业务单据号
    @NameInMap("out_business_no")
    public String outBusinessNo;

    // 支出订购id
    @NameInMap("arrangement_no")
    public String arrangementNo;

    public static ExpenditureQuotationOffer build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotationOffer self = new ExpenditureQuotationOffer();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotationOffer setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExpenditureQuotationOffer setPersonalPrice(java.util.List<ExpenditureQuotationOfferPrice> personalPrice) {
        this.personalPrice = personalPrice;
        return this;
    }
    public java.util.List<ExpenditureQuotationOfferPrice> getPersonalPrice() {
        return this.personalPrice;
    }

    public ExpenditureQuotationOffer setOutBusinessNo(String outBusinessNo) {
        this.outBusinessNo = outBusinessNo;
        return this;
    }
    public String getOutBusinessNo() {
        return this.outBusinessNo;
    }

    public ExpenditureQuotationOffer setArrangementNo(String arrangementNo) {
        this.arrangementNo = arrangementNo;
        return this;
    }
    public String getArrangementNo() {
        return this.arrangementNo;
    }

}

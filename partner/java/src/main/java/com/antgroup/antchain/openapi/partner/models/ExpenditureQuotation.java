// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureQuotation extends TeaModel {
    // 支出配置单商品
    @NameInMap("quotation_offers")
    public java.util.List<ExpenditureQuotationOffer> quotationOffers;

    public static ExpenditureQuotation build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotation self = new ExpenditureQuotation();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotation setQuotationOffers(java.util.List<ExpenditureQuotationOffer> quotationOffers) {
        this.quotationOffers = quotationOffers;
        return this;
    }
    public java.util.List<ExpenditureQuotationOffer> getQuotationOffers() {
        return this.quotationOffers;
    }

}

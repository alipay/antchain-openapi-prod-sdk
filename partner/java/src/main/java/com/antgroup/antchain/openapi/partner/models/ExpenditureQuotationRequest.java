// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureQuotationRequest extends TeaModel {
    // 定价模式：
    //     Standard("Standard", "标准价"),
    //     Customer("Customer", "自定义价格"),
    @NameInMap("price_mode")
    @Validation(required = true)
    public String priceMode;

    // 支出配置单对象列表
    @NameInMap("quotation_items")
    @Validation(required = true)
    public java.util.List<ExpenditureQuotationItem> quotationItems;

    public static ExpenditureQuotationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotationRequest self = new ExpenditureQuotationRequest();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotationRequest setPriceMode(String priceMode) {
        this.priceMode = priceMode;
        return this;
    }
    public String getPriceMode() {
        return this.priceMode;
    }

    public ExpenditureQuotationRequest setQuotationItems(java.util.List<ExpenditureQuotationItem> quotationItems) {
        this.quotationItems = quotationItems;
        return this;
    }
    public java.util.List<ExpenditureQuotationItem> getQuotationItems() {
        return this.quotationItems;
    }

}

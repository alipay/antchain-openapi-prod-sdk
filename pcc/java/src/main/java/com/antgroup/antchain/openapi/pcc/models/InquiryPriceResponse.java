// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class InquiryPriceResponse extends TeaModel {
    // 高精度12位价格
    @NameInMap("price")
    public String price;

    // 币种
    @NameInMap("currency")
    public String currency;

    // BD销售价格(高精度12位)
    @NameInMap("bd_price")
    public String bdPrice;

    // 最低成本价(高精度12位)
    @NameInMap("cost_price")
    public String costPrice;

    // 收费项结果明细列表
    @NameInMap("price_object_fee_list")
    public java.util.List<PriceObjectFee> priceObjectFeeList;

    public static InquiryPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        InquiryPriceResponse self = new InquiryPriceResponse();
        return TeaModel.build(map, self);
    }

    public InquiryPriceResponse setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public InquiryPriceResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public InquiryPriceResponse setBdPrice(String bdPrice) {
        this.bdPrice = bdPrice;
        return this;
    }
    public String getBdPrice() {
        return this.bdPrice;
    }

    public InquiryPriceResponse setCostPrice(String costPrice) {
        this.costPrice = costPrice;
        return this;
    }
    public String getCostPrice() {
        return this.costPrice;
    }

    public InquiryPriceResponse setPriceObjectFeeList(java.util.List<PriceObjectFee> priceObjectFeeList) {
        this.priceObjectFeeList = priceObjectFeeList;
        return this;
    }
    public java.util.List<PriceObjectFee> getPriceObjectFeeList() {
        return this.priceObjectFeeList;
    }

}

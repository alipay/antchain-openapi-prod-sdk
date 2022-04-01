// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class MarketInfo extends TeaModel {
    // 市场逻辑
    @NameInMap("market_logic")
    public String marketLogic;

    // 潜客接受度
    @NameInMap("acceptance_details")
    public java.util.List<AcceptanceDetail> acceptanceDetails;

    // 基于竞品及加成
    @NameInMap("addition_details")
    public java.util.List<AdditionDetail> additionDetails;

    public static MarketInfo build(java.util.Map<String, ?> map) throws Exception {
        MarketInfo self = new MarketInfo();
        return TeaModel.build(map, self);
    }

    public MarketInfo setMarketLogic(String marketLogic) {
        this.marketLogic = marketLogic;
        return this;
    }
    public String getMarketLogic() {
        return this.marketLogic;
    }

    public MarketInfo setAcceptanceDetails(java.util.List<AcceptanceDetail> acceptanceDetails) {
        this.acceptanceDetails = acceptanceDetails;
        return this;
    }
    public java.util.List<AcceptanceDetail> getAcceptanceDetails() {
        return this.acceptanceDetails;
    }

    public MarketInfo setAdditionDetails(java.util.List<AdditionDetail> additionDetails) {
        this.additionDetails = additionDetails;
        return this;
    }
    public java.util.List<AdditionDetail> getAdditionDetails() {
        return this.additionDetails;
    }

}

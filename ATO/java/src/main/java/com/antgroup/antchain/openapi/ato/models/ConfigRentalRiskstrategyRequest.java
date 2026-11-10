// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ConfigRentalRiskstrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 短租风控策略
    @NameInMap("rental_strategy_list")
    @Validation(required = true)
    public java.util.List<RentalRiskStrategy> rentalStrategyList;

    public static ConfigRentalRiskstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigRentalRiskstrategyRequest self = new ConfigRentalRiskstrategyRequest();
        return TeaModel.build(map, self);
    }

    public ConfigRentalRiskstrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfigRentalRiskstrategyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfigRentalRiskstrategyRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ConfigRentalRiskstrategyRequest setRentalStrategyList(java.util.List<RentalRiskStrategy> rentalStrategyList) {
        this.rentalStrategyList = rentalStrategyList;
        return this;
    }
    public java.util.List<RentalRiskStrategy> getRentalStrategyList() {
        return this.rentalStrategyList;
    }

}

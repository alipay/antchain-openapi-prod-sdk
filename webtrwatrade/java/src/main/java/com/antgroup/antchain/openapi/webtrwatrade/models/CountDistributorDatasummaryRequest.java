// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class CountDistributorDatasummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 币种（目前支持USD、HKD）
    @NameInMap("currency")
    public String currency;

    public static CountDistributorDatasummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDistributorDatasummaryRequest self = new CountDistributorDatasummaryRequest();
        return TeaModel.build(map, self);
    }

    public CountDistributorDatasummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountDistributorDatasummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountDistributorDatasummaryRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class PushMarketingConversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品转化记录列表，必填，至少包含1条记录，批次内 biz_id 不得重复。
    @NameInMap("conversion_list")
    @Validation(required = true)
    public java.util.List<MarketingConversionItem> conversionList;

    public static PushMarketingConversionRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMarketingConversionRequest self = new PushMarketingConversionRequest();
        return TeaModel.build(map, self);
    }

    public PushMarketingConversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMarketingConversionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushMarketingConversionRequest setConversionList(java.util.List<MarketingConversionItem> conversionList) {
        this.conversionList = conversionList;
        return this;
    }
    public java.util.List<MarketingConversionItem> getConversionList() {
        return this.conversionList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class ExportCommodityConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    public static ExportCommodityConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCommodityConfigRequest self = new ExportCommodityConfigRequest();
        return TeaModel.build(map, self);
    }

    public ExportCommodityConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportCommodityConfigRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}

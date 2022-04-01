// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class BindCommodityAccessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 服务接入码
    @NameInMap("access_code")
    @Validation(required = true)
    public String accessCode;

    public static BindCommodityAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCommodityAccessRequest self = new BindCommodityAccessRequest();
        return TeaModel.build(map, self);
    }

    public BindCommodityAccessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCommodityAccessRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public BindCommodityAccessRequest setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboOptionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐版本唯一版本号，有值则优先使用
    @NameInMap("vid")
    @Validation(required = true)
    public String vid;

    // 销售主体（如ZL6、ZL7）
    @NameInMap("ou")
    public String ou;

    // 购买租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 售卖市场
    @NameInMap("market_type")
    public String marketType;

    public static QueryComboOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComboOptionsRequest self = new QueryComboOptionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryComboOptionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComboOptionsRequest setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public String getVid() {
        return this.vid;
    }

    public QueryComboOptionsRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public QueryComboOptionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryComboOptionsRequest setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }
    public String getMarketType() {
        return this.marketType;
    }

}

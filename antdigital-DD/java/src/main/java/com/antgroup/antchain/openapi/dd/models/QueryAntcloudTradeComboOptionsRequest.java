// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudTradeComboOptionsRequest extends TeaModel {
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

    public static QueryAntcloudTradeComboOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudTradeComboOptionsRequest self = new QueryAntcloudTradeComboOptionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudTradeComboOptionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudTradeComboOptionsRequest setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public String getVid() {
        return this.vid;
    }

    public QueryAntcloudTradeComboOptionsRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public QueryAntcloudTradeComboOptionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudTradeComboOptionsRequest setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }
    public String getMarketType() {
        return this.marketType;
    }

}

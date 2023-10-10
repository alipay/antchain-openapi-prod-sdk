// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PriceStrategy extends TeaModel {
    // 继承租户在商品下的价格
    @NameInMap("follow_tenant_id")
    public String followTenantId;

    public static PriceStrategy build(java.util.Map<String, ?> map) throws Exception {
        PriceStrategy self = new PriceStrategy();
        return TeaModel.build(map, self);
    }

    public PriceStrategy setFollowTenantId(String followTenantId) {
        this.followTenantId = followTenantId;
        return this;
    }
    public String getFollowTenantId() {
        return this.followTenantId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class MyChainInfo extends TeaModel {
    // 链id
    /**
     * <strong>example:</strong>
     * <p>xxxid</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 授权租户id
    /**
     * <strong>example:</strong>
     * <p>tenantID</p>
     */
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static MyChainInfo build(java.util.Map<String, ?> map) throws Exception {
        MyChainInfo self = new MyChainInfo();
        return TeaModel.build(map, self);
    }

    public MyChainInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public MyChainInfo setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}

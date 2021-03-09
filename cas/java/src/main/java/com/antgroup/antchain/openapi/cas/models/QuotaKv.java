// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuotaKv extends TeaModel {
    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // quota
    @NameInMap("quota")
    @Validation(required = true)
    public Long quota;

    public static QuotaKv build(java.util.Map<String, ?> map) throws Exception {
        QuotaKv self = new QuotaKv();
        return TeaModel.build(map, self);
    }

    public QuotaKv setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QuotaKv setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

}

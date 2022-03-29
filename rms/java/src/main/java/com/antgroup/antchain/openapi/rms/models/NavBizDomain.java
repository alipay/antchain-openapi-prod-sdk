// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NavBizDomain extends TeaModel {
    // biz_domain
    @NameInMap("biz_domain")
    @Validation(required = true)
    public BizDomain bizDomain;

    public static NavBizDomain build(java.util.Map<String, ?> map) throws Exception {
        NavBizDomain self = new NavBizDomain();
        return TeaModel.build(map, self);
    }

    public NavBizDomain setBizDomain(BizDomain bizDomain) {
        this.bizDomain = bizDomain;
        return this;
    }
    public BizDomain getBizDomain() {
        return this.bizDomain;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyConnPoolConfig extends TeaModel {
    // 最大连接数
    @NameInMap("max_req")
    public Long maxReq;

    public static TransparentProxyConnPoolConfig build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyConnPoolConfig self = new TransparentProxyConnPoolConfig();
        return TeaModel.build(map, self);
    }

    public TransparentProxyConnPoolConfig setMaxReq(Long maxReq) {
        this.maxReq = maxReq;
        return this;
    }
    public Long getMaxReq() {
        return this.maxReq;
    }

}

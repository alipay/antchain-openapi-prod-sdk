// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyAppConfig extends TeaModel {
    // 黑名单配置
    @NameInMap("blacklist")
    @Validation(required = true)
    public TransparentProxyRuleConfig blacklist;

    public static TransparentProxyAppConfig build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyAppConfig self = new TransparentProxyAppConfig();
        return TeaModel.build(map, self);
    }

    public TransparentProxyAppConfig setBlacklist(TransparentProxyRuleConfig blacklist) {
        this.blacklist = blacklist;
        return this;
    }
    public TransparentProxyRuleConfig getBlacklist() {
        return this.blacklist;
    }

}

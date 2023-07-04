// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SiteInfo extends TeaModel {
    // 站点名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 站点code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static SiteInfo build(java.util.Map<String, ?> map) throws Exception {
        SiteInfo self = new SiteInfo();
        return TeaModel.build(map, self);
    }

    public SiteInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SiteInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}

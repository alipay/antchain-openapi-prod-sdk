// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SiteWithDrm extends TeaModel {
    // 站点名称
    @NameInMap("site_name")
    @Validation(required = true)
    public String siteName;

    // 端点
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // ldc
    @NameInMap("ldcs")
    @Validation(required = true)
    public java.util.List<String> ldcs;

    public static SiteWithDrm build(java.util.Map<String, ?> map) throws Exception {
        SiteWithDrm self = new SiteWithDrm();
        return TeaModel.build(map, self);
    }

    public SiteWithDrm setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public SiteWithDrm setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SiteWithDrm setLdcs(java.util.List<String> ldcs) {
        this.ldcs = ldcs;
        return this;
    }
    public java.util.List<String> getLdcs() {
        return this.ldcs;
    }

}

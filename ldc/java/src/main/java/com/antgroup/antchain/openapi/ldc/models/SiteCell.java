// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SiteCell extends TeaModel {
    // 异构机房名
    @NameInMap("site_name")
    @Validation(required = true)
    public String siteName;

    // 部署单元名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    public static SiteCell build(java.util.Map<String, ?> map) throws Exception {
        SiteCell self = new SiteCell();
        return TeaModel.build(map, self);
    }

    public SiteCell setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public SiteCell setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SiteCell setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}

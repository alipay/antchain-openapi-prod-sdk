// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class SiteInfo extends TeaModel {
    // 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
    @NameInMap("site_type")
    @Validation(required = true)
    public String siteType;

    // 站点名称
    @NameInMap("site_name")
    public String siteName;

    // 站点地址
    @NameInMap("site_url")
    @Validation(required = true)
    public String siteUrl;

    public static SiteInfo build(java.util.Map<String, ?> map) throws Exception {
        SiteInfo self = new SiteInfo();
        return TeaModel.build(map, self);
    }

    public SiteInfo setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public SiteInfo setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public SiteInfo setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }
    public String getSiteUrl() {
        return this.siteUrl;
    }

}

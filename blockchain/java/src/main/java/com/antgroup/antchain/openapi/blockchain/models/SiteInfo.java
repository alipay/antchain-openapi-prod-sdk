// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SiteInfo extends TeaModel {
    // 网站类型
    /**
     * <strong>example:</strong>
     * <p>06</p>
     */
    @NameInMap("site_type")
    @Validation(required = true)
    public String siteType;

    // 站点地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://open.alipay.com">https://open.alipay.com</a></p>
     */
    @NameInMap("site_url")
    @Validation(required = true)
    public String siteUrl;

    // 站点名称
    /**
     * <strong>example:</strong>
     * <p>XXX网站</p>
     */
    @NameInMap("site_name")
    @Validation(required = true)
    public String siteName;

    // 小程序 appId
    /**
     * <strong>example:</strong>
     * <p>2021004105652035</p>
     */
    @NameInMap("tiny_app_id")
    @Validation(required = true)
    public String tinyAppId;

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

    public SiteInfo setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }
    public String getSiteUrl() {
        return this.siteUrl;
    }

    public SiteInfo setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public SiteInfo setTinyAppId(String tinyAppId) {
        this.tinyAppId = tinyAppId;
        return this;
    }
    public String getTinyAppId() {
        return this.tinyAppId;
    }

}

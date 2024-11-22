// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SiteInfo extends TeaModel {
    // 小程序id
    @NameInMap("tiny_app_id")
    public String tinyAppId;

    // 站点名称
    @NameInMap("site_name")
    public String siteName;

    // 
    // 截图照片
    @NameInMap("screenshot_file")
    public FileInfo screenshotFile;

    // 站点地址
    @NameInMap("site_url")
    public String siteUrl;

    // 站点类型
    // 网站: 01
    // APP: 02
    // 服务窗: 03
    // 公众号: 04
    // 其他: 05
    // 支付宝小程序: 06
    // 手机网站/H5: 07
    @NameInMap("site_type")
    public String siteType;

    public static SiteInfo build(java.util.Map<String, ?> map) throws Exception {
        SiteInfo self = new SiteInfo();
        return TeaModel.build(map, self);
    }

    public SiteInfo setTinyAppId(String tinyAppId) {
        this.tinyAppId = tinyAppId;
        return this;
    }
    public String getTinyAppId() {
        return this.tinyAppId;
    }

    public SiteInfo setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public SiteInfo setScreenshotFile(FileInfo screenshotFile) {
        this.screenshotFile = screenshotFile;
        return this;
    }
    public FileInfo getScreenshotFile() {
        return this.screenshotFile;
    }

    public SiteInfo setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }
    public String getSiteUrl() {
        return this.siteUrl;
    }

    public SiteInfo setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

}

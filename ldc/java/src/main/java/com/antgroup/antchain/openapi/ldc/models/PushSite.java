// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PushSite extends TeaModel {
    // 是否当前站点
    @NameInMap("current")
    @Validation(required = true)
    public Boolean current;

    // 站点描述
    @NameInMap("description")
    public String description;

    // 站点唯一标识
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 接口类型，可选（RPC，REST）
    @NameInMap("interface_type")
    @Validation(required = true)
    public String interfaceType;

    // 站点 DRM endpoints
    @NameInMap("interface_urls")
    public java.util.List<String> interfaceUrls;

    // 站点名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 站点部署单元
    @NameInMap("site_cells")
    public java.util.List<SiteCell> siteCells;

    // 站点类型，可选（MAIN，ISOMERISM）
    @NameInMap("site_type")
    @Validation(required = true)
    public String siteType;

    public static PushSite build(java.util.Map<String, ?> map) throws Exception {
        PushSite self = new PushSite();
        return TeaModel.build(map, self);
    }

    public PushSite setCurrent(Boolean current) {
        this.current = current;
        return this;
    }
    public Boolean getCurrent() {
        return this.current;
    }

    public PushSite setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PushSite setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PushSite setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public PushSite setInterfaceUrls(java.util.List<String> interfaceUrls) {
        this.interfaceUrls = interfaceUrls;
        return this;
    }
    public java.util.List<String> getInterfaceUrls() {
        return this.interfaceUrls;
    }

    public PushSite setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushSite setSiteCells(java.util.List<SiteCell> siteCells) {
        this.siteCells = siteCells;
        return this;
    }
    public java.util.List<SiteCell> getSiteCells() {
        return this.siteCells;
    }

    public PushSite setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

}

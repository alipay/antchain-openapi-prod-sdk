// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProductDeployInitOption extends TeaModel {
    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 产品实例名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 多个产品实例时，本产品的发布顺序
    @NameInMap("release_order")
    @Validation(required = true)
    public Long releaseOrder;

    // 产品内应用分部署配置
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<AppDeployInitOption> apps;

    public static ProductDeployInitOption build(java.util.Map<String, ?> map) throws Exception {
        ProductDeployInitOption self = new ProductDeployInitOption();
        return TeaModel.build(map, self);
    }

    public ProductDeployInitOption setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ProductDeployInitOption setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProductDeployInitOption setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ProductDeployInitOption setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public ProductDeployInitOption setReleaseOrder(Long releaseOrder) {
        this.releaseOrder = releaseOrder;
        return this;
    }
    public Long getReleaseOrder() {
        return this.releaseOrder;
    }

    public ProductDeployInitOption setApps(java.util.List<AppDeployInitOption> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<AppDeployInitOption> getApps() {
        return this.apps;
    }

}

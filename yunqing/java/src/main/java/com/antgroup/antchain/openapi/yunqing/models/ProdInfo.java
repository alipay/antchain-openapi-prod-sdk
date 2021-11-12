// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProdInfo extends TeaModel {
    // 应用实例信息
    @NameInMap("app_infos")
    @Validation(required = true)
    public java.util.List<AppInfo> appInfos;

    // 产品名
    @NameInMap("prod_name")
    @Validation(required = true)
    public String prodName;

    // prod version
    @NameInMap("prod_version")
    @Validation(required = true)
    public String prodVersion;

    public static ProdInfo build(java.util.Map<String, ?> map) throws Exception {
        ProdInfo self = new ProdInfo();
        return TeaModel.build(map, self);
    }

    public ProdInfo setAppInfos(java.util.List<AppInfo> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<AppInfo> getAppInfos() {
        return this.appInfos;
    }

    public ProdInfo setProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }
    public String getProdName() {
        return this.prodName;
    }

    public ProdInfo setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

}

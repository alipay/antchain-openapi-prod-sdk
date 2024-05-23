// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ApplicationInfo extends TeaModel {
    // 应用场景
    // MINI_APP 小程序
    // APP 自有app
    // ALL 两种都有
    @NameInMap("application_scene")
    @Validation(required = true)
    public String applicationScene;

    // 小程序id
    @NameInMap("tiny_app_id")
    @Validation(required = true)
    public String tinyAppId;

    // 小程序名称
    @NameInMap("site_name")
    @Validation(required = true)
    public String siteName;

    // 网站地址
    @NameInMap("sit_url")
    @Validation(required = true)
    public String sitUrl;

    // 商户名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 商户服务名称
    @NameInMap("merchant_service_name")
    @Validation(required = true)
    public String merchantServiceName;

    // 商户服务描述
    @NameInMap("merchant_service_desc")
    @Validation(required = true)
    public String merchantServiceDesc;

    public static ApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
        ApplicationInfo self = new ApplicationInfo();
        return TeaModel.build(map, self);
    }

    public ApplicationInfo setApplicationScene(String applicationScene) {
        this.applicationScene = applicationScene;
        return this;
    }
    public String getApplicationScene() {
        return this.applicationScene;
    }

    public ApplicationInfo setTinyAppId(String tinyAppId) {
        this.tinyAppId = tinyAppId;
        return this;
    }
    public String getTinyAppId() {
        return this.tinyAppId;
    }

    public ApplicationInfo setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ApplicationInfo setSitUrl(String sitUrl) {
        this.sitUrl = sitUrl;
        return this;
    }
    public String getSitUrl() {
        return this.sitUrl;
    }

    public ApplicationInfo setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public ApplicationInfo setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    public ApplicationInfo setMerchantServiceDesc(String merchantServiceDesc) {
        this.merchantServiceDesc = merchantServiceDesc;
        return this;
    }
    public String getMerchantServiceDesc() {
        return this.merchantServiceDesc;
    }

}

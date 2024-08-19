// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ApplicationInfoUpdate extends TeaModel {
    // 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
    @NameInMap("application_scene")
    public String applicationScene;

    // 小程序id
    @NameInMap("tiny_app_id")
    public String tinyAppId;

    // 小程序名称
    @NameInMap("site_name")
    public String siteName;

    // http://asdasas.com
    @NameInMap("sit_url")
    public String sitUrl;

    // 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
    @NameInMap("merchant_name")
    public String merchantName;

    // 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
    @NameInMap("merchant_service_name")
    public String merchantServiceName;

    // 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
    @NameInMap("merchant_service_desc")
    public String merchantServiceDesc;

    public static ApplicationInfoUpdate build(java.util.Map<String, ?> map) throws Exception {
        ApplicationInfoUpdate self = new ApplicationInfoUpdate();
        return TeaModel.build(map, self);
    }

    public ApplicationInfoUpdate setApplicationScene(String applicationScene) {
        this.applicationScene = applicationScene;
        return this;
    }
    public String getApplicationScene() {
        return this.applicationScene;
    }

    public ApplicationInfoUpdate setTinyAppId(String tinyAppId) {
        this.tinyAppId = tinyAppId;
        return this;
    }
    public String getTinyAppId() {
        return this.tinyAppId;
    }

    public ApplicationInfoUpdate setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ApplicationInfoUpdate setSitUrl(String sitUrl) {
        this.sitUrl = sitUrl;
        return this;
    }
    public String getSitUrl() {
        return this.sitUrl;
    }

    public ApplicationInfoUpdate setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public ApplicationInfoUpdate setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    public ApplicationInfoUpdate setMerchantServiceDesc(String merchantServiceDesc) {
        this.merchantServiceDesc = merchantServiceDesc;
        return this;
    }
    public String getMerchantServiceDesc() {
        return this.merchantServiceDesc;
    }

}

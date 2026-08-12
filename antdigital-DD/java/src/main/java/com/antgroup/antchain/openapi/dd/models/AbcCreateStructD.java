// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcCreateStructD extends TeaModel {
    // 应用场景（payChannel =JDPAY仅支持MINI_APP） MINI_APP 小程序 APP 自有app ALL 两种都有
    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("application_scene")
    public String applicationScene;

    // 小程序id
    /**
     * <strong>example:</strong>
     * <p>小程序id</p>
     */
    @NameInMap("tiny_app_id")
    public String tinyAppId;

    // 小程序名称
    /**
     * <strong>example:</strong>
     * <p>xx小程序</p>
     */
    @NameInMap("site_name")
    public String siteName;

    // 网站地址（pay_channel=ALIPAY必填）
    /**
     * <strong>example:</strong>
     * <p><a href="http://asdasas.com">http://asdasas.com</a></p>
     */
    @NameInMap("sit_url")
    public String sitUrl;

    // 商户名称。（pay_channel=ALIPAY必填） 修改后的商户名称，将同步支付宝代扣签约页面字段展示
    /**
     * <strong>example:</strong>
     * <p>xx商户</p>
     */
    @NameInMap("merchant_name")
    public String merchantName;

    // 商户服务名称。（pay_channel=ALIPAY必填） 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
    /**
     * <strong>example:</strong>
     * <p>xx商户服务</p>
     */
    @NameInMap("merchant_service_name")
    public String merchantServiceName;

    public static AbcCreateStructD build(java.util.Map<String, ?> map) throws Exception {
        AbcCreateStructD self = new AbcCreateStructD();
        return TeaModel.build(map, self);
    }

    public AbcCreateStructD setApplicationScene(String applicationScene) {
        this.applicationScene = applicationScene;
        return this;
    }
    public String getApplicationScene() {
        return this.applicationScene;
    }

    public AbcCreateStructD setTinyAppId(String tinyAppId) {
        this.tinyAppId = tinyAppId;
        return this;
    }
    public String getTinyAppId() {
        return this.tinyAppId;
    }

    public AbcCreateStructD setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public AbcCreateStructD setSitUrl(String sitUrl) {
        this.sitUrl = sitUrl;
        return this;
    }
    public String getSitUrl() {
        return this.sitUrl;
    }

    public AbcCreateStructD setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public AbcCreateStructD setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

}

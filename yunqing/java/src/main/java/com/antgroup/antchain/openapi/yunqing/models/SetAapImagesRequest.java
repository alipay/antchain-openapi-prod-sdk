// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SetAapImagesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用镜像，默认使用amd64
    @NameInMap("images")
    @Validation(required = true)
    public ApplicationImage images;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // siteCode
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 产品code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品实例名称
    @NameInMap("product_instance_name")
    @Validation(required = true)
    public String productInstanceName;

    // 应用code
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    public static SetAapImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAapImagesRequest self = new SetAapImagesRequest();
        return TeaModel.build(map, self);
    }

    public SetAapImagesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetAapImagesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetAapImagesRequest setImages(ApplicationImage images) {
        this.images = images;
        return this;
    }
    public ApplicationImage getImages() {
        return this.images;
    }

    public SetAapImagesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SetAapImagesRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SetAapImagesRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SetAapImagesRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

    public SetAapImagesRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

}

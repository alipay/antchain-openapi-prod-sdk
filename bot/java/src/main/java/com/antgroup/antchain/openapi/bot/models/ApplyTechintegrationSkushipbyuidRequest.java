// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ApplyTechintegrationSkushipbyuidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品名称
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // 产品型号
    @NameInMap("sku_model")
    @Validation(required = true)
    public String skuModel;

    // 产品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 安全方案
    // 
    @NameInMap("security_mechanism")
    @Validation(required = true)
    public String securityMechanism;

    // 证书类型
    // 
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 凭证种类
    // 
    @NameInMap("features")
    @Validation(required = true)
    public java.util.List<String> features;

    // 设备唯一编码类型
    @NameInMap("uid_type")
    @Validation(required = true)
    public String uidType;

    // 设备唯一编码值
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static ApplyTechintegrationSkushipbyuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTechintegrationSkushipbyuidRequest self = new ApplyTechintegrationSkushipbyuidRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTechintegrationSkushipbyuidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTechintegrationSkushipbyuidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyTechintegrationSkushipbyuidRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public ApplyTechintegrationSkushipbyuidRequest setSkuModel(String skuModel) {
        this.skuModel = skuModel;
        return this;
    }
    public String getSkuModel() {
        return this.skuModel;
    }

    public ApplyTechintegrationSkushipbyuidRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ApplyTechintegrationSkushipbyuidRequest setSecurityMechanism(String securityMechanism) {
        this.securityMechanism = securityMechanism;
        return this;
    }
    public String getSecurityMechanism() {
        return this.securityMechanism;
    }

    public ApplyTechintegrationSkushipbyuidRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ApplyTechintegrationSkushipbyuidRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public ApplyTechintegrationSkushipbyuidRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

    public ApplyTechintegrationSkushipbyuidRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ApplyTechintegrationSkushipbyuidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}

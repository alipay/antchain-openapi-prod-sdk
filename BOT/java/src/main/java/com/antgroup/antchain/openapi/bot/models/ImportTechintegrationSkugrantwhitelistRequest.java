// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportTechintegrationSkugrantwhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品型号
    @NameInMap("sku_model")
    @Validation(required = true)
    public String skuModel;

    // 产品形态，取值范围：RTOS、TEE、Android
    @NameInMap("scheme_type")
    @Validation(required = true)
    public String schemeType;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // SN列表，单次最多100条
    @NameInMap("sn_list")
    @Validation(required = true)
    public java.util.List<String> snList;

    // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
    @NameInMap("features")
    public java.util.List<String> features;

    public static ImportTechintegrationSkugrantwhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTechintegrationSkugrantwhitelistRequest self = new ImportTechintegrationSkugrantwhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ImportTechintegrationSkugrantwhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportTechintegrationSkugrantwhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportTechintegrationSkugrantwhitelistRequest setSkuModel(String skuModel) {
        this.skuModel = skuModel;
        return this;
    }
    public String getSkuModel() {
        return this.skuModel;
    }

    public ImportTechintegrationSkugrantwhitelistRequest setSchemeType(String schemeType) {
        this.schemeType = schemeType;
        return this;
    }
    public String getSchemeType() {
        return this.schemeType;
    }

    public ImportTechintegrationSkugrantwhitelistRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ImportTechintegrationSkugrantwhitelistRequest setSnList(java.util.List<String> snList) {
        this.snList = snList;
        return this;
    }
    public java.util.List<String> getSnList() {
        return this.snList;
    }

    public ImportTechintegrationSkugrantwhitelistRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

}
